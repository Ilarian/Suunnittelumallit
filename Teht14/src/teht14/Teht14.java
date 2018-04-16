/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht14;

/**
 *
 * @author Ilari
 */
public class Teht14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HesBuilder hese = new HesBuilder();
        BurgerBuilder mäkkäri = new McDBuilder();
        Cashier kassa = new Cashier();
        kassa.setBuilder(hese);
        kassa.constructBurger();
        System.out.println(hese.getBurger());
    }
    
}
