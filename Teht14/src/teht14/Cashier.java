/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht14;

/**
 *
 * @author Ilari
 */
public class Cashier {
    private BurgerBuilder burgerBuilder;
    
    public void setBuilder(BurgerBuilder bb){
        burgerBuilder = bb;
    }
    
    public void constructBurger(){
        burgerBuilder.buildBuns();
        burgerBuilder.buildPatty();
        burgerBuilder.buildCheese();
        burgerBuilder.buildCondiments();
    }
    
}
