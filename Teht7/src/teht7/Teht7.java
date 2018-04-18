/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht7;

/**
 *
 * @author Ilari
 */
public class Teht7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        System.out.println("\nCharmander");
        System.out.println(pokemon.attack());
        System.out.println(pokemon.fly());
        System.out.println(pokemon.growl());
        System.out.println("\nCharmeleon");
        System.out.println(pokemon.attack());
        System.out.println(pokemon.fly());
        System.out.println(pokemon.growl());
        System.out.println("\nCharizard");
        System.out.println(pokemon.attack());
        System.out.println(pokemon.fly());
        System.out.println(pokemon.growl());
        
    }
    
}
