import greenfoot.*;
public class MyWorld extends World //The world in wich the game happens.
{
    public static int game_speed =50; // Number of times Act is performed per Second(Can change depending on performance).
    public static int Slimes =0; // The Number of Slimes currently in the game.
    public static int Score =0; // The Score.
    public int Max_Slimes =1; //The current number of Slimes Max at a time.
    GreenfootSound tense_backgroundMusic = new GreenfootSound("Trouble.mp3"); //Makes it playable as a Loop.
    GreenfootSound backgroundMusic = new GreenfootSound("dungeon theme.mp3"); //Makes it playable as a Loop.
    GreenfootSound GameOverMusic = new GreenfootSound("No Hope.mp3"); //Makes it playable as a Loop.
    public MyWorld() // Done at the beginning of the Game.
    {    
        super(1280, 720, 1); // Creates a new world with 1280x720 cells and a cell-sice of 1x1 Pixel.
        reset();
        this.addObject(new StartMenu(), 640, 360); //adds the Startmenu.
    }
    public void reset()
    {
        this.setPaintOrder(Displays.class,PC.class,NPC.class); //Makes it so that the Displayed are always shown on top of enemys.
        Greenfoot.setSpeed(game_speed); // Tell the Game the game_speed.
        this.addObject(new Player_1(), 426, 360); //adds the Player_1.
        this.addObject(new Player_2(), 854, 360); //adds the Player_2.
        this.addObject(new ScoreCounter(), 640,30); //adds the ScoreCounter.
        this.addObject(new HeartCounter_1(), 426,70); //adds the Heart Display.
        this.addObject(new HeartCounter_2(), 854,70); //adds the Heart Display.
        this.addObject(new UpgradeCounter_1(),426,690); //adds the upgrade Display.
        this.addObject(new UpgradeCounter_2(),854,690); //adds the upgrade Display.
        this.addObject(new CooldownDisplay_1(), 426, 650); //adds the Cooldown Display.
        this.addObject(new CooldownDisplay_2(), 854, 650); //adds the Cooldown Display.
        game_speed =50; // Number of times Act is performed per Second(Can change depending on performance).
        Slimes =0; // The Number of Slimes currently in the game.
        Score =0; // The Score.
        Max_Slimes =1; //The current number of Slimes Max at a time.
        getObjects(Player_1.class).get(0).Cooldown_Gun =-10; // Cooldown until player can shoot again.
        getObjects(Player_1.class).get(0).upgrade_level =0; // Current level of the player.
        getObjects(Player_1.class).get(0).Hearts =5; // The amounts of Hearts.
        getObjects(Player_1.class).get(0).immortal =3*MyWorld.game_speed; // Time the Player is immortal they start with 3 seconds.
        getObjects(Player_1.class).get(0).forcefield_time =0; // The current Forcefield time.
        getObjects(Player_2.class).get(0).Cooldown_Gun =-10; // Cooldown until player can shoot again.
        getObjects(Player_2.class).get(0).upgrade_level =0; // Current level of the player.
        getObjects(Player_2.class).get(0).Hearts =5; // The amounts of Hearts.
        getObjects(Player_2.class).get(0).immortal =3*MyWorld.game_speed; // Time the Player is immortal they start with 3 seconds.
        getObjects(Player_2.class).get(0).forcefield_time =0; // The current Forcefield time.
    }
    public void act() //Done around 50 times per Second.
    {
        slime_spawning();
        update_Max();
        Background_Music();
        Pause_Menu();
        startmenu();
        GameOver();
        cheat_codes(); // Used to test new features.
    }
    public void startmenu() //Deletes the Startmenu.
    {
        if(!getObjects(StartMenu.class).isEmpty()) //Checks if the Startmenu is there.
        {
            removeObjects(getObjects(StartMenu.class)); //Removes the Startmenu.
        }
    }
    public void Pause_Menu() //Makes the Pause Menu possible.
    {
        if(!getObjects(PauseMenu.class).isEmpty()) //Checks if the Pausemenu is there.
        {
            this.removeObjects(getObjects(PauseMenu.class)); //Removes the Pausemenu.
        }
        if(Greenfoot.isKeyDown("p")) //If the player presses P
        {
            this.addObject(new PauseMenu(),640,360); //adds the Pausemenu.
            tense_backgroundMusic.stop(); //Stops Background Music.
            backgroundMusic.stop(); //Stops Background Music.
            Greenfoot.stop(); //Pauses Greenfoot.
        }
    }
    public void Background_Music() //Changes the Background Music.
    {
        if(getObjects(Player_1.class).get(0).Hearts==1|getObjects(Player_2.class).get(0).Hearts==1) //If the Player has only 1 Heart Remaining it gets Tense.
        {
            backgroundMusic.stop();
            tense_backgroundMusic.playLoop();
        }
        else if(getObjects(Player_1.class).get(0).Hearts>1|getObjects(Player_2.class).get(0).Hearts>1) //Else the Background is Calm.
        {
            tense_backgroundMusic.stop();
            backgroundMusic.playLoop();
        }
    }
    public void cheat_codes() //Cheat codes for tests.
    {
        if(Greenfoot.isKeyDown("u")) //Spawns Upgrades.
        {
            this.addObject(new Upgrade(),690,360);
        }
        if(Greenfoot.isKeyDown("h")) //Spawns Medikits.
        {
            this.addObject(new MediKit(),740,360);
        }
        if(Greenfoot.isKeyDown("f")) //Spawns Forcefields.
        {
            this.addObject(new Forcefield_item(),790,360);
        }
        if(Greenfoot.isKeyDown("c")) //Adds to the Score.
        {
            Score++;
        }
        if(Greenfoot.isKeyDown("v")) //Makes both Players Immortal.
        {
            getObjects(Player_1.class).get(0).immortal =3*MyWorld.game_speed;
            getObjects(Player_2.class).get(0).immortal =3*MyWorld.game_speed;
        }
    }
    public void update_Max() //Updates the Maximum number of slimes at a Time.
    {
        if(Score>2) //Makes shure the score is higher than 2 to prevent problems from happening.
        {
            Max_Slimes=Score/2; //Sets max slimes to halve of the Score.
        }
    }
    public void GameOver() //This Void ends the Game.
    {
        if(!getObjects(GameOver.class).isEmpty()) //Resets the Game.
        {
            removeObjects(getObjects(Actor.class)); //Wipes the World clean.
            reset();
            GameOverMusic.stop(); //Stops the Game over Music.
        }
        else if(getObjects(Player_1.class).get(0).Hearts<1&&getObjects(Player_2.class).get(0).Hearts<1) //Detects if both players are dead.
        {
            removeObjects(getObjects(Actor.class)); //Wipes the World clean.
            tense_backgroundMusic.stop(); //Stops the Background Music.
            backgroundMusic.stop(); //Stops the Background Music.
            GameOverMusic.playLoop(); //Plays the Game Over Music.
            this.addObject(new Player_1(), 640, 360); //adds player to prevent some bugs.
            this.addObject(new Player_2(), 640, 360); //adds player to prevent some bugs.
            this.addObject(new GameOver(),640,360); //adds the GameOver display.
            this.addObject(new Credits(), 240,360); //adds the Credits.
            this.addObject(new OnlyScore(),640,360); //adds only the score.
            Greenfoot.stop(); //Pauses Greenfoot.
        }
    }
    public void slime_spawning() // Spawns Slimes.
    {
        int i=0;
        while(i*1000<Score+1) //Makes the Game able to spawn more Slimes Later in the Game.
        {
            if(Slimes<Max_Slimes) //Checks that the Max number of slimes isn't reached already.
            {
                int FlipFlop = Greenfoot.getRandomNumber(4); //gets random number to select on wich border tzo spawn slimes.
                if(FlipFlop==0) //Spawns Slime at Random point on the Bottom Border.
                {
                    this.addObject(new Slime(),getRandomNumber(0,1280),0);
                    Slimes = Slimes+1;
                }
                else if (FlipFlop==1) //Spawns Slime at Random point on the Left Border.
                {
                    this.addObject(new Slime(),0,getRandomNumber(0,720));
                    Slimes = Slimes+1;
                }
                else if (FlipFlop==2) //Spawns Slime at Random point on the Top Border.
                {
                    this.addObject(new Slime(),getRandomNumber(0,1280),720);
                    Slimes = Slimes+1;
                }
                else  //Spawns Slime at Random point on the Right Border.
                {
                    this.addObject(new Slime(),1280,getRandomNumber(0,720));
                    Slimes = Slimes+1;
                }
            }
            i++;
        }
    }
    public static int getRandomNumber(int start,int end) //gets you a Random number between two numbers.
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