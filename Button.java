import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor {
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Runnable onClick;
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            onClick.run();
        }
    }
    
    public void setOnClick(Runnable onClick) {
        this.onClick = onClick;
    }
    
}
