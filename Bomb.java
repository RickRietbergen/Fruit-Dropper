import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Food
{
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Bomb(int minDropSpeed, int maxDropSpeed) {
        super(minDropSpeed, maxDropSpeed);
        
        int percent = 200; // for 50% larger image
        getImage().scale(getImage().getWidth()*percent/100, getImage().getHeight()*percent/100);
    }
    
    public void act() {
        sinkToTheBottom();
        removeFood();
    }
}


