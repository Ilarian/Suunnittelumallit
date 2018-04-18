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
public class Pokemon {
    private PokemonState state;
    
    Pokemon(){
        state = new Charmander();
    }
    public String attack(){
        return state.attack(this);
    }
    public String fly(){
        return state.fly(this);
    }
    public String growl(){
        return state.growl(this);
    }
    public void evolve(PokemonState pokemon){
        state = pokemon;
    }
}
