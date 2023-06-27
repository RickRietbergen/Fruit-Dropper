import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedEffect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedEffect extends Effect
{
    /**
     * Act - do whatever the SpeedEffect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public SpeedEffect(int duration) {
        super(duration);
        
        setReset(() -> {
            Marco.speed = 3;
            Marco.hasEffect = false;
        });
    }
    
    public void act() {
        setDuration(getDuration() - 1);
        if (getDuration() <= 0) {
             endEffect();   
             getWorld().removeObject(this);
        }
    }
    
    public void start() {
        startEffect(() -> Marco.speed = 10);
    }
    
}
