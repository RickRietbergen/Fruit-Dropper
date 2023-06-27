import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.TimerTask;

/**
 * Write a description of class TimerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathTimer extends Actor
{
    private static int timer = 55*3;
     
    public void act()
    {
        timer--;
        
        if (timer < 1){
            
            Greenfoot.setWorld(new StartScreen());
        }
        
    }
    
        public static void resetDeathTimer() {
        timer = 55*3;
    }
}


