import greenfoot.*;
public class HeartCounter_1 extends Displays //Shows the current Hearts left.
{
    public HeartCounter_1() //Shows the Hearts at the start of the Game (5).
    {
         setImage(new GreenfootImage("♥ ♥ ♥ ♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
    }   
    public void act() //Updates the current Hearts Left.
    {
        if(getWorld().getObjects(Player_1.class).get(0).Hearts==10)
        {
            setImage(new GreenfootImage("♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==9)
        {
            setImage(new GreenfootImage("♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==8)
        {
            setImage(new GreenfootImage("♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==7)
        {
            setImage(new GreenfootImage("♥ ♥ ♥ ♥ ♥ ♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==6)
        {
            setImage(new GreenfootImage("♥ ♥ ♥ ♥ ♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==5)
        {
            setImage(new GreenfootImage("♥ ♥ ♥ ♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==4)
        {
            setImage(new GreenfootImage("♥ ♥ ♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==3)
        {
            setImage(new GreenfootImage("♥ ♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==2)
        {
            setImage(new GreenfootImage("♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==1)
        {
            setImage(new GreenfootImage("♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_1.class).get(0).Hearts==0)
        {
            setImage(new GreenfootImage("", 50, Color.RED, new Color(0,0,0,0)));
        }
    }
}
