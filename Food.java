import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 
Write a description of class Food here.
@author (your name)
@version (a version number or a date)
*/
public class Food extends Actor {

    private int dropSpeed;

    public Food(int dropSpeed) {
        this.dropSpeed = dropSpeed;
    }

    public Food(int minDropSpeed, int maxDropSpeed) {
        dropSpeed = minDropSpeed + Greenfoot.getRandomNumber(maxDropSpeed - minDropSpeed);
    }

    public void spawnProduct() {
        World world = getWorld();

        int x = Greenfoot.getRandomNumber(world.getWidth());

        Food food = new Food(dropSpeed);

        world.addObject(food, world.getHeight(), x);
    }

    public void removeFood() {
        World world = getWorld();

        if(isAtEdge()) 
            world.removeObject(this);
    }

    public void sinkToTheBottom() {
        int y = getY();
        int x = getX();

        setLocation(x, y + dropSpeed);
    }

}