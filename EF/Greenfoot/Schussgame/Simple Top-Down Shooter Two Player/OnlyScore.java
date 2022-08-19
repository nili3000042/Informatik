import greenfoot.*;
public class OnlyScore extends Displays //Displays only the Score of the Player:
{
    public OnlyScore() //Displays the Score.
    {
        String score_string = Integer.toString(MyWorld.Score);
        setImage(new GreenfootImage(score_string, 50, Color.BLACK, new Color(0,0,0,0)));
    }   
    public void act() //Updates the Score.
    {
        String score_string = Integer.toString(MyWorld.Score);
        setImage(new GreenfootImage(score_string, 100, Color.BLACK, new Color(0,0,0,0)));
    }
}
