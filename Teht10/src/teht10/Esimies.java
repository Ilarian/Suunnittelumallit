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
public class Esimies extends Käsittelijä {
    
    

   
    public void käsitteleKorotus(int korotus) {
        if(korotus <= 2){
            System.out.println("Esimies käsittelee pyyntöä");
        } else if (seuraava != null){
            seuraava.käsitteleKorotus(korotus);
        }
    }
    
}
