import greenfoot.*;
public class Forcefield_timer_1 extends Displays //Displays the current Forcefield time left.
{
    public Forcefield_timer_1()
    {
        setImage(new GreenfootImage("Forcefield: ", 50, Color.WHITE, new Color(0,0,0,0)));
    }   
    public void act() // Updates the current Forcefield time left.
    {
        setImage(new GreenfootImage("Forcefield: " + getWorld().getObjects(Player_1.class).get(0).forcefield_time/MyWorld.game_speed, 50, Color.WHITE, new Color(0,0,0,0)));
    }
}