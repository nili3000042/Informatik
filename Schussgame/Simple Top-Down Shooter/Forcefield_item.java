import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forcefield_item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forcefield_item extends NPC
{
    public int image =0;
    public void act()
    {
        change_image();
    }
    public void change_image()
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
