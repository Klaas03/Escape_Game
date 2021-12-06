import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Kamer 2
 * 
 * @author Groep8 
 * @version (28/10)
 */
public class Room2 extends BaseRoom
{
    private int count = 0;
    private MyActor DeurDicht1;
    private MyActor DeurDicht2;
    private MyActor Arrow;
    private MyActor DeurOpen; 
    private Player player1;
    private int gamenumber = 0;
    private MyActor bureau;

    public Room2(EscapeGame game, Player player)
    {
        super(game);
        player1 = player;
        GreenfootImage DeurDichtAfb = new GreenfootImage("deurslot.jpg");
        GreenfootImage ArrowAfb = new GreenfootImage("deurslot.jpg");
        

        DeurOpen = new MyActor();
        GreenfootImage DeurOpenAfb = new GreenfootImage("deurslotopen.png");
        DeurOpen.setImage(DeurOpenAfb); 
        addObject(DeurOpen, 78, 49);
        
        bureau = new MyActor();
        GreenfootImage bureauAfb = new GreenfootImage("bureau.png");
        bureau.setImage(bureauAfb);
        addObject(bureau, 503, 101);

        addObject(new Border(), 202, 49);
        addObject(new Border(), 202, 149);
        addObject(new Border(), 202, 249);
        addObject(new Border(), 202, 349);
        addObject(new Border(), 202, 449);
        addObject(new Border(), 202, 493);
        addObject(new Border(), 202, 593);
        addObject(new Border(), 202, 693);

        for (int i = 0; i < 5; i++){
            addObject(new Border(), 1230-i*100, 275);
        }

        addObject(new Border(), 830, 375);
        addObject(new Border(), 830, 475);
        addObject(new Border(), 830, 575);
        addObject(new Border(), 830, 675);

        addObject(new propzekering(), 1223, 70);
        addObject(new propzekering(), 1113, 70);

        DeurDicht1 = new MyActor();
        DeurDicht1.setImage(DeurDichtAfb); 
        addObject(DeurDicht1, 201, 370);
        DeurDicht1.setRotation(90);
        
        Arrow = new MyActor();
        DeurDicht1.setImage(DeurDichtAfb); 
        addObject(DeurDicht1, 201, 370);
        DeurDicht1.setRotation(90);
        
        
        DeurDicht2 = new MyActor();
        DeurDicht2.setImage(DeurDichtAfb); 
        addObject(DeurDicht2, 829, 596);
        DeurDicht2.setRotation(90);
    }

    public void act()
    {
        CheckTouchingExit();
    }

    public void checkForMaze(){

    }

    public void CheckTouchingExit(){
        if (player1.getIntersecting() == DeurOpen)
        {
            
            game.NextRoom(1, 48, 562);
            if (gamenumber == 0){
                removeObject(DeurOpen);
                removeObject(DeurDicht1);
                for (Actor a: getObjectsAt(202, 349, Border.class)){
                removeObject(a);
            }
            for (Actor a: getObjectsAt(202, 449, Border.class)){
                removeObject(a);
            }
            }
            if (gamenumber == 1){
                
            }
            gamenumber = gamenumber + 1;
        }
    }
}
