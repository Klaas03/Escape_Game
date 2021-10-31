import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 *Deze subklasse houdt bij waar de actor zich bevindt en 
 *heeft de commands om de actor van room te laten veranderen
 *deze moeten aangeroepen worden bij de actor zelf
 */

public class EscapeGame extends World
{
    public static final int WIDTH = 1020;   //breedte instellen v/d rooms
    public static final int HEIGHT = 574;   //hoogte instellen v/d rooms
    public static final int RESOLUTION = 1; //resolutie instellen v/d rooms

    private Player player; 
    private BaseRoom CharacSelect; //onthoudt de kamers
    private BaseRoom startRoom;
    private BaseRoom room2;
    private BaseRoom currentRoom;

    private ArrayList<BaseRoom> rooms;

    public EscapeGame()
    {    
        // Create a new world with WIDTH/RESOLUTION x HEIHT/RESOLUTION cells 
        //with a cell size of RESOLUTION x RESOLUTION pixels.
        super(WIDTH / RESOLUTION, HEIGHT / RESOLUTION, RESOLUTION); 
        
        rooms = new ArrayList<BaseRoom>();
        
        rooms.add(new CharacSelect(this));
        rooms.add(new StartRoom(this));
        rooms.add(new Room2(this));
        
        SetRoom(rooms.get(0)); //Start in the first room
        player = new Player();
        
        //stel de huidige room in op startRoom
        currentRoom.addObject(player, 100, 100);
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
    
    public void NextRoom()
    {
        if(currentRoom == startRoom)
        {
            SetRoom(room2);
            //stel de room in op room2
            currentRoom.addObject(player, 100, 100);
            //plaats karakter op de gewenste positie in de huidige room
        }
        else
        {
            SetRoom(startRoom);
            //stel room in op de startRoom
            currentRoom.addObject(player, 100, 100);
            //zet het karakter op de gewenste plaats in de huidige room
        }
    }
}
