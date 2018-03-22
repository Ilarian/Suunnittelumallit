/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht3;

import java.util.ArrayList;

/**
 *
 * @author Ilari
 */
public class Emolevy implements Laiteosa {
    private int hinta;
    private int hinnat;
    ArrayList<Laiteosa> osat = new ArrayList();
    
    Emolevy(){
        hinta = 89;
    }
    
    @Override
    public int haeHinta() {
        for (Laiteosa o : osat){
            hinnat += o.haeHinta();
        }
        return hinta + hinnat;
    }

    @Override
    public void lisaaOsa(Laiteosa osa) {
        osat.add(osa);
    }
    
}
