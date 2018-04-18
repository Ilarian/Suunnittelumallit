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
public class NewCalculator extends Calculator implements NewCalculatorIF{
    
    @Override
    public double multiply(int x) {
        return applyMultiplier(x);
    }

    @Override
    public double multiplyTwice(int x) {
        return applyMultiplierTwice(x);
    }
    
}
