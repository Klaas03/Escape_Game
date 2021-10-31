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
    private int speed = 3; // bepaalt snelheid van de player

    // players soorten
    private ArrayList<GreenfootImage> images;
    
    public Player(){
        super();
        images = new ArrayList<GreenfootImage>();
        images.add(new GreenfootImage("banana.png"));
        images.add(new GreenfootImage("dog.png"));
        images.add(new GreenfootImage("zebra.png"));
        images.add(new GreenfootImage("flamingo.jpg"));
    }
    

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }

    /*
     * besturing: z naar boven
     * d naar recht, s naar onder, q naar links
     */

    public void move() {
        if (Greenfoot.isKeyDown("q")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("z")){
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + speed);
        }
    }

    public void changeImage(int x) {
        setImage(images.get(x));
    }
}
