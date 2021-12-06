import greenfoot.*;  


public class Pc extends GameLeo
{
    private int speed;
    private int leftTurn;
    private int rightTurn;

    public Pc(int x, int y, int spe){
        leftTurn = x;
        rightTurn = y;
        speed = spe;
    }
    public void act() 
    {
        setLocation ( getX() + speed, getY() );
        
        Actor actor = getOneIntersectingObject(null);
        if(actor != null) {
            actor.setLocation ( actor.getX() + speed, actor.getY() );
        }
        
        if (atTurningPoint()) {
            speed = -speed;
        }
    }
    
    /**
     * Test if we are at one of the turning points.
     */
    public boolean atTurningPoint()
    {
        return (getX() <= leftTurn || getX() >= rightTurn);
    }
    
    
}
