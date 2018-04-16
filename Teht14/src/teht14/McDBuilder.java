/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht14;

import java.util.ArrayList;

/**
 *
 * @author Ilari
 */
public class McDBuilder extends BurgerBuilder{
    ArrayList<Ingredient> list = new ArrayList();
    
    public ArrayList<Ingredient> getBurger() {
        return list;
    }

    
    @Override
    public void buildBuns() {
        Ingredient buns = new Ingredient("Wheat");
        list.add(buns);
    }

    @Override
    public void buildCheese() {
        Ingredient cheddar = new Ingredient("Cheddar");
        list.add(cheddar);
    }

    @Override
    public void buildCondiments() {
        Ingredient ketchup = new Ingredient("Ketchup");
        Ingredient mayonaise = new Ingredient("Mayonaise");
        list.add(ketchup);
        list.add(mayonaise);
    }

    @Override
    public void buildPatty() {
        Ingredient patty = new Ingredient("low-fat");
        list.add(patty);
    }

    
}
