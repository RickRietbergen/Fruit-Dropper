import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);
        prepare();
        
        addObject(new ProductSpawner(), 0, 0);
        addObject(new Timer(), 600, 15);
        addObject(new TotalTimer(), 600, 50);
        Timer.setTime();
        Marco.speed = 3;
    }
    
    public void prepare()
    {
        Marco marco = new Marco();
        addObject(marco,600,400);
        
        DeathTimer.resetDeathTimer();
    }

}
