import greenfoot.*;
public class ScoreCounter extends Displays // Displays the current Score.
{
    public ScoreCounter() // Displays the Score at the start of the Game (0).
    {
         setImage(new GreenfootImage("Score: 0", 50, Color.WHITE, new Color(0,0,0,0)));
    }   
    public void act() //Updates the Score.
    {
        setImage(new GreenfootImage("Score: " + MyWorld.Score, 50, Color.WHITE, new Color(0,0,0,0)));
    }
}
