import greenfoot.*;

public class DeathScreen extends World {
    private GreenfootImage backgroundImage;
    private int imageX;
    private int imageY;

    public DeathScreen() {
        super(800, 600, 1); // Set the size of the world
        prepare();
        
        addObject(new DeathTimer(), 0, 0);
    }

    private void prepare() {
        backgroundImage = new GreenfootImage("death.jpg");
        imageX = 0;
        imageY = 0;
        backgroundImage.scale(getWidth(), getHeight());
    }

    @Override
    public void act() {
        getBackground().drawImage(backgroundImage, imageX, imageY);
        
        Timer.resetTimer();
        Marco.speed = 3;
        Marco.hasEffect = false;
    }   
}






