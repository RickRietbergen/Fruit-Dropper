import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Berry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Berry extends Food {
    /**
     * Act - do whatever the Berry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Berry(int dropSpeed) {
        super(dropSpeed);
    }
    
    public void act() {
        sinkToTheBottom();
        removeFood();
    }
}
