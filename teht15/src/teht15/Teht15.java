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
public class Teht15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewCalculatorIF calculator = new NewCalculator();
        
        System.out.println(calculator.multiply(3));
        System.out.println(calculator.multiplyTwice(3));
    }
    
}
