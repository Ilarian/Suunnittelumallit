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
public class Boss implements VaatteetIF{

    public Kengat teeKengat() {
        return new Kengat("Boss");
    }

    public Housut teeHousut() {
        return new Housut("Boss");
    }

    public Paita teePaita() {
        return new Paita("Boss");
    }

    public Lippis teeLippis() {
        return new Lippis("Boss");
    }
    
}
