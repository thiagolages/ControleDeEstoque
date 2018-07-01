package tpfinal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Requisicao {

    private static int proxID = 1;
    private int IDrequisicao;
    private Produto produto;
    private int qtdeNecessaria;
    private int qtdeDisponivel; //consideranto apenas qtdes inteiras
    private float valorUnitario, valorFrete;
    private Date dataEmbarque, dataEntrega;
    private String nomeFornecedor;
    private String status = "Status ainda não definido";

    private static ArrayList<Requisicao> listaDeRequisicoes;
    
    public Requisicao(){
        System.out.println("Requisicao criada");
    }
    
    public Requisicao(Produto produto, int quantidade){
        this.IDrequisicao = proxID++;
        this.produto = produto;
        this.qtdeNecessaria = quantidade;
        listaDeRequisicoes = new ArrayList<>();
    }

    public ArrayList<Requisicao> getListaDeRequisicoes() {
        return listaDeRequisicoes;
    }

    public static void addRequisicao(Requisicao req) {
        System.out.println("Recebendo requisicao "+req.getNomeFornecedor());
        Requisicao.listaDeRequisicoes.add(req);
    }
    
    public static void comparaRequisicoes(){
        
        Requisicao[] arrayRequisicoes = new Requisicao[listaDeRequisicoes.size()];
        Iterator it = listaDeRequisicoes.iterator();
        
        System.out.println(listaDeRequisicoes.get(0).getNomeFornecedor());
        System.out.println(listaDeRequisicoes.get(1).getNomeFornecedor());
        
        System.out.println("size = " +listaDeRequisicoes.size());
        for (int i = 0; i < listaDeRequisicoes.size(); i++){
            arrayRequisicoes[i] = listaDeRequisicoes.get(i);
        }
        
        listaDeRequisicoes.clear();
        ReposicaoDeEstoque.verificaMelhorOpcao(arrayRequisicoes);
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getProxID() {
        return proxID;
    }

    public static void setProxID(int proxID) {
        Requisicao.proxID = proxID;
    }

    public int getIDrequisicao() {
        return IDrequisicao;
    }

    public void setIDrequisicao(int IDrequisicao) {
        this.IDrequisicao = IDrequisicao;
    }


    public int getQtdeNecessaria() {
        return qtdeNecessaria;
    }

    //Nao vai existir, pois uma vez setado (no construtor) nao pode ser alterado
    //public void setQtdeNecessaria(int qtdeNecessaria) {
    //    this.qtdeNecessaria = qtdeNecessaria;
    //}

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Date getDataEmbarque() {
        return dataEmbarque;
    }

    public void setDataEmbarque(Date dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
        
}
