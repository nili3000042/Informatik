import greenfoot.*;
public class ObjectMenuScreen extends Objects
{
    String name;
    
    boolean swap = true;
    int time = 0;
    
    public ObjectMenuScreen(String name)
    {
        this.name = name;
        setImage("Objects/Menu/" + name + ".png");
        if(name.equals("ScreenContinue"))
            getImage().setTransparency(0);
    }
    
    public void act()
    {
        switch(name)
        {
            case "ScreenPokemon" : 
                if(getX() < 675)
                    move(4);
                break;
            case "ScreenTrash" : 
                if(getX() > 0)
                    move(-4);
                break;
            case "ScreenContinue" : 
                if(time == 0 || time == 250)
                    swap = !swap;
                if(swap)
                    time -= 2;
                else
                    time +=2;
                getImage().setTransparency(time);
                break;
            case "ScreenPowered" :
                time++;
                if(getY() > 245 && time > 150)
                    setLocation(getX(), getY() - 3);
        }
    }
}
