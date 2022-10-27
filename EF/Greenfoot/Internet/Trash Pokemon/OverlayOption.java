import greenfoot.*;
public class OverlayOption extends Actor
{
    String[] options;
    int optionNumber;
    
    int time;
    
    OverlayChoiceTriangle overlayChoiceTriangle;
    
    public OverlayOption(String[] options)
    {
        this.options = options;
        optionNumber = options.length;
        overlayChoiceTriangle = new OverlayChoiceTriangle(optionNumber);
        getImage().scale(150, 36 * optionNumber + 10);
        time = 11;
    }
    
    public void act()
    {
        time--;
        getWorld().addObject(overlayChoiceTriangle, getX() - 60, getY() - 18 * (optionNumber - 1));
        for(int i = 0; i < optionNumber; i++)
            getWorld().showText(options[i], getX(), getY() + 36 * i - 18 * (optionNumber - 1));
        if(DataPlayer.interactInput() && time < 3)
        {
            DataPlayer.choice = options[overlayChoiceTriangle.currentChoice];
            DataPlayer.interactTimer = 10;
            for(int i = 0; i < optionNumber; i++)
                getWorld().showText("", getX(), getY() + 36 * i - 18 * (optionNumber - 1));
            getWorld().removeObject(overlayChoiceTriangle);
            getWorld().removeObject(this);
        }
    }
    
    @Override
    public void setLocation(int x, int y)
    {}
}
