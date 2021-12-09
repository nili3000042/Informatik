import greenfoot.*;
public class MyWorld extends World //The world in wich the game happens.
{
    public static int game_speed =50;
    public int Cooldown_Slimes =1001;
    public static int Slimes =0;
    public int FlipFlop =0;
    public static int Score =0;
    public static int Hearts =5;
    public int wait =0;
    public int Max_Slimes =1;
    public static int upgrade_level =0;
    public static int Cooldown_Gun =-10;
    public static int player_immortal =0;
    public static int forcefield_active =10000;
    public static boolean forcefield =false;
    public int z =0;
    public boolean startmenu =false;
    GreenfootSound tense_backgroundMusic = new GreenfootSound("Trouble.mp3");
    GreenfootSound backgroundMusic = new GreenfootSound("dungeon theme.mp3");
    GreenfootSound GameOverMusic = new GreenfootSound("No Hope.mp3");
    GreenfootSound Forcefield = new GreenfootSound("hjm-shield_hum_50.mp3");
    public MyWorld()
    {    
        super(1280, 720, 1); // Erstellt eine neue Welt mit 1280x720 Zellen und einer Zell-Größe von 1x1 Pixeln.
        this.setPaintOrder(Displays.class,PC.class,NPC.class);
        Greenfoot.setSpeed(game_speed); // Number of times Act is performed per Second(Can change depending on performance).
        this.addObject(new Player(), 640, 360);
        this.addObject(new ScoreCounter(), 640,30);
        this.addObject(new HeartCounter(), 640,70);
        this.addObject(new UpgradeCounter(),640,690);
        this.addObject(new CooldownDisplay(), 640, 650);
        this.addObject(new StartMenu(), 640, 360);
        Cooldown_Slimes =100000001;
        Slimes =0;
        FlipFlop =0;
        Score =0;
        Hearts =5;
        wait =0;
        Max_Slimes =1;
        upgrade_level =0;
        Cooldown_Gun =-10;
        player_immortal =0;
        forcefield_active =0;
        forcefield =false;
        z =0;
        startmenu =true;
    }
    public void act()
    {
        slime_spawning();
        GameOver();
        aktualisieren();
        cheat_codes();
        Background_Music();
        Pause_Menu();
        forcefield();
        startmenu();
    }
    public void startmenu()
    {
        if(startmenu==true)
        {
            removeObjects(getObjects(StartMenu.class));
            startmenu=false;
        }
    }
    public void forcefield()
    {
        if(forcefield_active>0)
        {
            forcefield_active--;
            Forcefield.playLoop();
        }
        else
        {
            removeObjects(getObjects(Forcefield.class));
            removeObjects(getObjects(Forcefield_timer.class));
            Forcefield.stop();
            forcefield =false;
        }
    }
    public void Pause_Menu()
    {
        if(Greenfoot.isKeyDown("p")|z==1)
        {
            if(z==0)
            {
                this.addObject(new PauseMenu(),640,360);
                tense_backgroundMusic.stop();
                backgroundMusic.stop();
                Greenfoot.stop();
                z=1;
            }
            if(wait>0)
            {
                this.removeObjects(getObjects(PauseMenu.class));
                wait =0;
                z =0;
            }
            else
            {
                wait=wait+1;
            }
        }
    }
    public void Background_Music()
    {
        if(Hearts==1)
        {
            backgroundMusic.stop();
            tense_backgroundMusic.playLoop();
        }
        else if (Hearts>0)
        {
            tense_backgroundMusic.stop();
            backgroundMusic.playLoop();
        }
    }
    public void cheat_codes()
    {
        if(Greenfoot.isKeyDown("u"))
        {
            this.addObject(new Upgrade(),690,360);
        }
        if(Greenfoot.isKeyDown("h"))
        {
            this.addObject(new Heart(),740,360);
        }
        if(Greenfoot.isKeyDown("f"))
        {
            this.addObject(new Forcefield_item(),790,360);
        }
        if(Greenfoot.isKeyDown("c"))
        {
            Score++;
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
            tense_backgroundMusic.stop();
            backgroundMusic.stop();
            GameOverMusic.playLoop();
            this.addObject(new GameOver(),640,360);
            this.addObject(new Credits(), 240,360);
            this.addObject(new OnlyScore(),640,360);
            if(Greenfoot.isKeyDown("y")&&wait>100)
            {
                removeObjects(getObjects(Actor.class));
                this.addObject(new Player(), 640, 360);
                this.addObject(new ScoreCounter(), 640,30);
                this.addObject(new HeartCounter(), 640,70);
                this.addObject(new UpgradeCounter(),640,690);
                this.addObject(new CooldownDisplay(), 640, 650);
                Cooldown_Slimes =100000001;
                Slimes =0;
                FlipFlop =0;
                Score =0;
                Hearts =5;
                wait =0;
                Max_Slimes =1;
                upgrade_level =0;
                Cooldown_Gun =-10;
                player_immortal =0;
                forcefield_active =0;
                forcefield =false;
                z =0;
                GameOverMusic.stop();
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
                this.addObject(Rimuru,getRandomNumber(0,1280),0);
                FlipFlop=1;
                Slimes = Slimes+1;
                Cooldown_Slimes=0;
            }
            else if (FlipFlop==1)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(0);
                this.addObject(Rimuru,0,getRandomNumber(0,720));
                FlipFlop=2;
                Slimes = Slimes+1;
                Cooldown_Slimes=0;
            }
            else if (FlipFlop==2)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(270);
                this.addObject(Rimuru,getRandomNumber(0,1280),720);
                FlipFlop=3;
                Slimes = Slimes+1;
                Cooldown_Slimes=0;
            }
            else
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(180);
                this.addObject(Rimuru,1280,getRandomNumber(0,720));
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
    public static boolean even(int num)
    {
        if (num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}