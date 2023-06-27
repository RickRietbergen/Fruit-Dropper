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
    private int counterBomb = 0;
    private int counterRocket = 0;
    
    public void act() {
        spawnApple();
        spawnBerry();
        spawnBread();
        spawnBomb();
        spawnRocket();
    }
    
    private void spawnApple() {
        
        if (counterApple <= 25) {
            counterApple++;
            return;
        }
        
        Apple apple = new Apple(2);
        
        spawnFood(apple);
        
        counterApple = 0;
    }
    
    private void spawnBerry() {
        if (counterBerry <= 100) {
            counterBerry++;
            return;
        }
        
        Berry berry = new Berry(2);
        
        spawnFood(berry);
        
        counterBerry = 0;
    }
    
    private void spawnBread() {
        if(counterBread <= 35) {
            counterBread++;
            return;
        }
        
        Bread bread = new Bread(2);
        
        spawnFood(bread);
        
        counterBread = 0;
    }
    
        private void spawnBomb() {
        if(counterBomb <= 50) {
            counterBomb++;
            return;
        }
        
        Bomb bomb = new Bomb(3, 6);
        
        spawnFood(bomb);
        
        counterBomb = 0;
    }
    
            private void spawnRocket() {
        if(counterRocket <= 100) {
            counterRocket++;
            return;
        }
        
        Rocket rocket = new Rocket(20);
        
        spawnFood(rocket);
        
        counterRocket = 0;
    }
    
    private void spawnFood(Food food) {
        World world = getWorld();
        
        int x = Greenfoot.getRandomNumber(world.getWidth());
        
        world.addObject(food, x, 5);
    }
    
}
