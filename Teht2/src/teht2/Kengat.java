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
public class Kengat {
    String merkki;
    
    Kengat(String merkki){
        this.merkki = merkki;
    }
    
    @Override
    public String toString(){
        return "Kenkäni ovat merkkiä: " + merkki;
    }
}
