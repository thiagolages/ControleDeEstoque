package tpfinal;

public class Requisicao {

    private static int proxID = 1;
    private int IDrequisicao;
    private int codigoProduto, qtdeNecessaria, qtdeDisponivel; //consideranto apenas qtdes inteiras
    private float valorUnitario, valorFrete;
    private String descricaoProduto, modeloProduto, fabricanteProduto;
    private String dataEmbarque, dataEntrega;
    
    public Requisicao(){
        System.out.println("Requisicao criada");
    }
    
    public Requisicao(int codigo, String descricao, String modelo, String fabricante, int quantidade){
        this.IDrequisicao = proxID++;
        this.codigoProduto = codigo;
        this.descricaoProduto = descricao;
        this.modeloProduto = modelo;
        this.fabricanteProduto = fabricante;
        this.qtdeNecessaria = quantidade;
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

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
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

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getModeloProduto() {
        return modeloProduto;
    }

    public void setModeloProduto(String modeloProduto) {
        this.modeloProduto = modeloProduto;
    }

    public String getFabricanteProduto() {
        return fabricanteProduto;
    }

    public void setFabricanteProduto(String fabricanteProduto) {
        this.fabricanteProduto = fabricanteProduto;
    }

    public String getDataEmbarque() {
        return dataEmbarque;
    }

    public void setDataEmbarque(String dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
           
    
    
}
