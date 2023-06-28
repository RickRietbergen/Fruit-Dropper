import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenApple extends Food {
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public GoldenApple(int dropSpeed) {
        super(dropSpeed);
    }
    
    public void act() {
        sinkToTheBottom();
        removeFood();
    }
}
