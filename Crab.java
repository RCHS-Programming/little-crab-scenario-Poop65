import greenfoot.*;  // (World, Actor, greenfootImage, and greenfoot)
/**
 * This class defines the crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-4);
        }    
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        move(5);
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound ("crab.noise");
        }
    }
}  
