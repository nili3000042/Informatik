import greenfoot.*;
public class DataPlayer extends Datas
{
    static String gender = "boy";
    
    static String choice;
    
    static int money;
    
    static int interactTimer;
    
    static String previousWorld;
    static String currentWorld;
    
    static Player player;
    
    public void act()
    {
        interactTimer--;
        if(!getWorld().getObjects(Player.class).isEmpty())
            player = getWorld().getObjects(Player.class).get(0);
        currentWorld = getWorld().getClass().getName();
        checkWorld();
    }
    
    public static boolean canInteract()
    {
        return interactTimer < 0;
    }
    
    public static boolean interactInput()
    {
        return Greenfoot.isKeyDown("enter");
    }
    
    public static boolean clickInput(Actor actor)
    {
        return Greenfoot.mouseClicked(actor);
    }
    
    public static void checkWorld()
    {
        if(currentWorld != null)
            switch(currentWorld)
            {
                case "WorldRoute113" : WorldRoute113.originalX = Player.worldX;
                    WorldRoute113.originalY = Player.worldY;
                    break;
                case "WorldTownTrash" : WorldTownTrash.originalX = Player.worldX;
                    WorldTownTrash.originalY = Player.worldY;
                    break;
                case "WorldCenterTownTrash" : WorldCenterTownTrash.originalX = Player.worldX;
                    WorldCenterTownTrash.originalY = Player.worldY;
                    break;
                case "WorldHousePlayerTrash" : WorldHousePlayerTownTrash.originalX = Player.worldX;
                    WorldHousePlayerTownTrash.originalY = Player.worldY;
                    break;
            }
    }
}
