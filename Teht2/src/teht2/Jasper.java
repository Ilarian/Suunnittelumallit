/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht2;

/**
 *
 * @author Ilari
 */
public class Jasper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vaatteet kuteet = new Vaatteet(new Boss());
        
        System.out.println(kuteet.kengat);
        System.out.println(kuteet.housut);
        System.out.println(kuteet.paita);
        System.out.println(kuteet.lippis);
    }
    
}
