import greenfoot.*;  

public class Pengu extends Mover
{
    private static final int jumpStrength = 16;
    
    public void act() 
    {
        checkKeys();        
        checkFall();
    }
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("q") )
        {
            setImage("pengu-left.png");
            moveLeft();
        }
        if (Greenfoot.isKeyDown("d") )
        {
            setImage("pengu-right.png");
            moveRight();
        }
        if (Greenfoot.isKeyDown("space") )
        {
            if (NotonGround() == false)
                jump();
        }
    }    
    
    private void jump()
    {
        setVSpeed(-jumpStrength);
        fall();
    }
    
    private void checkFall()
    {   
        if (atBottom()) {
            setLocation(66,244);
        }
        else {
            if (NotonGround()){
                fall();
            }
        }
    }
}
