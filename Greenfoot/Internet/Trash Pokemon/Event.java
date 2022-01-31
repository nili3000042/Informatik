import greenfoot.*;
public class Event extends Actor
{
    String name;
    
    public Event(String name, int width, int height)
    {
        this.name = name;
        getImage().scale(width, height);
    }
    
    public void act()
    {
        if(isTouching(Player.class))
            switch(name)
            {
                case "prof0" : getWorld().addObject(new ObjectSpecialNPCProfessor(0), ((WorldTownTrash)getWorld()).scrollActor.getX(), 0);
                    ((WorldTownTrash)getWorld()).scrollActor.setImage(((WorldTownTrash)getWorld()).scrollActor.sprites[1]);
                    Player.speed = 0;
                    WorldTownTrash.eventProf = 1;
                    getWorld().removeObject(this);
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
