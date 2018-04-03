/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht4;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Observable;

/**
 *
 * @author Ilari
 */
public class ClockTimer extends Observable {
    
    int seconds;
    
    public int getHour(){
        return LocalDateTime.now().getHour();
    }
    
    public int getMinutes(){
        return LocalDateTime.now().getMinute();
    }
    
    public int getSeconds(){
        return LocalDateTime.now().getSecond();
    }
    
    public void tick() throws InterruptedException{
        while(true){
            setChanged();
            Thread.sleep(1000);
            notifyObservers();
        }
    }
}
