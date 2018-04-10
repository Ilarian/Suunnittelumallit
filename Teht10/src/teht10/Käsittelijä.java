/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht10;

/**
 *
 * @author Ilari
 */
public abstract class Käsittelijä {
    protected Käsittelijä seuraava;
    
    public void setKäsittelijä(Käsittelijä k){
        seuraava = k;
    }
    
    abstract public void käsitteleKorotus(int korotus);
    
}
