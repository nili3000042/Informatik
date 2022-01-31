import greenfoot.*;
public class Forcefield_1 extends NPC //A Forcefield centered on the player, to kill Slimes.
{
    public int image =0; //Used to keep track of wich image is currently displayed.
    public int kills=0; //Used to make shure that only every other kill is counted.
    public void act() //Done around 50 times per secound.
    {
        change_image();
        Kill_Slime();
        move();
    }
    public void move() //Keep the Forcefield centered on the Player.
    {
        this.setLocation(getWorld().getObjects(Player_1.class).get(0).getX(),getWorld().getObjects(Player_1.class).get(0).getY());
    }
    public void Kill_Slime() //Kill's Slimes it touches
    {
        if(this.isTouching(Slime.class)) // Makes Shure it touches a Slime
        {
            MyWorld.Slimes--; //Decreses the number of Slimes by 1.
            kills++; //Increases the kill count.
            if(kills==2) //Every other kill
            {
                MyWorld.Score++; //Increases Score by 1.
                kills=0; //sets kills to 0.
            }
            Greenfoot.playSound("zap14.mp3"); //Plays the kill sound.
            loot(); //Drops Loot.
            this.removeTouching(Slime.class); //Removes slime from the Game.
        }
    }
    public void change_image() //Changes the image to get an Electric Effect.
    {
        if(image==0)
        {
            setImage("SpellBoundemptya1.png");
            image=1;
        }
        else if(image==1)
        {
            setImage("SpellBoundemptya2.png");
            image=2;
        }
        else if(image==2)
        {
            setImage("SpellBoundemptya3.png");
            image=3;
        }
        else if(image==3)
        {
            setImage("SpellBoundemptya2.png");
            image=0;
        }
    }
}
