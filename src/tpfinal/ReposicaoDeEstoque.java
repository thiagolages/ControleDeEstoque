package tpfinal;
//Acho que Reposicao de estoque tem que ser uma tela "dentro" de unidade capaz 
//de pegar as informações do estoque e emitir os formularios de requisicao

import userInterface.statusPedido;

//e licitacao
public class ReposicaoDeEstoque {
    
    
    
    public static void verificaMelhorOpcao(Requisicao[] req){
        
        int[] indexS = new int[req.length];
        int[] indexP = new int[req.length]; //suficiente e parcial
        int S = 0, P = 0; //indices de indexS e indexP
        
        System.out.println("req.length = "+req.length);
        //armazena os IDs dos requerimentos que possuem estoque suficiente
        //e dos que possuem estoque parcial
        for (int i=0; i < req.length; i++){
            System.out.println("i = "+i);
            System.out.println("Disponivel = "+req[i].getQtdeDisponivel());
            System.out.println("Necessaria = "+req[i].getQtdeNecessaria());
            if (req[i].getQtdeDisponivel() >= req[i].getQtdeNecessaria()){
                System.out.println("Entrei dentro de >=");
                indexS[S] = i;
                S++;
            }else if (req[i].getQtdeDisponivel() > 0){
                System.out.println("Entrei dentro de > 0");
                indexP[P] = i;
                P++;
            }    
        }
        System.out.println("Quantidade de totais   = "+S);
        System.out.println("Quantidade de parciais = "+P);
        //verificar qual melhor opcao de pedido
        //se numero de suficientes é maior que zero
        if (S > 0){
            //transferencia
            //obtem fornecedores com estoque suficiente
            Requisicao[] suficientes = new Requisicao[S];
            for (int i=0 ; i < S; i++){
                suficientes[i] = req[ indexS[i] ] ;
            }
            System.out.println("Indo para transf completa");
            analisaTransferenciaCompleta(suficientes);
            
        }else if (P > 0){ //se numero de parciais é maior que zero
            //transferencia parcial + licitacao
            //obtem fornecedores com estoque parcial
            Requisicao[] parciais = new Requisicao[P];
            for (int i=0 ; i < P; i++){
                parciais[i] = req[ indexP[i] ];
            }
            System.out.println("Indo para transf parcial");
            analisaTransferenciaParcial(parciais);
        }
        else{
            //licitacao
            //enviar uma requisicao qualquer, apenas para pegar dados de numero 
            //de produtos necessarios
            System.out.println("Indo para licitacao");
            abreLicitacao(req[0]);
        }
        
    }

    private static void analisaTransferenciaCompleta(Requisicao[] suficientes) {
        
        float menorPreco = 100000000.f;
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
        
        float menorPreco = 100000000.f;
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
        
        System.out.println("FAZ NADA ROGERIN");
    }

    private static void fazerTransferenciaCompleta(Requisicao reqFinal) {
        //Thiago
        System.out.println("ABRE TELA PRA TRANSFERENCIA COMPLETA");
        reqFinal.setStatus("Transferência Solicitada.");
        //criar tela para exibir botoes de aceitar/recusar para vendedor?

        //new statusPedido(reqFinal.getStatus());

    }
    
    
    private static void fazerTransferenciaParcial(Requisicao reqParcial) {
        //Hugo
        //criar tela para exibir botoes de aceitar/recusar para vendedor?
        System.out.println("ABRE TELA PRA TRANSFERENCIA PARCIAL");
        int qtdeFaltante = reqParcial.getQtdeNecessaria() - reqParcial.getQtdeDisponivel();
        //SERA NECESSARIO CRIAR UMA NOVA REQUISICAO COM UM NOVO VALOR NECESSARIO (FALTANTE)
        Requisicao reqNova = new Requisicao(reqParcial.getProduto(), qtdeFaltante);
        System.out.println("ABRE TELA PRA LICITACAO");
        abreLicitacao(reqNova);
        
    }
}
