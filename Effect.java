import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Effect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Effect extends Actor
{
    
    private int duration;
    
    private Runnable reset;
    
    public Effect(int duration) {
        this.duration = duration * 55;
    }
    
    public void startEffect(Runnable function)  {
        
        if (Marco.hasEffect)
            return;
        
        function.run();  
    }
    
    public void endEffect() {
        reset.run();
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public void setReset(Runnable reset) {
        this.reset = reset;
    }
    
}
