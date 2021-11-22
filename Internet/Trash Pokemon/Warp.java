import greenfoot.*;
public class Warp extends Actor
{
    String destinationWorld;
    int destinationX, destinationY;
    
    int index;
    
    public Warp(String destinationWorld, int x, int y, int width, int height, int index)
    {
        getImage().scale(width, height);
        destinationX = x;
        destinationY = y;
        this.destinationWorld = destinationWorld;
        this.index = index;
    }
    
    public void act()
    {
        if(isTouching(Player.class))
            switch(destinationWorld)
            {
                case "WorldTownTrash" : WorldTownTrash.originalX = destinationX;
                    WorldTownTrash.originalY = destinationY;
                    DataPlayer.previousWorld = getWorld().getClass().getName();
                    Greenfoot.setWorld(new WorldTownTrash());
                    break;
                case "WorldRoute113" : WorldRoute113.originalX = destinationX;
                    WorldRoute113.originalY = destinationY;
                    DataPlayer.previousWorld = getWorld().getClass().getName();
                    Greenfoot.setWorld(new WorldRoute113());
                    break;
                case "WorldCenterTownTrash" : WorldCenterTownTrash.originalX = destinationX;
                    WorldCenterTownTrash.originalY = destinationY;
                    DataPlayer.previousWorld = getWorld().getClass().getName();
                    Greenfoot.setWorld(new WorldCenterTownTrash());
                    break;
                case "WorldHousePlayerTownTrash" : WorldHousePlayerTownTrash.originalX = destinationX;
                    WorldHousePlayerTownTrash.originalY = destinationY;
                    DataPlayer.previousWorld = getWorld().getClass().getName();
                    Greenfoot.setWorld(new WorldHousePlayerTownTrash());
                    break;
            }
        
        if(Greenfoot.isKeyDown("y"))
        {
            int width = getImage().getWidth();
            int height = getImage().getHeight();
            setImage("BlankDebug.png");
            getImage().scale(width, height);
        }
        else
        {
            int width = getImage().getWidth();
            int height = getImage().getHeight();
            setImage("Blank.png");
            getImage().scale(width, height);
        }
    }
}
