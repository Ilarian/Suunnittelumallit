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
public class Vaatteet {
    Kengat kengat;
    Housut housut;
    Paita paita;
    Lippis lippis;
    
    public Vaatteet(VaatteetIF vaatemerkki){
        kengat = vaatemerkki.teeKengat();
        housut = vaatemerkki.teeHousut();
        paita = vaatemerkki.teePaita();
        lippis = vaatemerkki.teeLippis();
    }
}
