import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shooter extends BaseRoom
{
    private int score;
    private int time;
    private int timeInSeconds;
    
    public Shooter(EscapeGame game, Player player)
    {
        super(game);
        score = 0;
        showScore();
        time = 6000;
        timeInSeconds = time/60;
        showTime();
    }
    
    public void act()
    {
        showScore();
        countTime();
        timeInSeconds = time/60;
        
        if(time == 0)
        {
            //ga terug naar kamer
        }
        
        if(Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Virus(), 1280, Greenfoot.getRandomNumber(720));
        }
        if(Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Data(), 1280, Greenfoot.getRandomNumber(720));
        }
    }
    
    private void showTime()
    {
        showText("Time: " + timeInSeconds, 110, 65);
    }
    private void countTime()
    {
        time--;
        showTime();
        if(time == 0)
        {
            Greenfoot.stop();
        }
    }
    
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        /*if(score < 0)
        {
            Greenfoot.setWorld();
        }*/
    }
    private void showScore()
    {
        showText("Score: " + score, 100, 40);
    }
}
