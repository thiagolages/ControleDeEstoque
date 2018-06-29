package tpfinal;


public class Unidade {
    String nome;
    String endereco;
    int coord_end; // coordenadas do endereco p/ calcular o frete
    ControleDeEstoque estoque; // este estoque precisa ser inicializado dentro do 
    //construtor com os produtos do banco de dados de acordo com o nome da unidade
    
 
 public Unidade(String nome, String endereco, int coord_end){ // este construtor eh so exemplo
     // Todas as informacoes da unidade precisam estar no banco de dados
     // Pensei em fazer um if(nome=="unidade A) inicializa com os dados dela e etc..
     this.nome = nome;
     this.endereco = endereco;
     this.coord_end = coord_end;
 }   
    
}


