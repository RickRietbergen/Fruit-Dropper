import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.TimerTask;

/**
 * Write a description of class TimerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TotalTimer extends Actor
{
    private static int timer = 0; //about 60 seconds
 
    public void Timer()
    {
        updateImage();
    }
     
    public void act()
    {
        timer++;
        if (timer % 55 == 0){
            updateImage();
        }
        
        if (timer < 1){
            Greenfoot.setWorld(new DeathScreen());
        }
        
    }
     
    private void updateImage()
    {
        setImage(new GreenfootImage("Time Survived: " + timer/55, 30, Color.BLACK, Color.WHITE));
    }
    
    public static void addToTimer(int seconds) {
        timer += 55 * seconds;
    }
    
    public static void resetTimer() {
        timer = 0;
    }
    
    public static int getTime() {
        return timer/55;
    }
    
    public static void setTime() {
            timer = 0;
    }
}


