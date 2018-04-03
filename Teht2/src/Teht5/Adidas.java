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
public class Adidas implements VaatteetIF {
    @Override
    public Kengat teeKengat() {
        return new Kengat("Adidas");
    }

    @Override
    public Housut teeHousut() {
        return new Housut("Adidas");
    }

    @Override
    public Paita teePaita() {
        return new Paita("Adidas");
    }

    @Override
    public Lippis teeLippis() {
        return new Lippis("Adidas");
    }
}
