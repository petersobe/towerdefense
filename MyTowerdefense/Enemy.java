import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * basic enemy
 * @author (peter) 
 * @version (0.96)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /*
           enemy move 2 steps rightwards
        */
        // Add your action code here.
        this.move(1); 
        
        if (this.isAtEdge())
        {
            this.turn(180);
        }
        
        
        
        if (this.isTouching(Direction.class))
        {
            Direction direction = (Direction) this.getOneIntersectingObject(Direction.class); 
            if (direction !=null)
            {
              int rotation = direction.getRotation();
              this.setRotation(rotation);
            }
        }
        else 
        {
            if (this.isTouching(Orb.class))
            {
                this.turn(-90);
            }
        }    
    
    }
}
