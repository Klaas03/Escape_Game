import greenfoot.*; 
public class Scene extends BaseRoom
{
    private Pengu pengu;
    

    public Scene(EscapeGame game, Player player)
    {    
        super(game);    

        addObject ( new Zekeringskast(false), 85, 618);
        addObject ( new Zekeringskast(true), 639, 618);
        addObject ( new Zekeringskast(true), 1200, 618);
        
        addObject ( new Pc(240, 500, 1), 240, 510 );
        
        addObject( new Pc(800,1000, 2), 805, 510 ) ;
        
        pengu = new Pengu();
        addObject ( pengu, 76, 478 );
    }
    
    public void act(){
        checkExit();
    }
    
    public void checkExit(){
        if (pengu.getX() > 1200){
            game.NextRoom(-2, 100, 200);
        }
    }
}
