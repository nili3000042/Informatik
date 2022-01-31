import greenfoot.*;
public class ObjectNPC extends Objects
{
    GreenfootImage[] sprites = new GreenfootImage[8];
    
    String[] texts1;
    String[] texts2;
    
    boolean changeText;
    boolean selfAffects;
    
    String type;
    
    String item;
    int number;
    boolean itemWasGiven;
    
    int turnTime;
    int itemTime;
    
    int index;
    
    int randomTime;
    
    public ObjectNPC(String name, String[] texts1, String[] texts2, boolean changeText, boolean selfAffects, String type, String item, int number, int direction, int index)
    {
        sprites[0] = new GreenfootImage("Objects/NPC/" + name + "/Down.png");
        sprites[1] = new GreenfootImage("Objects/NPC/" + name + "/Up.png");
        sprites[2] = new GreenfootImage("Objects/NPC/" + name + "/Left.png");
        sprites[3] = new GreenfootImage("Objects/NPC/" + name + "/Right.png");
        if(!type.equals("still") && !type.equals("turn"))
        {
            sprites[4] = new GreenfootImage("Objects/NPC/" + name + "/DownRun.png");
            sprites[5] = new GreenfootImage("Objects/NPC/" + name + "/UpRun.png");
            sprites[6] = new GreenfootImage("Objects/NPC/" + name + "/LeftRun.png");
            sprites[7] = new GreenfootImage("Objects/NPC/" + name + "/RightRun.png");
        }
        setImage(sprites[direction]);
        this.texts1 = texts1;
        this.texts2 = texts2;
        this.changeText = changeText;
        this.selfAffects = selfAffects;
        this.type = type;
        this.item = item;
        this.number = number;
        this.index = index;
        itemWasGiven = changeText;
        randomTime = Greenfoot.getRandomNumber(50);
        center = 15;
    }
    
    public void act()
    {
        randomTime--;
        itemTime--;
        if(itemTime == 1 && DataPlayer.interactInput())
        {
            getWorld().addObject(new OverlayText(new String[] {"You received " + number + " " + item + "(s)."}, 75), textX, textY);
            DataInventory.addItem(item, number);
            DataPlayer.interactTimer = 10;
            itemWasGiven = true;
        }
        else if(itemTime == 1)
            itemTime++;
        if(itemTime % 75 == 0 && DataPlayer.interactInput())
            itemTime--;
        else if(itemTime % 75 == 0)
            itemTime++;
        checkPlayer();
        switch(type)
        {
            case "turn" : interact();
                turn();
                break;
            case "still" : interact();
                break;
        }
    }
    
    public void turn()
    {
        if(randomTime < 0)
        {
            turnTime--;
            if(turnTime == -1)
            {
                int random = Greenfoot.getRandomNumber(4);
                setImage(sprites[random]);
                turnTime = 74;
            }
            if(turnTime % 75 == 0 && DataPlayer.interactInput() && turnTime != 0)
                turnTime--;
            else if(turnTime % 75 == 0 && turnTime != 0)
                turnTime++;
        }
    }
    
    public void facePlayer()
    {
        if(playerY - getY() > 10)
            setImage(sprites[0]);
        else if(playerY - getY() < -30)
            setImage(sprites[1]);
        else if(playerX - getX() < -10)
            setImage(sprites[2]);
        else if(playerX - getX() > 10)
            setImage(sprites[3]);
    }
    
    public void interact()
    {
        if(isInRange() && DataPlayer.interactInput() && DataPlayer.canInteract())
        {
            if(!changeText)
            {
                getWorld().addObject(new OverlayText(texts1, 75), textX, textY);
                if(type.equals("turn"))
                    turnTime = texts1.length * 75 + 75;
            }
            else if(item != null && itemWasGiven)
            {
                getWorld().addObject(new OverlayText(texts2, 75), textX, textY);
                if(type.equals("turn"))
                    turnTime = texts2.length * 75 + 75;
            }
            else if(item == null)
            {
                getWorld().addObject(new OverlayText(texts2, 75), textX, textY);
                if(type.equals("turn"))
                    turnTime = texts2.length * 75 + 75;
            }
            if(item != null && !changeText)
                itemTime = texts1.length * 75;
            if(texts2 != null && selfAffects)
            {
                changeText = true;
                switch(getWorld().getClass().getName())
                {
                    case "WorldRoute113" : WorldRoute113.npcDone[index] = true;
                        break;
                    case "WorldTownTrash" : WorldTownTrash.npcDone[index] = true;
                        break;
                    case "WorldCenterTownTrash" : WorldCenterTownTrash.npcDone[index] = true;
                        break;
                }
            }
            facePlayer();
            Player.speed = 0;
            DataPlayer.interactTimer = 5;
        }
    }
}
