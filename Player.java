import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    // players soorten
    int Speed = 3;
    int speedBack = -3;
    private ArrayList<GreenfootImage> images;

    public Player(EscapeGame game)
    {
        super();
        images = new ArrayList<GreenfootImage>();

        GreenfootImage banana = new GreenfootImage("banana.png");
        GreenfootImage dog = new GreenfootImage("dog.png");
        GreenfootImage zebra = new GreenfootImage("zebra.png");
        GreenfootImage flamingo = new GreenfootImage("flamingo.jpg");

        images.add(banana);
        images.add(dog);
        images.add(zebra);
        images.add(flamingo);

        images.forEach((image) -> image.scale(50,50));
    }

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(Speed);
        WallEncounter();
    }

    /*
     * besturing: z naar boven
     * d naar recht, s naar onder, q naar links
     */

    public void move(int speed) 
    {
        if (Greenfoot.isKeyDown("q")) 
        {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("z"))
        {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + speed);
        }
    }

    public void changeImage(int x) 
    {
        setImage(images.get(x));
    }

    public void WallEncounter(){
        if (isTouching(Border.class)){
            move(speedBack);
        }
    }

    public Actor getIntersecting(){
        return getOneIntersectingObject(MyActor.class);
    }
}
