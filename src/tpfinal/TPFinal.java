package tpfinal;

import userInterface.*;

public class TPFinal {
 
    public static void main(String[] args) {
        // TODO code application logic here
        new mainMenu();
        Requisicao[] req;
        req = new Requisicao[3];
        req[0] = new Requisicao();
        req[1] = new Requisicao();
        req[2] = new Requisicao();
        System.out.println(req.length);
    }    
}
