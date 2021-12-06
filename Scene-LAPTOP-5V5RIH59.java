import greenfoot.*; 
public class Scene extends BaseRoom
{


    public Scene(EscapeGame game, Player player)
    {    
        super(game);    

        addObject ( new Zekeringskast(false), 85, 618);
        addObject ( new Zekeringskast(true), 639, 618);
        
        
        addObject ( new Pc(), 369, 315 );
        
        addObject( new Pc(), 800, 650 ) ;
        
        addObject ( new Pengu(), 66, 244 );
    }
}
