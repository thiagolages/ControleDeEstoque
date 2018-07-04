package tpfinal;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Fornecedor {

	private int id;
	private String nome;
	private String endereco;
	
	public Fornecedor(int id)
	{
		ResultSet rs = null;
		Database.connectDatabase();
		 try
		 {
			 rs = Database.query("SELECT * FROM Supplier WHERE supplierID = "+id);
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
				this.nome = rs.getString("supplierName");
				this.endereco = rs.getString("supplierAddr");
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

}
