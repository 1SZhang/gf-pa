import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dinosour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dinosour extends Actor
{
    /**
     * Act - do whatever the Dinosour wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();

    }    

    /**
     * Check wether a control key on the keyboard has been pressed 
     */ 
    public void checkKeyPress()
    { 
        if(Greenfoot.isKeyDown("up"))
        { 
            getWorld().showText("jumping", 300, 300);
            
            setLocation(105, 578);
        }
        else
        {
            setLocation(105,678);
            
            getWorld().showText("", 300, 300);            
        }
        
    }
}