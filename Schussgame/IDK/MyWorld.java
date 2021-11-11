import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse MyWorld.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MyWorld extends World
{
    public int Cooldown =100000001;
    public static int Slimes =0;
    public int FlipFlop =0;
    public static int Score =0;
    public static int Hearts =3;
    public int wait =0;
    public int Max_Slimes =1;
    public MyWorld()
    {    
        // Erstellt eine neue Welt mit 600x400 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(600, 600, 1); 
        this.addObject(new Player(), 300, 300);
        this.addObject(new ScoreCounter(), 300,30);
        this.addObject(new HeartCounter(), 300,70);
        Cooldown =100000001;
        Slimes =0;
        FlipFlop =0;
        Score =0;
        Hearts =3;
        wait =0;
        Max_Slimes =1;
    }
    public void act()
    {       
        slime_spawning();
        GameOver();
        aktualisieren();
    }
    public void upgrades()
    {
        
    }
    public void aktualisieren()
    {
        if(Score>10)
        {
            Max_Slimes=Score/2;
        }
    }
    public void GameOver()
    {
        if(Hearts<1)
        {
            removeObjects(getObjects(Actor.class));
            this.addObject(new GameOver(),300,300);
            this.addObject(new OnlyScore(),300,300);
            if(Greenfoot.isKeyDown("y")&&wait>100)
            {
                removeObjects(getObjects(Actor.class));
                this.addObject(new Player(), 300, 300);
                this.addObject(new ScoreCounter(), 300,30);
                this.addObject(new HeartCounter(), 300,70);
                Cooldown =100000001;
                Slimes =0;
                FlipFlop =0;
                Score =0;
                Hearts =3;
                wait =0;
                Max_Slimes =0;
            }
            else
            {
                wait=wait+1;
            }
        }
    }
    public void slime_spawning()
    {
        if(Cooldown>1000-Score && Slimes<Max_Slimes)
        {
            if(FlipFlop==0)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(90);
                this.addObject(Rimuru,getRandomNumber(0,600),0);
                FlipFlop=1;
                Slimes = Slimes+1;
                Cooldown=0;
            }
            else if (FlipFlop==1)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(0);
                this.addObject(Rimuru,0,getRandomNumber(0,600));
                FlipFlop=2;
                Slimes = Slimes+1;
                Cooldown=0;
            }
            else if (FlipFlop==2)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(270);
                this.addObject(Rimuru,getRandomNumber(0,600),600);
                FlipFlop=3;
                Slimes = Slimes+1;
                Cooldown=0;
            }
            else
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(180);
                this.addObject(Rimuru,600,getRandomNumber(0,600));
                FlipFlop=0;
                Slimes = Slimes+1;
                Cooldown=0;
            }
        }
        else
        {
            Cooldown=Cooldown+getRandomNumber(0,50);
        }
    }
    public static int getRandomNumber(int start,int end)
    {    /*getRandomNumber(20,30);*/
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
}