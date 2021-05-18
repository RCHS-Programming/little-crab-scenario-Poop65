import greenfoot.*;  // (World, Actor, greenfootImage, and greenfoot)
/**
 * This class defines the crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        if( isAtEdge() )
        {
            turn(17);
        }
        if (Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(Greenfoot.getRandomNumber(45));
        }
        move();
    }
}  
