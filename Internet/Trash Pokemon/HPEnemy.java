import greenfoot.*;
public class HPEnemy extends Battle
{
    public HPEnemy()
    {
        setImage("Battle/HPEnemy.png");
    }
    
    public void act()
    {
        if(getY() < 100)
            setLocation(getX(), getY() + 3);
    }
}
