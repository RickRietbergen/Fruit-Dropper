import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Button
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public StartButton() {
        int percent = 25; // for 50% larger image
        getImage().scale(getImage().getWidth()*percent/100, getImage().getHeight()*percent/100);
        setOnClick(() -> Greenfoot.setWorld(new MyWorld()));
    }
}
