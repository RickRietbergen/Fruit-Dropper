import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.TimerTask;

/**
 * Write a description of class TimerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private static int timer = 55*60; //about 60 seconds
 
    public void Timer()
    {
        updateImage();
    }
     
    public void act()
    {
        timer--;
        if (timer % 55 == 0){
            updateImage();
        }
        
        if (timer < 1){
            Greenfoot.setWorld(new DeathScreen());
        }
        
    }
     
    private void updateImage()
    {
        if (timer <= 10 * 55){
            setImage(new GreenfootImage("Time Remaining: " + timer/55, 30, Color.RED, Color.WHITE));
        }
        if (timer > 10 * 55){
            setImage(new GreenfootImage("Time Remaining: " + timer/55, 30, Color.BLACK, Color.WHITE));
        }
        
    }
    
    public static void addToTimer(int seconds) {
        timer += 55 * seconds;
    }
    
    public static void resetTimer() {
        timer = 55*60;
    }
    
    public static int getTime() {
        return timer/55;
    }
    
    public static void setTime() {
            timer = 55*60;
    }
}


