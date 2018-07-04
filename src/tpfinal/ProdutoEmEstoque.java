package tpfinal;

public class ProdutoEmEstoque extends Produto {
	
	private int quantidade;
	private int minimo;
	private int faltante;
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	public int getFaltante() {
		return faltante;
	}
	public void setFaltante(int faltante) {
		this.faltante = faltante;
	}
	public ProdutoEmEstoque (int codigo, String descricao, String modelo, String fabricante, int quantidade, int minimo)
	{
		super(codigo,descricao,modelo,fabricante);
		this.quantidade = quantidade;
		this.minimo = minimo;
		this.faltante = quantidade-minimo;
	}
	
}
