import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
    
    public static int speed = 3;

    public static boolean hasEffect = false;   
    
    public void act()
    {        
        robotMovement();
        collision();
    }

    public void robotMovement()
    {
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + speed);
        }

        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - speed);
        }

        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
        }

        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed, getY());
        }
    }
    
    private void collision() {
        World world = getWorld();
        
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
            SpeedEffect effect = new SpeedEffect(4);
            world.addObject(effect, 0, 0);
            effect.start();
            hasEffect = true;
            Timer.addToTimer(3);
        }
        if(isTouching(Bomb.class)){
            removeTouching(Food.class);  
            Timer.addToTimer(-10);
        }
        if (isTouching(Stone.class)) {
            removeTouching(Stone.class); 
            SlowEffect effect = new SlowEffect(3);
            world.addObject(effect, 0, 0);
            effect.start();
            hasEffect = true;
            Timer.addToTimer(-3);
        }
        if(isTouching(Rocket.class)){
            removeTouching(Food.class);  
            Timer.addToTimer(-50);
        }
        if(isTouching(GoldenApple.class)){
            removeTouching(Food.class);  
            Timer.addToTimer(60);
        }
    }
    
}
