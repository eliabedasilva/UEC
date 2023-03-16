/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uec;

/**
 *
 * @author Eliabe
 */
public class Uec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Luta luta = new Luta();
        Lutador lutador1 = new Lutador("Calebe", "Estados Unidos da America", 19, 1.72f, 72.2f, 1, 2,0);
        Lutador lutador2 = new Lutador("Eliabe", "Brasil", 19, 1.75f, 75.2f, 100, 0,0);
        
        luta.marcaLuta(lutador1, lutador2);
        luta.lutar();
        System.out.println("-------------------------------------------------");
        System.out.println("");
        lutador1.status();
        lutador2.status();
    }
    
}
