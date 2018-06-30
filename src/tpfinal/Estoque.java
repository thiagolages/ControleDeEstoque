package tpfinal;

import java.util.ArrayList;
import java.util.List;

//Acho que podemos eliminar o estoque tambem e criar somente o ControledeEstoque 
//dentro de unidade e considerar ReposicaoDeEstoque como uma tela que trabalha em
//cima dos dados de ControleDeEstoque

public class Estoque {
    String responsavel;
    static List<ControleDeEstoque> estoque  = new ArrayList<ControleDeEstoque> ();
    public Estoque(){
        
    }
}
