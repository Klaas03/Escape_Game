import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShooterCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShooterCharacter extends FinalRoomProps
{
    int Speed = 3;
    private boolean trigger;
    
    public ShooterCharacter()
    {
        GreenfootImage image = getImage();
        image.scale(150, 150); 
        setImage(image);
        trigger = true;
    }
    public void act()
    {
        move(Speed);
        processShot();
        TrackMouse();
    }

    /*
     * besturing: z naar boven
     * d naar recht, s naar onder, q naar links
     */

    public void move(int speed) 
    {
        if (Greenfoot.isKeyDown("q")) 
        {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("z"))
        {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + speed);
        }
    }
    
    public void TrackMouse()
    {
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if(mouseInfo != null)
        {
            turnTowards(mouseInfo.getX(), mouseInfo.getY());
        }
    }
    
    public void processShot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            shoot(new Laser(5));
        }
        else
        {
            trigger = true; 
        }
    }
    
    public void shoot(Laser laser)
    {
        if(trigger)
        {
        laser.setRotation(getRotation());
        getWorld().addObject(laser, getX(), getY());
        laser.move(getImage().getWidth()/2 );
        trigger = false;
        }
    }
}
