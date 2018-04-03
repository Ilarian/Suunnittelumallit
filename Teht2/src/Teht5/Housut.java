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
public class Housut {
    String merkki;
    Housut(String merkki){
        this.merkki = merkki;
    }
    
    @Override
    public String toString(){
        return "Housuni ovat merkkiä " + merkki;
    }
}
