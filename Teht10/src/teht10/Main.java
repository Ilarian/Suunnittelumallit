/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht10;

/**
 *
 * @author Ilari
 */
public class Main {

   
    public static void main(String[] args) {
        Esimies esimies = new Esimies();
        Päällikkö päällikkö = new Päällikkö();
        Toimitusjohtaja tj = new Toimitusjohtaja();
        
        esimies.setKäsittelijä(päällikkö);
        päällikkö.setKäsittelijä(tj);
        
        esimies.käsitteleKorotus(1);
        esimies.käsitteleKorotus(3);
        esimies.käsitteleKorotus(5);
        
    }
    
}
