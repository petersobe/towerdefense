import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena extends World
{

    public Arena()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(24, 10, 50); 
        //int width = 24;
        //int height = 10;
        //addObject(new Enemy(), width/2, height/2);
        
        Enemy e = new Enemy();
        e.setRotation(90);
	this.addObject(e, 6, 0);

    }
}
