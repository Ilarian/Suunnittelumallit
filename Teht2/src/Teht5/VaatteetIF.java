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

/**
 *
 * @author Ilari
 */
public interface VaatteetIF {
    public abstract Kengat teeKengat();
    public abstract Housut teeHousut();
    public abstract Paita teePaita();
    public abstract Lippis teeLippis();
}
