package tpfinal;

import userInterface.*;
import java.util.ArrayList;
import java.util.List;


public class TPFinal {
 
    public static void main(String[] args) {
        // TODO code application logic here
        new mainMenu();
        Unidade un = new Unidade(2);
        List<ProdutoEmEstoque> list = un.likeSearch("Alimento");
        //ProdutoEmEstoque[] arr = list.toArray(new ProdutoEmEstoque[list.size()]);
        //un.atualizaProduto(arr[0], 1);
    }    
}
