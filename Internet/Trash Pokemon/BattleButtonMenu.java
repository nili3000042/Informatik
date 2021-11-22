import greenfoot.*;
public class BattleButtonMenu extends BattleButton
{
    GreenfootImage image0, image1;
    
    String type;
    
    int runTime;
    int failedRunTime;
    
    public BattleButtonMenu(String type)
    {
        this.type = type;
        image0 = new GreenfootImage("Buttons/Menu/" + type + "0.png");
        image1 = new GreenfootImage("Buttons/Menu/" + type + "1.png");
        setImage(image0);
        runTime = 0;
    }
    
    public void act()
    {
        runTime--;
        if(runTime == 0 && DataPlayer.interactInput())
        {
            getWorld().showText("", 200, 85);
            getWorld().showText("", 60, 85);
            getWorld().showText("", 470, 316);
            getWorld().showText("", 410, 275);
            getWorld().showText("", 575, 275);
            getWorld().removeObject(getWorld().getObjects(HPEnemy.class).get(0));
            getWorld().removeObject(getWorld().getObjects(HPBarEnemy.class).get(0));
            getWorld().removeObject(getWorld().getObjects(HPPlayer.class).get(0));
            getWorld().removeObject(getWorld().getObjects(HPBarPlayer.class).get(0));
            
            if(!getWorld().getObjects(OverlayText.class).isEmpty())
            {
                getWorld().showText("", getWorld().getObjects(OverlayText.class).get(0).getX(), getWorld().getObjects(OverlayText.class).get(0).getY());
                getWorld().removeObject(getWorld().getObjects(OverlayText.class).get(0));
                if(!getWorld().getObjects(OverlayTextTriangle.class).isEmpty())
                    getWorld().removeObject(getWorld().getObjects(OverlayTextTriangle.class).get(0));
            }
            
            switch(DataPlayer.previousWorld)
            {
                case "WorldRoute113" : getWorld().addObject(new Transition("fade", new WorldRoute113()), 300, 250);
                    break;
            }
        }
        else if(runTime == 0)
            runTime++;
        
        failedRunTime--;
        if(failedRunTime == 0 && DataPlayer.interactInput())
        {
            getWorld().getObjects(DataWildBattle.class).get(0).failedRun();
            if(!getWorld().getObjects(OverlayText.class).isEmpty())
            {
                getWorld().showText("", getWorld().getObjects(OverlayText.class).get(0).getX(), getWorld().getObjects(OverlayText.class).get(0).getY());
                getWorld().removeObject(getWorld().getObjects(OverlayText.class).get(0));
                if(!getWorld().getObjects(OverlayTextTriangle.class).isEmpty())
                    getWorld().removeObject(getWorld().getObjects(OverlayTextTriangle.class).get(0));
            }
        }
        else if(failedRunTime == 0)
            failedRunTime++;
        
        if(isTouching(BattleCursor.class))
            setImage(image1);
        else
            setImage(image0);
        
        if(DataPlayer.interactInput() && DataPlayer.canInteract() && isTouching(BattleCursor.class))
        {
            DataPlayer.interactTimer = 10;
            switch(type)
            {
                case "Fight" : ((WorldWildBattle)getWorld()).addFightButtons();
                    break;
                case "Bag" : ((WorldWildBattle)getWorld()).addBagButtons();
                    break;
                case "Run" : run();
                    break;
                case "Pokemon" :
                    break;
            }
        }
    }
    
    public void run()
    {
        if(Greenfoot.getRandomNumber(5) > 0)
        {
            ((WorldWildBattle)getWorld()).addOverlayText(new String[] {"You managed to run safely."}, 75);
            runTime = 75;
        }
        else
        {
            ((WorldWildBattle)getWorld()).addOverlayText(new String[] {"You didn't manage to run..."}, 75);
            failedRunTime = 75;
        }
    }
}
