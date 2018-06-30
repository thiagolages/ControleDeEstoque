package tpfinal;

import java.util.Date;

public class Requisicao {

    private static int proxID = 1;
    private int IDrequisicao;
    private Produto produto;
    private int qtdeNecessaria, qtdeDisponivel; //consideranto apenas qtdes inteiras
    private float valorUnitario, valorFrete;
    private Date dataEmbarque, dataEntrega;
    private String nomeFornecedor;
    private String status = "Status ainda não definido";

    
    public Requisicao(){
        System.out.println("Requisicao criada");
    }
    
    public Requisicao(Produto produto, int quantidade){
        this.IDrequisicao = proxID++;
        this.produto = produto;
        this.qtdeNecessaria = quantidade;
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

    public void setQtdeNecessaria(int qtdeNecessaria) {
        this.qtdeNecessaria = qtdeNecessaria;
    }

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
