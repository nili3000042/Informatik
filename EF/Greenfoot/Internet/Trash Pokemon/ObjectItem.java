import greenfoot.*;
public class ObjectItem extends Objects
{
    String item;
    String name;
    int number;
    
    int index;
    
    public ObjectItem(String item, int number, int index)
    {
        setImage("Objects/Item/Default.png");
        center = 10;
        switch(item)
        {
            case "SuperPotion" : name = "Super Potion";
                break;
            default : name = item;
                break;
        }
        this.item = item;
        this.number = number;
        this.index = index;
    }
    
    public void act()
    {
        checkPlayer();
        if(isInRange() && DataPlayer.interactInput() && DataPlayer.canInteract())
        {
            getWorld().addObject(new OverlayText(new String[] {"You found " + number + " " + name + "(s)."}, 75), textX, textY);
            Player.speed = 0;
            DataPlayer.interactTimer = 5;
            DataInventory.addItem(item, number);
            switch(getWorld().getClass().getName())
            {
                case "WorldRoute113" : WorldRoute113.itemTaken[index] = true;
                    break;
                case "WorldTownTrash" : WorldTownTrash.itemTaken[index] = true;
                    break;
            }
            getWorld().removeObject(this);
        }
    }
    
    @Override
    public boolean isInRange()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        boolean isInRange = (Math.abs(player.getY() - getY()) < 30 && Math.abs(player.getX() - getX()) < 30);
        if(isInRange && playerY - getY() > (getImage().getHeight() / 3))
            return(player.getImage() == player.sprites[1]);
        else if(isInRange && playerY - getY() < - getImage().getHeight())
            return(player.getImage() == player.sprites[0]);
        else if(isInRange && playerX - getX() < -9)
            return(player.getImage() == player.sprites[3]);
        else if(isInRange && playerX - getX() > 9)
            return(player.getImage() == player.sprites[2]);
        return false;
    }
}
