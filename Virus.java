import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus extends FinalRoomProps
{
    boolean endWorld;
    
    public Virus()
    {
        GreenfootImage image = getImage();
        image.scale(50, 50); 
        setImage(image);
    }
    
    public void act()
    {
        setLocation(getX() - 3, getY());
        endWorld = false;
        if(getX() == 10)
        {
            World world = getWorld();
            Shooter shooter = (Shooter)getWorld();
            shooter.addScore(-100);
            endWorld = true;
            
            if(endWorld)
            {
                world.removeObject(this);
            }
        }
    }
}
