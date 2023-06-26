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
            //dead
            System.out.println("dead");
            Greenfoot.setWorld(new MyWorld());
        }
        
    }
     
    private void updateImage()
    {
        setImage(new GreenfootImage("time remaining: " + timer/55, 20, Color.BLACK, Color.WHITE));
    }
    
    public static void addToTimer(int seconds) {
        timer += 55 * seconds;
    }
}


