import greenfoot.*;
public class ObjectSpecialDoor extends Objects
{
    int time;
    
    String name;
    
    boolean hasInteracted;
    
    public ObjectSpecialDoor(String name)
    {
        this.name = name;
        center = 5;
        setImage("Objects/Special/Door/" + name + ".png");
    }
    
    public void act()
    {
        checkPlayer();
        if(hasInteracted)
            interact();
    }
    
    public void interact()
    {
        time++;
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        Player.speed = 0;
        player.setLocation(player.getX(), player.getY() - 1);
        switch(name)
        {
            case "Center" :
                if(time < 26)
                    move(-2);
                else if(time < 51)
                    move(2);
                break;
            case "HouseRed" :
                if(time < 26)
                    move(2);
                else if(time < 51)
                    move(-2);
                break;
        }
        if(time % 20 == 0)
            player.setImage(player.sprites[1]);
        else if(time % 10 == 0)
            player.setImage(player.sprites[5]);
    }
    
    @Override
    public void checkPlayer()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        playerX = player.getX();
        playerY = player.getY();
        if(isTouching(Player.class) && playerY < getY() + center)
            hasInteracted = true;
    }
    
}
