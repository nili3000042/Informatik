import greenfoot.*;
public class Forcefield_item extends NPC // A Pickupable item used to give the Player a Forcefield.
{
    public int image =0; //Used to keep track of wich image is currently displayed.
    public void act() //Changes the image to get an Electric Effect.
    {
        if(image==0)
        {
            setImage("SpellBoundemptyb1.png");
            image=1;
        }
        else if(image==1)
        {
            setImage("SpellBoundemptyb2.png");
            image=2;
        }
        else if(image==2)
        {
            setImage("SpellBoundemptyb3.png");
            image=3;
        }
        else if(image==3)
        {
            setImage("SpellBoundemptyb2.png");
            image=0;
        }
    }
}
