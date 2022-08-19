import greenfoot.*;
public class OverlayText extends Actor
{
    String[] texts;
    int time;
    int textTime;
    
    String writing = "";
    int currentChar;
    
    OverlayTextTriangle triangle = new OverlayTextTriangle();
    int triangleX, triangleY;
    
    String world;
    
    public OverlayText(String[] texts, int textTime)
    {
        String[] tempArray = java.util.Arrays.copyOf(texts, texts.length);
        for(int i = 0; i < tempArray.length / 2; i++)
        {
            String temp = tempArray[i];
            tempArray[i] = tempArray[tempArray.length - i - 1];
            tempArray[tempArray.length - i - 1] = temp;
        }
        this.texts = tempArray;
        this.textTime = textTime;
        time = texts.length * textTime - 1;
        getImage().scale(480, 90); triangleX = 460; triangleY = 366;
    }
    
    public OverlayText(String[] texts, int textTime, String world)
    {
        this.texts = texts;
        for(int i = 0; i < this.texts.length / 2; i++)
        {
            String temp = this.texts[i];
            this.texts[i] = this.texts[this.texts.length - i - 1];
            this.texts[this.texts.length - i - 1] = temp;
        }
        this.textTime = textTime;
        time = texts.length * textTime - 1;
        this.world = world;
        switch(world)
        {
            case "WorldWildBattle" : getImage().scale(455, 100); triangleX = 425; triangleY = 476;
                break;
        }
    }
    
    public void act()
    {
        Player.speed = 0;
        DataPlayer.interactTimer = 10;
        displayText();
    }
    
    public void displayText()
    {
        if(time % textTime != 0)
            time--;
        else if(DataPlayer.interactInput())
        {
            time--;
            resetAnimation();
        }
        else
            getWorld().addObject(triangle, triangleX, triangleY);
        animateText(texts[time/textTime]);
        if(time == 1 && DataPlayer.interactInput())
        {
            Player.speed = 2;
            getWorld().showText("", getX(), getY());
            resetAnimation();
            getWorld().removeObject(this);
        }
        else if(time == 1)
        {
            time++;
            getWorld().addObject(triangle, triangleX, triangleY);
        }
    }
    
    public void animateText(String text)
    {
        char[] letters = text.toCharArray();
        int length = text.length();
        if(currentChar < length)
        {
            writing += letters[currentChar];
            currentChar++;
        }
        getWorld().showText(writing, getX(), getY());
    }
    
    public void resetAnimation()
    {
        writing = "";
        currentChar = 0;
    }
    
    @Override
    public void setLocation(int x, int y) 
    {}
}
