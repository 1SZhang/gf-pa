import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    // Track time going up
    private int frames = 1;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        // Set the initial time
        String initialTime = "Time: 0";
        showText(initialTime, 100, 50);

    }

    public void act()
    {
        // Track time
        updateTime();

        // Increment frame (roughly 60 frames per second)
        frames = frames + 1;

    }

    // Track the time
    private void updateTime()
    {
        // Every 60 frames (every 1 second) update the time
        if ((frames % 60) == 0)
        {
            String timeElapsed = "Time: " + Integer.toString(frames / 60);
            showText(timeElapsed, 100, 50);
        }
    }

    // A new dinosour
    private void addDinosour()
    { Dinosour newDinosour = new Dinosour(); 

    }
}
