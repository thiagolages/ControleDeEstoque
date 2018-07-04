package tpfinal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Unidade 
{
    private String nome;
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String endereco;
    private int id;

    
	public List<ProdutoEmEstoque> likeSearch(String search)
	{
	 ResultSet rs = null;
	 List<ProdutoEmEstoque> list = new ArrayList<ProdutoEmEstoque>();
	 ProdutoEmEstoque aux;
	 Database.connectDatabase();
	 try
	 {
	 	rs = Database.query
	 	(
			 "SELECT productID, productName, model, fabric, quantity, minimum "
			+"FROM Products NATURAL JOIN Category NATURAL JOIN UnityProducts "
			+"WHERE productName LIKE '%" + search + "%' "
			+"OR model LIKE '%" + search + "%' "
			+"OR fabric LIKE '%" + search + "%' "
			+"OR categoryName LIKE '%" + search + "%'"
		);
	 }
	 catch(SQLException err)
	 {
		 System.out.println("Erro de busca no baco de dados\nMensagem: "+err.getMessage());
		 return null;
	 }
	 try
	 {
		while(rs.next())
		{
			aux = new ProdutoEmEstoque
			(
				rs.getInt("productID"),
				rs.getString("productName"),
				rs.getString("model"),
				rs.getString("fabric"),
				rs.getInt("quantity"),
				rs.getInt("minimum")
			);
			System.out.println(rs.getInt("productID")+ " " +
			rs.getString("productName") + " " +
			rs.getString("model") + " " +
			rs.getString("fabric") + " " +
			rs.getInt("quantity") + " " +
			rs.getInt("minimum"));
			list.add(aux);
		}
		return list;
	 }
	 catch(SQLException err)
	 {
		 System.out.println("Erro de busca no baco de dados\nMensagem: "+err.getMessage());
		 return null;
	 }
	 
	}
    
	 public List<ProdutoEmEstoque> getProductNeeded()
	 {
		 ResultSet rs = null;
		 List<ProdutoEmEstoque> list = new ArrayList<ProdutoEmEstoque>();
		 ProdutoEmEstoque aux;
		 Database.connectDatabase();
		 try
		 {
		 	rs = Database.query(
			 "SELECT productID, productName, model, fabric, quantity, minimum "
	 		+"FROM Products NATURAL JOIN UnityProducts "
			+"WHERE quantity <= minimum AND unityID = " + this.id);
		 }
		 catch(SQLException err)
		 {
			 System.out.println("Erro de busca no baco de dados\nMensagem: "+err.getMessage());
			 return null;
		 }
		 try
		 {
			while(rs.next())
			{
				aux = new ProdutoEmEstoque
				(
					rs.getInt("productID"),
					rs.getString("productName"),
					rs.getString("model"),
					rs.getString("fabric"),
					rs.getInt("quantity"),
					rs.getInt("minimum")
				);
				list.add(aux);
			}
			return list;
		 }
		 catch(SQLException err)
		 {
			 System.out.println("Erro de busca no baco de dados\nMensagem: "+err.getMessage());
			 return null;
		 }
		 
	 }
	 
	 public Unidade(int id){
		 ResultSet rs = null;
		 Database.connectDatabase();
		 try
		 {
			 rs = Database.query("SELECT * FROM Unity WHERE Unity.unityID = "+id);
		 }
		 catch(SQLException err)
		 {
			 System.out.println("Erro de busca no baco de dados\nMensagem: "+err.getMessage());
		 }
		 try
		 {
			if(rs.next())
			{
				this.id = id;
				this.nome = rs.getString("unityName");
				this.endereco = rs.getString("address");
			}
			else
			{
				System.out.println("Erro de busca no baco de dados\nMensagem: não foram encontrados dados");
			}
		 }
		 catch(SQLException err)
		 {
			 System.out.println("Erro de busca no baco de dados\nMensagem: "+err.getMessage());
		 }
	 }
	
	 public void atualizaProduto(ProdutoEmEstoque prod, int qt)
	 {
		 Database.connectDatabase();
		 int novaQt = qt+ prod.getQuantidade();
		 try
		 {
			 Database.update
			 (
				  "UPDATE UnityProducts"
				 +" SET quantity = " + novaQt
				 +" WHERE productID = " + prod.getCodigo()
				 +" AND unityID = " + this.id
			);
		 }
		 catch(SQLException err)
		 {
			 System.out.println("Erro de busca no baco de dados\nMensagem: "+err.getMessage());
		 }
	 }
    
}


