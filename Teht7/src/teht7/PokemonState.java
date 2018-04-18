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
public abstract class PokemonState {
    public abstract String attack(Pokemon p);
    public abstract String fly(Pokemon p);
    public abstract String growl(Pokemon p);
    public void evolve(Pokemon p, PokemonState pokemon){
        p.evolve(pokemon);
    }
}
