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
    int lives;

    public void act()
    {        
        robotMovement();
    }

    public Marco()
    {
        setLives(1000);
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
    
    private void s() {
        
    }
    
    public int getLives()
    {
        return lives;
    }
    
    public int setLives(int amount)
    {
        return lives = amount;
    }
    
}
