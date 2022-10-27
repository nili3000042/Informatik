import greenfoot.*;
public class ObjectText extends Objects
{
    String[] texts;
    
    public ObjectText(String name, String[] texts)
    {
        setImage("Objects/Text/" + name + ".png");
        this.texts = texts;
        switch(name)
        {
            case "PCCenter" : center = 30;
                break;
            case "TVHouse" :
            case "PCHouse" : center = 25;
                break;
            case "SignWood" : center = 15;
                break;
        }
    }
    
    public void act()
    {
        checkPlayer();
        if(isInRange() && DataPlayer.interactInput() && DataPlayer.canInteract())
        {
            getWorld().addObject(new OverlayText(texts, 75), textX, textY);
            Player.speed = 0;
            DataPlayer.interactTimer = 1;
        }
    }
}
