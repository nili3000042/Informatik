import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse MyWorld.
 * Ideen
 * -Sound
 * -Different asset player
 * -Fullscreen
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MyWorld extends World
{
    public int Cooldown_Slimes =100000001;
    public static int Slimes =0;
    public int FlipFlop =0;
    public static int Score =0;
    public static int Hearts =3;
    public int wait =0;
    public int Max_Slimes =1;
    public static int upgrade_level =0;
    public static int Cooldown_Gun =-10;
    int c =0;
    int h =0;
    int e =0;
    int a =0;
    public MyWorld()
    {    
        // Erstellt eine neue Welt mit 600x400 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(1280, 720, 1); 
        this.addObject(new Player(), 640, 360);
        this.addObject(new ScoreCounter(), 640,30);
        this.addObject(new HeartCounter(), 640,70);
        this.addObject(new UpgradeCounter(),640,690);
        this.addObject(new Cooldown(), 640, 650);
        Cooldown_Slimes =100000001;
        Slimes =0;
        FlipFlop =0;
        Score =0;
        Hearts =3;
        wait =0;
        Max_Slimes =1;
        upgrade_level =0;
        Cooldown_Gun =-10;
        c =0;
        h =0;
        e =0;
        a =0;
    }
    public void act()
    {       
        slime_spawning();
        GameOver();
        aktualisieren();
        cheat_code();
    }
    public void cheat_code()
    {
        if(Greenfoot.isKeyDown("c")|c==1)
        {
            if(Greenfoot.isKeyDown("h")|h==1)
            {
                if(Greenfoot.isKeyDown("e")|e==1)
                {   
                    if(Greenfoot.isKeyDown("a")|a==1)
                    {
                        if(Greenfoot.isKeyDown("t"))
                        {
                            for(int i=0;i<20;i++)
                            {
                                this.addObject(new Upgrade(),690,360);
                            }
                        }
                        a=1;
                    }
                    e=1;
                }
                h=1;
            }
            c=1;
        }
    }
    public void aktualisieren()
    {
        if(Score>2)
        {
            Max_Slimes=Score/2;
        }
    }
    public void GameOver()
    {
        if(Hearts<1)
        {
            removeObjects(getObjects(Actor.class));
            this.addObject(new GameOver(),640,360);
            this.addObject(new OnlyScore(),640,360);
            if(Greenfoot.isKeyDown("y")&&wait>100)
            {
                removeObjects(getObjects(Actor.class));
                this.addObject(new Player(), 640, 360);
                this.addObject(new ScoreCounter(), 640,30);
                this.addObject(new HeartCounter(), 640,70);
                this.addObject(new UpgradeCounter(),640,690);
                this.addObject(new Cooldown(), 640, 650);
                Cooldown_Slimes =100000001;
                Slimes =0;
                FlipFlop =0;
                Score =0;
                Hearts =3;
                wait =0;
                Max_Slimes =1;
                upgrade_level =0;
                Cooldown_Gun =-10;
                c =0;
                h =0;
                e =0;
                a =0;
            }
            else
            {
                wait=wait+1;
            }
        }
    }
    public void slime_spawning()
    {
        if(Cooldown_Slimes>1000-Score && Slimes<Max_Slimes)
        {
            if(FlipFlop==0)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(90);
                this.addObject(Rimuru,getRandomNumber(0,720),0);
                FlipFlop=1;
                Slimes = Slimes+1;
                Cooldown_Slimes=0;
            }
            else if (FlipFlop==1)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(0);
                this.addObject(Rimuru,0,getRandomNumber(0,1280));
                FlipFlop=2;
                Slimes = Slimes+1;
                Cooldown_Slimes=0;
            }
            else if (FlipFlop==2)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(270);
                this.addObject(Rimuru,getRandomNumber(0,720),1280);
                FlipFlop=3;
                Slimes = Slimes+1;
                Cooldown_Slimes=0;
            }
            else
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(180);
                this.addObject(Rimuru,720,getRandomNumber(0,1280));
                FlipFlop=0;
                Slimes = Slimes+1;
                Cooldown_Slimes=0;
            }
        }
        else
        {
            Cooldown_Slimes=Cooldown_Slimes+getRandomNumber(0,50);
        }
    }
    public static int getRandomNumber(int start,int end)
    {    /*getRandomNumber(20,30);*/
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
}