import greenfoot.*;
public class Wall extends Actor
{
    public Wall(int width, int height, int rotation)
    {
        getImage().scale(width, height);
        setRotation(rotation);
    }
    
    public void act()
    {
        Player player = getWorld().getObjects(Player.class).get(0);
        if(isTouching(Player.class))
            player.hitBox();
    }
}
