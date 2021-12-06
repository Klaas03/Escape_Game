import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 *Deze subklasse houdt bij waar de actor zich bevindt en 
 *heeft de commands om de actor van room te laten veranderen
 *deze moeten aangeroepen worden bij de actor zelf
 */

public class EscapeGame extends World
{
    public static final int WIDTH = 1280;   //breedte instellen v/d rooms
    public static final int HEIGHT = 720;   //hoogte instellen v/d rooms
    public static final int RESOLUTION = 1; //resolutie instellen v/d rooms

    private Player player;
    private BaseRoom currentRoom;
    
   
    private ArrayList<BaseRoom> rooms;

    public EscapeGame()
    {    
        // Create a new world with WIDTH/RESOLUTION x HEIHT/RESOLUTION cells 
        //with a cell size of RESOLUTION x RESOLUTION pixels.
        super(WIDTH / RESOLUTION, HEIGHT / RESOLUTION, RESOLUTION); 
        
        rooms = new ArrayList<BaseRoom>();
        
        player = new Player(this);
        
        
        rooms.add(new CharacSelect(this));
        rooms.add(new Room2(this, player));
        rooms.add(new Doolhof(this, player));
        rooms.add(new Scene(this, player));
        rooms.add(new FinalRoom(this, player));
        rooms.add(new Shooter(this, player));
        
        SetRoom(rooms.get(0)); //Start in the first room
    }

    private void SetRoom(BaseRoom room)
    {
        currentRoom = room;
        Greenfoot.setWorld(room);
    }
    
    public BaseRoom getCurrentRoom(){
        return currentRoom;
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public void NextRoom(int number, int xCoor, int yCoor) // set number of how many rooms you want to skip (also can be negative)
    {
        int index = rooms.indexOf(currentRoom);
        if (index+number >= rooms.size()){
            //TODO game ended, no more rooms
        } 
        else {
            SetRoom(rooms.get(index+number));
            currentRoom.addObject(player, xCoor, yCoor);
        }
    }
}
