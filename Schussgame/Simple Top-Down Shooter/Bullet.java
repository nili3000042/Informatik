import greenfoot.*;
public class Bullet extends NPC //Shoot from the Player to kill enemys.
{
    public void act() //Done around 50 times per secound.
    {
        this.move(20); //Moves the Bullet.
        Kill_Slime();
        if(this.isAtEdge()) // Kills itself if it touches the Edge.
        {
            this.getWorld().removeObject(this);
        }
    }
    public void Kill_Slime() //Kill's Slimes it touches
    {
        if(this.isTouching(Slime.class)) // Makes Shure it touches a Slime
        {
            MyWorld.Slimes--; //Decreses the number of Slimes by 1.
            MyWorld.Score++; //Increases Score by 1.
            Greenfoot.playSound("impactsplat05[].mp3"); //Plays the kill sound.
            if(Greenfoot.getRandomNumber(101)>20&&getWorld().getObjects(Player.class).get(0).upgrade_level<60) //Spawns Upgrade if max Lv. isn't reached and luck.
            {
                getWorld().addObject(new Upgrade(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            else if(Greenfoot.getRandomNumber(101)>80&&getWorld().getObjects(Player.class).get(0).forcefield_active/MyWorld.game_speed<180) //Spawns a Forcefield if no upgrade was spawned, based on lucḱ and you have less then 180 seconds of Forcefield time left.
            {
                getWorld().addObject(new Forcefield_item(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            if(Greenfoot.getRandomNumber(101)>70&&getWorld().getObjects(Player.class).get(0).Hearts<5) //If you have less then 5 hearts it can randomly spawn a Medikit.
            {
                getWorld().addObject(new MediKit(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            else if(Greenfoot.getRandomNumber(101)>95&&getWorld().getObjects(Player.class).get(0).Hearts<10) //If you have less than 10 Hearts it is less likely to spawn a Medikit.
            {
                getWorld().addObject(new MediKit(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            this.removeTouching(Slime.class); //Removes slime from the Game.
        }
    }
}