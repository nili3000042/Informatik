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
            loot(); // Drops Loot.
            this.removeTouching(Slime.class); //Removes slime from the Game.
        }
    }
}