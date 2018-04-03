/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht4;

/**
 *
 * @author Ilari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ClockTimer timer = new ClockTimer();
        
        DigitalClock clock = new DigitalClock(timer);
        
        timer.tick();
        
    }
    
}
