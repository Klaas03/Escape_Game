import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends FinalRoomProps
{
    private int speed;
    private int damage;
       
    public Laser(int s)
    {
        speed = s;
        GreenfootImage Laser= getImage();
        Laser.scale(50,50);
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public void setSpeed(int s)
    {
        speed = s;
    }
    
    public void act()
    {
        move(speed);
        checkBoundaries();
        checkCollision();
        
    }
    
    public void checkBoundaries()
    {
        GreenfootImage img = getImage();
        int width = img.getWidth();
        int height = img.getHeight();
        
        World world = getWorld();
        
        int left = getX() - width/2;
        int right = getX() + width/2;
        int top = getY() - height/2;
        int bottom = getY() + height/2;
        
        if(getWorld() != null && left <= 0)
        {
            world.removeObject(this);
        }
        else if(getWorld() != null && right >= world.getWidth())
        {
            world.removeObject(this);
        }
        else if(getWorld() != null && top <= 0)
        {
            world.removeObject(this);
        }
        else if(getWorld() != null && bottom >= world.getHeight())
        {
            world.removeObject(this);
        }
    }
    
    private void checkCollision()
    {
        boolean killedVirus = false;
        boolean killedData = false;
        if(getWorld() != null && isTouching(Virus.class))
        {
            World world = getWorld();
            removeTouching(Virus.class);
            Shooter mi = (Shooter)getWorld();
            mi.addScore(20);
            killedVirus = true;
            
            if(killedVirus)
            {
                getWorld().removeObject(this);
                killedVirus = false;
            }
        }   
        
        if(getWorld() != null && isTouching(Data.class))
        {
            World world = getWorld();
            removeTouching(Data.class);
            Shooter mi = (Shooter)getWorld();
            mi.addScore(-25);
            killedData = true;
            
            if(killedData)
            {
                getWorld().removeObject(this);
                killedVirus = false;
            }
        }
    }
}
