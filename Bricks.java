import greenfoot.*;

/**
 * Write a description of class Bricks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bricks extends Actor
{
    /**
     * Act - do whatever the Bricks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public boolean checkBall()
    {
        if(getOneIntersectingObject(Ball.class)!=null)return true;
        else return false;
    }
}
