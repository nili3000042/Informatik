
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rover_Commands extends Rover_OG_Commands
{
    public void test() 
    {
        fahre();
    }
    /** Commands selbst erstellt **/
    public void Gesteinsproben_Reihe(int a) 
    {
        for (int i=0; i<a; i++)
        {
            analysiereGestein();
            fahre();
        }
    }
    public void mountain_climb()
    {
        int posX = getX();
        int posY = getY();

        if(!huegelVorhanden("vorne"))
        {
            nachricht("Kein Hügel!");
        }
        else if(getRotation()==270 && getY()==1)
        {
            nachricht("Ich kann mich nicht bewegen");
        }
        else
        {
            move(1);
            Greenfoot.delay(1);
        }

        if(posX==getX()&&posY==getY()&&!huegelVorhanden("vorne"))
        {
            nachricht("Ich kann mich nicht bewegen");
        }
    }
    public void fahren(int Fahren_Anzahl) 
    {
        while(Fahren_Anzahl > 0)
             {
                    fahre();
                    Fahren_Anzahl = Fahren_Anzahl-1;
              }
    } 
    public void fahren2(int Fahren_Anzahl) 
    {
        for(int i = 0; i<Fahren_Anzahl; i++)
           {
                    fahre();
           }
    } 
    public void fahre2()
    {
        int posX = getX();
        int posY = getY();

        if(huegelVorhanden("vorne"))
        {
            nachricht("Zu steil!");
            drehe("rechts");
            move(1);
            Greenfoot.delay(1);
        }
        else if(getRotation()==270 && getY()==1)
        {
            nachricht("Ich kann mich nicht bewegen");
        }
        else
        {
            move(1);
            Greenfoot.delay(1);
        }
        if(posX==getX()&&posY==getY()&&!huegelVorhanden("vorne"))
        {
            nachricht("Ich kann mich nicht bewegen");
        }
    }
    public void Mapdurchfahren() 
    {
        if(huegelVorhanden("vorne"))
        {
            nachricht("Zu steil!");
            drehe("rechts");
            fahre();
            drehe("links");
            fahren(2);
            drehe("links");
            fahre();
            analysiereGestein();
        }
        else if(getRotation()==270 && getY()==1)
        {
            nachricht("Ich kann mich nicht bewegen");
            drehe("rechts");
            fahre();
            drehe("rechts");
            analysiereGestein();
        }
        else
        {
            fahre();
            analysiereGestein();
        }
    } 
}
