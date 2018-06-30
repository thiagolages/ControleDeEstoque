package tpfinal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Unidade {
    private String nome;
    private String endereco;
    private int id;
    
    

 public Unidade(String nome, String endereco, int coord_end){ // este construtor eh so exemplo
     // Todas as informacoes da unidade precisam estar no banco de dados
     // Pensei em fazer um if(nome=="unidade A) inicializa com os dados dela e etc..
     this.nome = nome;
     this.endereco = endereco;
     this.coord_end = coord_end;
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


