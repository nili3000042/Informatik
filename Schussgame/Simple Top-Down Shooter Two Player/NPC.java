import greenfoot.*;
public class NPC extends Actor //Sorting class.
{
    public void loot() //This long and often modified method is used in multiple Classes, so it was put in this class, so that all the classes that needed it could use it.
    {
        if(Greenfoot.getRandomNumber(101)>20&&getWorld().getObjects(Player_1.class).get(0).upgrade_level<60&&getWorld().getObjects(Player_1.class).get(0).Hearts!=0) //Spawns Upgrade if max Lv. isn't reached and luck.
        {
            getWorld().addObject(new Upgrade(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
        }
        else if(Greenfoot.getRandomNumber(101)>20&&getWorld().getObjects(Player_2.class).get(0).upgrade_level<60&&getWorld().getObjects(Player_2.class).get(0).Hearts!=0) //Spawns Upgrade if max Lv. isn't reached and luck.
        {
            getWorld().addObject(new Upgrade(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
        }
        else if(Greenfoot.getRandomNumber(101)>80&&(getWorld().getObjects(Player_1.class).get(0).forcefield_time+getWorld().getObjects(Player_2.class).get(0).forcefield_time)/MyWorld.game_speed<250) //Spawns a Forcefield if no upgrade was spawned, based on lucḱ and both players together have less then 250 seconds of Forcefield time left.
        {
            getWorld().addObject(new Forcefield_item(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
        }
        if(Greenfoot.getRandomNumber(101)>70&&getWorld().getObjects(Player_1.class).get(0).Hearts<5&&getWorld().getObjects(Player_1.class).get(0).Hearts!=0) //If you have less then 5 hearts it can randomly spawn a Medikit.
        {
            getWorld().addObject(new MediKit(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
        }
        else if(Greenfoot.getRandomNumber(101)>95&&getWorld().getObjects(Player_1.class).get(0).Hearts<10&&getWorld().getObjects(Player_1.class).get(0).Hearts!=0) //If you have less than 10 Hearts it is less likely to spawn a Medikit.
        {
            getWorld().addObject(new MediKit(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
        }
        else if(Greenfoot.getRandomNumber(101)>70&&getWorld().getObjects(Player_2.class).get(0).Hearts<5&&getWorld().getObjects(Player_2.class).get(0).Hearts!=0) //If you have less then 5 hearts it can randomly spawn a Medikit.
        {
            getWorld().addObject(new MediKit(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
        }
        else if(Greenfoot.getRandomNumber(101)>95&&getWorld().getObjects(Player_2.class).get(0).Hearts<10&&getWorld().getObjects(Player_2.class).get(0).Hearts!=0) //If you have less than 10 Hearts it is less likely to spawn a Medikit.
        {
            getWorld().addObject(new MediKit(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
        }
        if(Greenfoot.getRandomNumber(101)>95&&getWorld().getObjects(Player_1.class).get(0).Hearts==0) //Spawns Revive if Player 1 is dead and Luck
        {
            getWorld().addObject(new Revive(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
        }
        else if(Greenfoot.getRandomNumber(101)>95&&getWorld().getObjects(Player_2.class).get(0).Hearts==0) //Spawns Revive if Player 2 is dead and Luck
        {
            getWorld().addObject(new Revive(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
        }
    }
}
