package tpfinal;
//Acho que Reposicao de estoque tem que ser uma tela "dentro" de unidade capaz 
//de pegar as informações do estoque e emitir os formularios de requisicao
//e licitacao
public class ReposicaoDeEstoque {
    
    public static void verificaMelhorOpcao(Requisicao[] req){
        
        int[] idEstoqueSuficiente = new int[req.length];
        int[] idEstoqueParcial    = new int[req.length];
        int indexS = 0, indexP = 0; //suficiente e parcial
        
        //armazena os IDs dos requerimentos que possuem estoque suficiente
        for (int i=0; i < req.length; i++){
            if (req[i].getQtdeDisponivel() >= req[i].getQtdeNecessaria()){
                idEstoqueSuficiente[indexS] = req[i].getIDrequisicao();
                indexS++;
            }else if (req[i].getQtdeDisponivel() > 0){
                idEstoqueParcial[indexP] = req[i].getIDrequisicao();
                indexP++;
            }
        }
        
        if (idEstoqueSuficiente.length > 0){
            //transferencia
            //obtem fornecedores com estoque suficiente
            Requisicao[] suficientes = new Requisicao[idEstoqueSuficiente.length];
            for (int i=0 ; i<idEstoqueSuficiente.length; i++){
                suficientes[i] = req[ idEstoqueSuficiente[i] ];
            }
            analisaTransferenciaCompleta(suficientes);
            
        }else if (idEstoqueParcial.length > 0){
            //transferencia parcial + licitacao
            //obtem fornecedores com estoque parcial
            Requisicao[] parciais = new Requisicao[idEstoqueParcial.length];
            for (int i=0 ; i<idEstoqueParcial.length; i++){
                parciais[i] = req[ idEstoqueParcial[i] ];
            }
            analisaTransferenciaParcial(parciais);
        }
        else{
            //licitacao
            //enviar uma requisicao qualquer, apenas para pegar dados de numero de produtos 
            //necessarios
            abreLicitacao(req[0]);
        }
        
    }

    private static void analisaTransferenciaCompleta(Requisicao[] suficientes) {
        
        float menorPreco = -1.f;
        int indexMenorPreco = -1;
        for (int i = 0; i < suficientes.length; i++){
            float valorTotal = calculaValorTotal(suficientes[i]);
            if (valorTotal < menorPreco){
                menorPreco = valorTotal;
                indexMenorPreco = i;
            }
        }
        fazerTransferenciaCompleta(suficientes[indexMenorPreco]);
        
    }

    private static void analisaTransferenciaParcial(Requisicao[] parciais) {
        
        float menorPreco = -1.f;
        int indexMenorPreco = -1;
        for (int i = 0; i < parciais.length; i++){
            float valorTotal = calculaValorTotal(parciais[i]);
            if (valorTotal < menorPreco){
                menorPreco = valorTotal;
                indexMenorPreco = i;
            }
        }
        fazerTransferenciaParcial(parciais[indexMenorPreco]);
        
    }

    private static float calculaValorTotal(Requisicao req) {
        
        int qtdeProdutos = 0;
        
        if(req.getQtdeDisponivel() >= req.getQtdeNecessaria()){
            qtdeProdutos = req.getQtdeNecessaria();
        }else
            qtdeProdutos = req.getQtdeDisponivel();
        
        return qtdeProdutos*req.getValorUnitario() + req.getValorFrete();
        
    }

    private static void abreLicitacao(Requisicao req) {
       //Lucas
       //Lembrar de pegar o nome do produto a partir da requisicao, e quantidadeNecessaria
        
        
    }

    private static void fazerTransferenciaParcial(Requisicao reqParcial) {
        //Hugo
        //criar tela para exibir botoes de aceitar/recusar para vendedor?
        int qtdeFaltante = reqParcial.getQtdeNecessaria() - reqParcial.getQtdeDisponivel();
        reqParcial.setQtdeNecessaria(qtdeFaltante);
        abreLicitacao(reqParcial);
        
    }

    private static void fazerTransferenciaCompleta(Requisicao reqFinal) {
        //Thiago
        reqFinal.setStatus("Transferência Solicitada.");
        //criar tela para exibir botoes de aceitar/recusar para vendedor?
        
    }
    
}
