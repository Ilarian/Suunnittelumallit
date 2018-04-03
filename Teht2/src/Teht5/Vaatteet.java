/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teht5;

import Teht5.Paita;
import Teht5.Lippis;
import Teht5.Kengat;
import Teht5.Housut;
import Teht5.VaatteetIF;

/**
 *
 * @author Ilari
 */
public class Vaatteet {
    Kengat kengat;
    Housut housut;
    Paita paita;
    Lippis lippis;
    
    private static Vaatteet INSTANCE = null;
    
    private Vaatteet(VaatteetIF vaatemerkki){
        kengat = vaatemerkki.teeKengat();
        housut = vaatemerkki.teeHousut();
        paita = vaatemerkki.teePaita();
        lippis = vaatemerkki.teeLippis();
    }
    
    public static Vaatteet getInstance(VaatteetIF merkki){
        if(INSTANCE == null){
            INSTANCE = new Vaatteet(merkki);
        }
        return INSTANCE;
    }
}
