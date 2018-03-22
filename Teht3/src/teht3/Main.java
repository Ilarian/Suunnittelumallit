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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Muistipiiri m = new Muistipiiri();
        Prosessori prossu = new Prosessori();
        Nayttokortti nayttis = new Nayttokortti();
        Kotelo kotelo = new Kotelo();
        Emolevy emo = new Emolevy();
        Poytakone kone = new Poytakone();
        Ledit ledit = new Ledit();
        Ledit ledit2 = new Ledit();
        Tuuletin tuuletin = new Tuuletin();
        
        emo.lisaaOsa(m);
        emo.lisaaOsa(prossu);
        emo.lisaaOsa(nayttis);
        kotelo.lisaaOsa(ledit);
        kotelo.lisaaOsa(ledit2);
        kotelo.lisaaOsa(tuuletin);
        kone.lisaaOsa(emo);
        kone.lisaaOsa(kotelo);
        
        
        System.out.println("Koko paketin hinta on: " +kone.haeHinta()+ "€");
    }
    
}
