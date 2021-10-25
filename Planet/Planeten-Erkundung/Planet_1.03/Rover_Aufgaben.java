import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

public class Rover_Aufgaben extends Rover_Commands
{
    public void test2() 
    {
        fahren(2);
    }
    /** Aufgaben **/
    public void Aufgabe_25102021() 
    {
        while(!markeVorhanden())
        {
            if(!huegelVorhanden("vorne"))
            {
                fahre();
            }
            else if(!huegelVorhanden("rechts"))
            {
                drehe("rechts");
            }
            else if(!huegelVorhanden("links"))
            {
                drehe("links");
            }
        }
    }
    public void AB_ÜzBA3() 
    {
        test();
    }
    public void AB_ÜzBA2() 
    {
        fahre();
    }
    public void AB_ÜzBA1() 
    {
        for(int i=0;i<10;i++)
        {
            if(gesteinVorhanden())
            {
                analysiereGestein();
            }
            fahre();
            if(gesteinVorhanden())
            {
                analysiereGestein();
            }
        }
    }
    public void SBS41_43NR6() 
    {
        do
        {
            fahre();
        }while(huegelVorhanden("rechts"));
    } 
    public void SBS41_43NR5() 
    {
        while (gesteinVorhanden())
        {
            analysiereGestein();
            setzeMarke();
            fahre();
        }
    } 
    public void SBS41_43NR4(String Aufgabe) 
    {
        if (Aufgabe == "a)")
        {
            while(huegelVorhanden("links"))
            {
                fahre();
            }
        }
        if (Aufgabe == "b)")
        {
            while(huegelVorhanden("rechts"))
            {
                fahre();
            }
        }
        if (Aufgabe == "c)")
        {
            while(!huegelVorhanden("rechts"))
            {
                fahre();
            }
        }
    } 
    public void SBS41_43NR2() 
    {
        fahre();
        while(!markeVorhanden())
        {
         while(huegelVorhanden("rechts"))
         {
             if(huegelVorhanden("vorne"))
             {
                 drehe("links");
             }
             fahre();
             if(gesteinVorhanden())
             {
                 analysiereGestein();
             }
         }
         drehe("rechts");
         fahre();
         if(gesteinVorhanden())
             {
                 analysiereGestein();
             }
        }
    }
    public void SBS41_43NR1() 
    {
        fahre();
        while(!markeVorhanden())
        {
         while(huegelVorhanden("rechts"))
         {
             if(huegelVorhanden("vorne"))
             {
                 drehe("links");
             }
             fahre();
         }
         drehe("rechts");
         fahre();
        }
    }
    public void Aufgabe_1() 
    {
        while (gesteinVorhanden())
        {
            fahre();
        }
    } 
    public void SBS33NR2() 
    {
        int x = 5;
        int y = 5;
        String richtung = "rechts";
        while(y != 0)
        {
            fahren(x-1);
            if(y-1 > 0)
            {
                drehe(richtung);
                fahre();
                drehe(richtung);
                if(richtung == "links")
                {
                    richtung = "rechts"; 
                }
                else
                {
                    richtung = "links";
                }
            }
            y = y-1;
        }
    } 
    public void SBS33NR1() 
    {
        drehe("rechts");
        int i = 0;
        while(!gesteinVorhanden())
        {
            fahre();
            i = i+1;
        }
        analysiereGestein();
        drehe("rechts");
        drehe("rechts");
        fahren(i);
        drehe("rechts");
    } 
    public void SBS29NR9_1() 
    {
        fahren(2);
        analysiereGestein();
        fahre();
        analysiereGestein();
        drehe("rechts");
        fahre();
        drehe("rechts");
        fahre();
        analysiereGestein();
    }
}