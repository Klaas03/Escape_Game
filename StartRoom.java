import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * TODO: check walls, make actor that assigns tasks
 */
public class StartRoom extends BaseRoom
{
    private int count = 0;
    private Actor closedDoor;
    private Actor openDoor;
    private boolean checkKey;

    public StartRoom(EscapeGame game){
        super(game);

        checkKey = false;

        closedDoor = (new Actor(){}); 
        openDoor = (new Actor(){});

        GreenfootImage closedDoorafb = new GreenfootImage("closedDoor.png");
        GreenfootImage openDoorafb = new GreenfootImage("openDoor.png");

        closedDoor.setImage(closedDoorafb);
        openDoor.setImage(openDoorafb);

        this.addObject(closedDoor, 953, 351);

        Wizzard wizzard = new Wizzard();
        this.addObject(wizzard, 233, 600);

    }

    public void act(){
        changeDoor(); 
    }

    public boolean checkDoor() {
        return checkKey; // returns if you completed the game
    }

    public void changeDoor() { // remove closed door and place open door
        if (checkKey) {
            this.removeObject(closedDoor);
            this.addObject(openDoor, 953, 351);
        }
    }
}
