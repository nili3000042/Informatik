import greenfoot.*;
public class MyWorld extends World //The world in wich the game happens.
{
    public static int game_speed =50; // Number of times Act is performed per Second(Can change depending on performance).
    public static int Slimes =0; // The Number of Slimes currently in the game.
    public static int Score =0; // The Score.
    public int wait =0; // Temp storage.
    public int Max_Slimes =1; //The current number of Slimes Max at a time.
    public int wait_2 =0; // Temp storage.
    public boolean startmenu =false; //Stores if the startmenu is there.
    GreenfootSound tense_backgroundMusic = new GreenfootSound("Trouble.mp3"); //Makes it playable as a Loop.
    GreenfootSound backgroundMusic = new GreenfootSound("dungeon theme.mp3"); //Makes it playable as a Loop.
    GreenfootSound GameOverMusic = new GreenfootSound("No Hope.mp3"); //Makes it playable as a Loop.
    public MyWorld() // Done at the beginning of the Game.
    {    
        super(1280, 720, 1); // Creates a new world with 1280x720 cells and a cell-sice of 1x1 Pixel.
        this.setPaintOrder(Displays.class,PC.class,NPC.class); //Makes it so that the Displayed are always shown on top of enemys.
        Greenfoot.setSpeed(game_speed); // Tell the Game the game_speed.
        this.addObject(new Player(), 640, 360); //adds the Player.
        this.addObject(new ScoreCounter(), 640,30); //adds the ScoreCounter.
        this.addObject(new HeartCounter(), 640,70); //adds the Heart Display.
        this.addObject(new UpgradeCounter(),640,690); //adds the upgrade Display.
        this.addObject(new CooldownDisplay(), 640, 650); //adds the Cooldown Display.
        this.addObject(new StartMenu(), 640, 360); //adds the Startmenu.
        game_speed =50; // Number of times Act is performed per Second(Can change depending on performance).
        Slimes =0; // The Number of Slimes currently in the game.
        Score =0; // The Score.
        wait =0; // Temp storage.
        Max_Slimes =1; //The current number of Slimes Max at a time.
        wait_2 =0; // Temp storage.
        startmenu =true; //Stores if the startmenu is there.
    }
    public void act()
    {
        slime_spawning();
        GameOver();
        aktualisieren();
        cheat_codes(); // Used to test new features.
        Background_Music();
        Pause_Menu();
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
    public void Pause_Menu()
    {
        if(Greenfoot.isKeyDown("p")|wait_2==1)
        {
            if(wait_2==0)
            {
                this.addObject(new PauseMenu(),640,360);
                tense_backgroundMusic.stop();
                backgroundMusic.stop();
                Greenfoot.stop();
                wait_2=1;
            }
            if(wait>0)
            {
                this.removeObjects(getObjects(PauseMenu.class));
                wait =0;
                wait_2 =0;
            }
            else
            {
                wait++;
            }
        }
    }
    public void Background_Music()
    {
        if(getObjects(Player.class).get(0).Hearts==1)
        {
            backgroundMusic.stop();
            tense_backgroundMusic.playLoop();
        }
        else if (getObjects(Player.class).get(0).Hearts>0)
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
            this.addObject(new MediKit(),740,360);
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
        if(getObjects(Player.class).get(0).Hearts<1)
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
                this.addObject(new Player(), 640, 360); //adds the Player.
                this.addObject(new ScoreCounter(), 640,30); //adds the ScoreCounter.
                this.addObject(new HeartCounter(), 640,70); //adds the Heart Display.
                this.addObject(new UpgradeCounter(),640,690); //adds the upgrade Display.
                this.addObject(new CooldownDisplay(), 640, 650); //adds the Cooldown Display.
                game_speed =50; // Number of times Act is performed per Second(Can change depending on performance).
                Slimes =0; // The Number of Slimes currently in the game.
                Score =0; // The Score.
                wait =0; // Temp storage.
                Max_Slimes =1; //The current number of Slimes Max at a time.
                wait_2 =0; // Temp storage.
                GameOverMusic.stop();
            }
            else
            {
                wait++;
            }
        }
    }
    public void slime_spawning()
    {
        if(Slimes<Max_Slimes)
        {
            int FlipFlop = Greenfoot.getRandomNumber(4);
            if(FlipFlop==0)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(90);
                this.addObject(Rimuru,getRandomNumber(0,1280),0);
                Slimes = Slimes+1;
            }
            else if (FlipFlop==1)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(0);
                this.addObject(Rimuru,0,getRandomNumber(0,720));
                Slimes = Slimes+1;
            }
            else if (FlipFlop==2)
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(270);
                this.addObject(Rimuru,getRandomNumber(0,1280),720);
                Slimes = Slimes+1;
            }
            else
            {
                Slime Rimuru = new Slime();
                Rimuru.setRotation(180);
                this.addObject(Rimuru,1280,getRandomNumber(0,720));
                Slimes = Slimes+1;
            }
        }
    }
    public static int getRandomNumber(int start,int end)
    {    /*getRandomNumber(20,30);*/
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public static boolean even(int num) // tests if a number is od or even.
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