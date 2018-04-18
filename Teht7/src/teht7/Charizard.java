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
public class Charizard extends PokemonState{

    @Override
    public String attack(Pokemon p) {
        return "Firebreath";
    }

    @Override
    public String fly(Pokemon p) {
        return "Flied up into the air!";
    }

    @Override
    public String growl(Pokemon p) {
        evolve(p);
        return "GRRAAAAH!";
    }


    public void evolve(Pokemon p) {
        evolve(p, new Charmander());
    }
    
}
