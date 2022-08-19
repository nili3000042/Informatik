import greenfoot.*;
public class BattleButtonFight extends BattleButton
{
    GreenfootImage image0, image1;
    
    String name;
    
    public BattleButtonFight(String name)
    {
        this.name = name;
        image0 = new GreenfootImage("Buttons/Fight/" + name + "0.png");
        image1 = new GreenfootImage("Buttons/Fight/" + name + "1.png");
        setImage(image0);
    }
    
    public void act()
    {
        if(isTouching(BattleCursor.class))
            setImage(image1);
        else
            setImage(image0);
        
        if(DataPlayer.interactInput() && DataPlayer.canInteract() && isTouching(BattleCursor.class) && name != null)
        {
            DataPlayer.interactTimer = 10;
            DataWildBattle dataWildBattle = getWorld().getObjects(DataWildBattle.class).get(0);
            dataWildBattle.startTurn(name);
        }
        
        if(Greenfoot.isKeyDown("escape"))
            ((WorldWildBattle)getWorld()).addMenuButtons();
    }
}
