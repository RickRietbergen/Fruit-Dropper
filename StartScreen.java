import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);  
        
        addObject(new StartButton(), getWidth() / 2, 600);
        
        prepare();
    }
    
    public void prepare() {
        GreenfootImage text = new GreenfootImage("Fruit-Dropper.png");
        int percent = 50; // for 50% larger image
        text.scale(text.getWidth()*percent/100, text.getHeight()*percent/100);
        getBackground().drawImage(text, getWidth() / 2 - 450, 100);
    }
    
}
