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
public class Poytakone implements Laiteosa {

    ArrayList<Laiteosa> osat = new ArrayList();
    private int hinnat;
    
    @Override
    public int haeHinta() {
        for (Laiteosa o : osat){
            hinnat += o.haeHinta();
        }
        return hinnat;
    }

    @Override
    public void lisaaOsa(Laiteosa osa) {
        osat.add(osa);
    }
    
}
