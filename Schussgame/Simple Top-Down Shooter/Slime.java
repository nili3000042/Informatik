import greenfoot.*;
public class Slime extends NPC //Enemy of the Player.
{
    public int normal=0;
    public void act() //Done around 50 times per secound.
    {
        rnd_Move();
        Kill_Player();
    }
    public void Kill_Player() //Kills the Player.
    {
        if(isTouching(Player.class)&&getWorld().getObjects(Player.class).get(0).immortal==0) //Makes shure it touches the Player and the Player isn't immortal.
        {
            getWorld().getObjects(Player.class).get(0).Hearts--; //Decreases the Hearts of the Player.
            Greenfoot.playSound("cyborg_hurt_one.mp3"); //Playes the Taking Damage sound.
            getWorld().getObjects(Player.class).get(0).immortal=150; //Gives the Player around 3 Seconds of Immortality.
        }
    }
    public void rnd_Move() //Makes the Slime move more or less randomly.
    {
        if (normal<10) //the slime moves Forwards for around 1/5 of a second.
        {
            this.move(1);
            normal=normal+1;
        }
        else if(Greenfoot.getRandomNumber(100)>70) //Has a chance of moving one random direction.
        {
            this.setRotation(Greenfoot.getRandomNumber(361));
            normal=0;
        }
        else //Is more likely to Move Towards.
        {
            this.turnTowards(getWorld().getObjects(Player.class).get(0).getX(),getWorld().getObjects(Player.class).get(0).getY());
            normal=0;
        }
    }
}
