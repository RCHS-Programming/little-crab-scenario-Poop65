import greenfoot.*;  // (World, Actor, greenfootImage, and greenfoot)
/**
 * This class defines the crab. Crabs live on the beach.
 */
public class Lobster extends Actor
{
    public void act()
    {
        if( isAtEdge() )
        {
            turn(17);
        }
        if (Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }
        
        move(5);
        
        if(isTouching(Crab.class))
        {
            removeTouching(Crab.class);
            Greenfoot.playSound ("au.wav");
            Greenfoot.stop();
        }
    }
}  
