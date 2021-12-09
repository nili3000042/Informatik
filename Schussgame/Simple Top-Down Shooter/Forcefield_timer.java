import greenfoot.*;
public class Forcefield_timer extends Displays //Displays the current Forcefield time left.
{
    public Forcefield_timer()
    {
         setImage(new GreenfootImage("Forcefield: ", 50, Color.WHITE, new Color(0,0,0,0)));
    }   
    public void act()
    {
        display_score();
    }
    public void display_score()
    {
        setImage(new GreenfootImage("Forcefield: " + MyWorld.forcefield_active/MyWorld.game_speed, 50, Color.WHITE, new Color(0,0,0,0)));
    }
}
