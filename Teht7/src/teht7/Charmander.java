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
public class Charmander extends PokemonState {

    public void evolve(Pokemon p) {
        evolve(p, new Charmeleon());
    }

    @Override
    public String attack(Pokemon p) {
        return "Claw attack";
    }

    @Override
    public String fly(Pokemon p) {
        return "Can't fly!";
    }

    @Override
    public String growl(Pokemon p) {
        evolve(p);
        return "Shhhriiik!";
    }
    
}
