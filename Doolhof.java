import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Doolhof here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doolhof extends BaseRoom
{   
    private MyActor RedButton;
    private MyActor FutureDoor;
    private Player player1;
    private MyActor Uitleg;
    private MyActor Sleutel;
    private MyActor DeurDicht;
    private MyActor DeurOpen;
    
    public Doolhof(EscapeGame game, Player player)
    {
        super(game);
        
        player1 = player;
        
        RedButton = new MyActor();
        GreenfootImage RedButtonAfb = new GreenfootImage("RedButton.png");
        RedButtonAfb.scale(70, 70);
        RedButton.setImage(RedButtonAfb); 
        addObject(RedButton, 550, 150); 
        
        for (int i = 0; i <2; i++){
            addObject(new Border(), i*100 + 1030, 50);
        }
        DeurDicht = new MyActor();
        GreenfootImage DeurDichtAfb = new GreenfootImage("deurslot.jpg");
        DeurDicht.setImage(DeurDichtAfb); 
        addObject(DeurDicht, 1105, 50);
        
        
        DeurOpen = new MyActor();
        GreenfootImage DeurOpenAfb = new GreenfootImage("deurslotopen.png");
        DeurOpen.setImage(DeurOpenAfb); 
        
        
        Uitleg = new MyActor();
        GreenfootImage UitlegAfb = new GreenfootImage("uitleg.png");
        Uitleg.setImage(UitlegAfb); 
        
        
        for (int i = 0; i <10; i++){
            addObject(new Border(), i*100 + 50, 50);
        }
        addObject(new Border(), 980, 50);
        addObject(new Border(), 1230, 50);
        
        for (int i = 0; i < 4; i++){
            addObject(new Border(), 50, i*100 + 150);
         }
        addObject(new Border(), 50, 670);
        
        for (int i = 0; i < 7; i++){
            addObject(new Border(), 1230, i*100 + 150);
         }
        
        for (int i = 0; i <13; i++){
            addObject(new Border(), i*100 + 50, 670);
        }
        
        for (int i = 0; i < 8; i++){
            addObject(new Border(), i*100 + 250, 450);
        }
        addObject(new Border(), 980, 450);   
        
        for (int i = 0; i < 2; i++){
            addObject(new Border(), 250, 350 - i*100);
        }
        
        for (int i = 0; i < 3; i++){
            addObject(new Border(), 450, 350 - i*100);
        }
        
        for (int i = 0; i < 2; i++){
            addObject(new Border(), 980,  350 - i*100);
        }
        
        for (int i = 0; i < 2; i++){
            addObject(new Border(), 850,  350 - i*100);
        }
        
        for (int i = 0; i < 2; i++){
            addObject(new Border(), 950,  350 - i*100);
        }
        
        for (int i = 0; i < 2; i++){
            addObject(new Border(), 650,  150 + i*100);
        }
        
        addObject(new Border(), 150, 450);
                
        FutureDoor = new MyActor();
        GreenfootImage FutureDoorAfb = new GreenfootImage("FutureDoor.jpg");
        FutureDoorAfb.scale(70, 70);
        FutureDoorAfb.scale(150, 120);
        FutureDoor.setImage(FutureDoorAfb); 
        addObject(FutureDoor, 150, 450);
        
        Sleutel = new MyActor();
        GreenfootImage SleutelAfb = new GreenfootImage("sleutel.jpg");
        SleutelAfb.scale(70,  70);
        Sleutel.setImage(SleutelAfb); 
        addObject(Sleutel, 350, 350); 
    }
    
    public void act(){
        CheckTouchingRedButton();
        CheckTouchingFutureDoor();
        CheckTouchingKey();
        CheckTouchingExit();
    }
    
    public void CheckTouchingRedButton(){
        if (player1.getIntersecting() == RedButton){
            removeObject(RedButton);
            removeObject(FutureDoor);
            removeObject(Uitleg);
            for (Actor a: getObjectsAt(150, 450, Border.class)){
                removeObject(a);
            }
        }
    }
    
    public void CheckTouchingFutureDoor(){
        if (player1.getIntersecting() == FutureDoor){
            addObject(Uitleg, 241, 202);
        }
    }
    
    public void CheckTouchingKey(){
        if (player1.getIntersecting() == Sleutel){
            removeObject(Sleutel);
            removeObject(DeurDicht);
            for (Actor a: getObjectsAt(1030, 50, Border.class)){
                removeObject(a);
            }
            for (Actor a: getObjectsAt(1130, 50, Border.class)){
                removeObject(a);
            }
            addObject(DeurOpen, 1105, 50);
        }
    }
    
    public void CheckTouchingExit(){
        if (player1.getIntersecting() == DeurOpen){
            game.NextRoom(-1, 100, 400);
        }
    }
}
