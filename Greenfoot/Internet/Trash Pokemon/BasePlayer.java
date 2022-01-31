public class BasePlayer extends Battle
{
    public BasePlayer(String type)
    {
        setImage("Battle/BasePlayer" + type + ".png");
    }
    
    public void act()
    {
        if(getY() > 369)
            setLocation(getX(), getY() - 2);
    }
}
