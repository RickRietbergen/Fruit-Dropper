import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor {
    
    public void act() {
        
    }
    
    public void removeFood() {
        World world = getWorld();
        
        if(isAtEdge()) 
            world.removeObject(this);
    }
    
    public void sinkToTheBottom() {
        int y = getY();
        int x = getX();
        
        setLocation(x, y + 2);
    }
}
