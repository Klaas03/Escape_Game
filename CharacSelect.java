import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class CharacSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacSelect extends BaseRoom
{
    public static final int WIDTH = 1020;   //breedte instellen v/d rooms
    public static final int HEIGHT = 574;   //hoogte instellen v/d rooms
    public static final int RESOLUTION = 1; //resolutie instellen v/d rooms
    private ArrayList<Actor> players;

    public CharacSelect(EscapeGame game)
    {         
        super(game);
        players = new ArrayList<Actor>();
        players.add(new Actor(){});
        players.add(new Actor(){});
        players.add(new Actor(){});
        players.add(new Actor(){});
        
        GreenfootImage banana = new GreenfootImage("banana.png");
        GreenfootImage dog = new GreenfootImage("dog.png");
        GreenfootImage zebra = new GreenfootImage("zebra.png");
        GreenfootImage flamingo = new GreenfootImage("flamingo.jpg");
        
        banana.scale(100,100);
        dog.scale(100,100);
        zebra.scale(100,100);
        flamingo.scale(100,100);
        
        players.get(0).setImage(banana);
        players.get(1).setImage(dog);
        players.get(2).setImage(zebra);
        players.get(3).setImage(flamingo);

        for(int i = 0; i < players.size(); i++){
            this.addObject(players.get(i), 100+100*i, 100+100*i);
        }

    }

    public void act()
    {
        if(Greenfoot.getMouseInfo().getClickCount() > 0 && Greenfoot.getMouseInfo().getButton() == 1){
            Actor current = Greenfoot.getMouseInfo().getActor();
            int index = players.indexOf(current);
            if (index != -1){
                game.getPlayer().changeImage(index);
            }
        }
    }
}
