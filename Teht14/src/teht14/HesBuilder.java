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
public class HesBuilder extends BurgerBuilder{
    StringBuilder sb = new StringBuilder(64);
    
    public StringBuilder getBurger(){
        return sb;
    }

    @Override
    public void buildBuns() {
        sb.append("RyeBun ");
    }

    @Override
    public void buildPatty() {
        sb.append("BeefPatty ");
    }

    @Override
    public void buildCheese() {
        sb.append("BlueCheese");
    }

    @Override
    public void buildCondiments() {
        sb.append("Ketchup ");
        sb.append("Mustard ");
    }

}
