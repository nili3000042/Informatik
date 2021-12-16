import greenfoot.*;
public class Forcefield_2 extends NPC //A Forcefield_2 centered on the player, to kill Slimes.
{
    public int image =0; //Used to keep track of wich image is currently displayed.
    public int kills=0; //Used to make shure that only every other kill is counted.
    public void act() //Done around 50 times per secound.
    {
        change_image();
        Kill_Slime();
        move();
    }
    public void move() //Keep the Forcefield_2 centered on the Player.
    {
        this.setLocation(getWorld().getObjects(Player_2.class).get(0).getX(),getWorld().getObjects(Player_2.class).get(0).getY());
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
            if(Greenfoot.getRandomNumber(101)>20&&getWorld().getObjects(Player_1.class).get(0).upgrade_level<60|Greenfoot.getRandomNumber(101)>20&&getWorld().getObjects(Player_2.class).get(0).upgrade_level<60) //Spawns Upgrade if max Lv. isn't reached and luck.
            {
                getWorld().addObject(new Upgrade(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            else if(Greenfoot.getRandomNumber(101)>80&&(getWorld().getObjects(Player_1.class).get(0).forcefield_time+getWorld().getObjects(Player_2.class).get(0).forcefield_time)/MyWorld.game_speed<250) //Spawns a Forcefield_2 if no upgrade was spawned, based on lucḱ and both players together have less then 250 seconds of Forcefield_2 time left.
            {
                getWorld().addObject(new Forcefield_item(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            if(Greenfoot.getRandomNumber(101)>70&&getWorld().getObjects(Player_1.class).get(0).Hearts<5|Greenfoot.getRandomNumber(101)>70&&getWorld().getObjects(Player_2.class).get(0).Hearts<5) //If you have less then 5 hearts it can randomly spawn a Medikit.
            {
                getWorld().addObject(new MediKit(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            else if(Greenfoot.getRandomNumber(101)>95&&getWorld().getObjects(Player_1.class).get(0).Hearts<10|Greenfoot.getRandomNumber(101)>95&&getWorld().getObjects(Player_2.class).get(0).Hearts<10) //If you have less than 10 Hearts it is less likely to spawn a Medikit.
            {
                getWorld().addObject(new MediKit(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
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
