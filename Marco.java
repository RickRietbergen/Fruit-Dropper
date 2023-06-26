import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Marco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marco extends Actor
{
    /**
     * Act - do whatever the Marco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {        
        robotMovement();
        collision();
    }

    public void robotMovement()
    {
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() +3);
        }

        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() -3);
        }

        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3, getY());
        }

        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 3, getY());
        }
    }
    
    private void collision() {
        if(isTouching(Apple.class)){
            removeTouching(Food.class);  
            Timer.addToTimer(1);
        }
        if(isTouching(Bread.class)){
            removeTouching(Food.class);  
            Timer.addToTimer(5);
        }
        if(isTouching(Berry.class)){
            removeTouching(Food.class);  
            Timer.addToTimer(3);
        }
        if(isTouching(Bomb.class)){
            removeTouching(Food.class);  
            Timer.addToTimer(-10);
        }
    }
}
