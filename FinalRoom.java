import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalRoom extends BaseRoom
{

    /**
     * Constructor for objects of class FinalRoom.
     * 
     */
    public FinalRoom(EscapeGame game, Player player)
    {
        super(game);
        prepare();
    }
    
    private void prepare()
    {
        Server Server = new Server();
        addObject(Server,134,124);
        Server Server2 = new Server();
        addObject(Server2,135,596);
        Server Server3 = new Server();
        addObject(Server3,498,125);
        Server Server4 = new Server();
        addObject(Server4,491,601);
        Server Server5 = new Server();
        addObject(Server5,871,125);
        Server Server6 = new Server();
        addObject(Server6,859,600);
        Fence Fence = new Fence();
        addObject(Fence,1141,125);
        Laptop Laptop = new Laptop();
        addObject(Laptop,1138,593);
        Laptop.setLocation(1138,599);
        Fence Fence2 = new Fence();
        addObject(Fence2,1138,599);
        Laptop.setLocation(1137,598);
        Fuze Fuze = new Fuze();
        addObject(Fuze,310,47);
        Fuze Fuze2 = new Fuze();
        addObject(Fuze2,665,672);
        RealFuze RealFuze = new RealFuze();
        addObject(RealFuze,680,46);
        Perkament Perkament = new Perkament();
        addObject(Perkament,233,679);
        addObject(new OpenDoor(), 74, 347);
    }
}
