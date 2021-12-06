import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Data here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Data extends FinalRoomProps
{
    public void act()
    {
        setLocation(getX() - 3, getY());
        
        if(getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
