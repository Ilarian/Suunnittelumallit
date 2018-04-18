/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht15;

/**
 *
 * @author Ilari
 */
public class Calculator {
    
    int base = 10;
    double multiplier = 1.3;
    
    public double applyMultiplier(int x){
        return (base + x) * multiplier;
    }
    
    public double applyMultiplierTwice(int x){
        return (base + x) * multiplier * multiplier;
    }
}
