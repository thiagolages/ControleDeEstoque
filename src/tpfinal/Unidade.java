package tpfinal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Unidade {
    private String nome;
    private String endereco;
    private int id;
    
    
 
 public Unidade(int id){
	 ResultSet rs = null;
	 Database.connectDatabase();
	 try
	 {
		 rs = Database.query("SELECT * FROM Unity WHERE Unity.unityID = "+id);
	 }
	 catch(SQLException err)
	 {
		 System.out.println("Ops, erro com a consulta");
	 }
	 try
	 {
		if(rs.next())
		{
			this.id = id;
			this.nome = rs.getString("unityName");
			this.endereco = rs.getString("address");
			System.out.println(this.nome);
			System.out.println(this.endereco);
		}
		else
		{
			System.out.println("Erro ao encontrar resultados");
		}
	 }
	 catch(SQLException err)
	 {
		 System.out.println("Erro ao encontrar resultados");
	 }
 }
    
}


