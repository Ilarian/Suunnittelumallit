/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht3;

/**
 *
 * @author Ilari
 */
public class Verkkokortti implements Laiteosa {
    private int hinta;

    Verkkokortti(){
        hinta = 29;
    }
    @Override
    public int haeHinta() {
        return hinta;
    }
    
    @Override
    public void lisaaOsa(Laiteosa osa) {
        System.out.println("Et voi lisätä tähän osia!");
    }
}
