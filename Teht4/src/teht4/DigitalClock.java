/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht4;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ilari
 */
public class DigitalClock implements Observer {
    ClockTimer timer;
    
    DigitalClock(ClockTimer timer){
        this.timer = timer;
        timer.addObserver(this);
    }
    
    
    @Override
    public void update(Observable o, Object arg) {
        if (o == timer){
            showTime();
        }
    }
    
    public void showTime(){
        int hour = timer.getHour();
        int minute = timer.getMinutes();
        int second = timer.getSeconds();
        
        System.out.println(hour +":" + minute + ":" + second);
    }
    
}
