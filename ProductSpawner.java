import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ProductSpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductSpawner extends Actor
{
    /**
     * Act - do whatever the ProductSpawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int counterApple = 0;
    private int counterBerry = 0;
    private int counterBread = 0;
    
    public void act() {
        spawnApple();
        spawnBerry();
        spawnBread();
    }
    
    private void spawnApple() {
        
        if (counterApple <= 25) {
            counterApple++;
            return;
        }
        
        Apple apple = new Apple();
        
        spawnFood(apple);
        
        counterApple = 0;
    }
    
    private void spawnBerry() {
        if (counterBerry <= 30) {
            counterBerry++;
            return;
        }
        
        Berry berry = new Berry();
        
        spawnFood(berry);
        
        counterBerry = 0;
    }
    
    private void spawnBread() {
        if(counterBread <= 35) {
            counterBread++;
            return;
        }
        
        Bread bread = new Bread();
        
        spawnFood(bread);
        
        counterBread = 0;
    }
    
    private void spawnFood(Food food) {
        World world = getWorld();
        
        int x = Greenfoot.getRandomNumber(world.getWidth());
        
        world.addObject(food, x, 0);
    }
    
}