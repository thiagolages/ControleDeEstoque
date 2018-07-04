package tpfinal;

public class Produto {

    private int codigo;
    private String descricao, modelo, fabricante;

    public Produto(int codigo, String descricao, String modelo, String fabricante) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
    
    
        
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    
    
}
