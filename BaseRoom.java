import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * beschrijft basiseigenschappen van al de mappen
 * 
 * Groep 8 
 * versie 28/10/2021
 */
public class BaseRoom extends World
{
    public static final int WIDTH = 1020;   //breedte instellen v/d rooms
    public static final int HEIGHT = 574;   //hoogte instellen v/d rooms
    public static final int RESOLUTION = 1; //resolutie instellen v/d rooms
    private EscapeGame game;
    
    //protected EscapeGame escapeGame;
    /**
    *protected is een functie tussen public en private zodat andere actoren
    *bepaalde dingen kunnen opvragen maar niet alles
    *prof zei om dit gewoon zonder teveel denken over te nemen
    */
    public BaseRoom(EscapeGame game)
    {    
        super(WIDTH/RESOLUTION, HEIGHT/RESOLUTION, RESOLUTION); //de grootte instellen
        this.game = game;
        World world = new CharacSelect(this.game); 
        Greenfoot.setWorld(world);
    }
    
    public void act() {
        
    }
    
    public void NextRoom()
    {
        //escapeGame.NextRoom();
    }
}
