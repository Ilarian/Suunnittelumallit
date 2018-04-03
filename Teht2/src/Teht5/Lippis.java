/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teht5;

/**
 *
 * @author Ilari
 */
public class Lippis {
    String merkki;
    Lippis(String merkki){
        this.merkki = merkki;
    }
    
    @Override
    public String toString(){
        return "Lippikseni on merkkiä: "+merkki;
    }
}
