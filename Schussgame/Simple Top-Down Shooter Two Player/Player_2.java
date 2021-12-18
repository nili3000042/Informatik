import greenfoot.*;
public class Player_2 extends PC //The Player_2.
{
    GreenfootSound Minigun = new GreenfootSound("minigun.mp3"); //Makes it playable as a Loop.
    GreenfootSound Forcefield = new GreenfootSound("hjm-shield_hum_50.mp3"); //Makes it playable as a Loop.
    public static int Cooldown_Gun =-10; // Cooldown until player can shoot again.
    public static int upgrade_level =0; // Current level of the player.
    public static int Hearts =5; // The amounts of Hearts.
    public static int immortal =3*MyWorld.game_speed; // Time the Player_2 is immortal they start with 3 seconds.
    public static int forcefield_time =0; // The current Forcefield time.
    public int wait=0; //Temp value
    public int wait_2=0; //Temp value
    public void act() //Done around 50 times per secound.
    {
        if(Hearts>0)
        {
            ijkl_Rotate();
            gun();
            upgrade();
            regen();
            lose_immortality();
            forcefield();
        }
        else
        {
            setImage(new GreenfootImage("", 50, Color.RED, new Color(0,0,0,0)));
            immortal= 200;
        }
    }    
    public void ijkl_Rotate() //Moves the Player_2 with the ijkl keys.
    {
        if(Greenfoot.isKeyDown("i")) //Moves forward using i.
        {
            this.move(3);
        }
        if(Greenfoot.isKeyDown("k")) //Moves backwards using k.
        {
            this.move(-3);
        }
        if(Greenfoot.isKeyDown("j")) //Turns counterclockwise using j.
        {
            this.turn(-3);
        }
        if(Greenfoot.isKeyDown("l")) //Turns clockwise using l.
        {
            this.turn(3);
        }
    }
    public void forcefield() //Spawns the Forcefield that Protects the Player_2.
    {
        if(isTouching(Forcefield_item.class)) //Makes shure it is touching the item.
        {
            if(getWorld().getObjects(Forcefield_2.class).isEmpty()) //Checks that there is no forcefield object already and Spawns object if there isn't. Asweĺl as a timer to display the current Forcefield time left.
            {
                getWorld().addObject(new Forcefield_2(), this.getX(), this.getY());
                getWorld().addObject(new Forcefield_timer_2(), 854, 610);
            }
            forcefield_time = forcefield_time+1000; //Adds 20 Seconds to the Forcefield time.
            Greenfoot.playSound("upmid.mp3"); // Plays a nice Sound.
            removeTouching(Forcefield_item.class); //Removes the Item.
        }
        if(forcefield_time>0) //If there is forcefield time left.
        {
            forcefield_time--; //Forcefield time decreassas by 1.
            Forcefield.playLoop(); //Makes the forcefield sound play in the Background.
        }
        else //If there is no forcefield time left.
        {
            getWorld().removeObjects(getWorld().getObjects(Forcefield_2.class)); //Removes the Forcefield.
            getWorld().removeObjects(getWorld().getObjects(Forcefield_timer_2.class)); //Removes the Forcefield timer.
            Forcefield.stop(); //Stops the forcefield sound playing in the Background.
        }
    }
    public void lose_immortality() //makes the player lose immortality.
    {
        if(immortal>0) //makes shure the Player_2 has immortality.
        {
            immortal--; //immortality decreases by 1.
            if(MyWorld.even(immortal)&&wait_2==0) //makes it so that the player image is changed around every 4/50 of a secound to get a flickering effect while the player is immortal.
            {
                setImage(new GreenfootImage("", 50, Color.RED, new Color(0,0,0,0)));
                wait_2=1;
            }
            else if(MyWorld.even(immortal))
            {
                wait_2=0;
            }
        }
    }
    public void regen()
    {
        if(isTouching(MediKit.class)&&Hearts<10) //Makes shure it is touching the item and the player has less than 10 hearts.
        {
            Hearts++; //Increases the Hearts by 1.
            Greenfoot.playSound("upmid.mp3"); // Plays a nice Sound.
            removeTouching(MediKit.class); //Removes the Item.
        }
        else if(isTouching(MediKit.class)) //Tells the player that the Max lives are reached.
        {
            getWorld().showText("Max Lives Reached", 640, 360);
            wait=1;
        }
        if(wait>0)
        {
            wait++;
        }
        if(wait>10) //makes the text disapear.
        {
            getWorld().showText("", 640, 360);
            wait=0;
        }
    }
    public void upgrade()
    {
        if(isTouching(Upgrade.class)) //Makes shure it is touching the item.
        {
            upgrade_level++; //Increases Lv.
            Greenfoot.playSound("upshort.mp3"); // Plays a nice Sound.
            removeTouching(Upgrade.class); //Removes the Item.
        }
    }
    public void gun() //Fires Bullets to Kill Slimes.
    {
        if(upgrade_level<20) //when the lv. is under 20.
        {
            setImage("tanks (B4).png"); //Shows Tank image corresponding to Lv.
            if(Greenfoot.isKeyDown("enter") && Cooldown_Gun<upgrade_level) //When enter is pressed and Cooldown is zero creates bullet and plays gun sound.
            {
                Bullet Peng = new Bullet();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.mp3");
                Cooldown_Gun = 300;
            }
            else if(!Greenfoot.isKeyDown("enter")) //As long as key is not pressed the cooldown goes down
            {
                Cooldown_Gun--;
            }
        }
        else if (upgrade_level<40) //when the lv. is under 40.
        {
            setImage("tanks (B3).png"); //Shows Tank image corresponding to Lv.
            if(Greenfoot.isKeyDown("enter") && Cooldown_Gun<upgrade_level)  //When enter is pressed and Cooldown is zero creates bullet and plays gun sound.
            {
                Bullet Peng = new Bullet();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.mp3");
                Cooldown_Gun = 150;
            }
            else //When no Bullets are fired Cooldown goes down.
            {
                Cooldown_Gun--;
            }
        }
        else if (upgrade_level<60) //when the lv. is under 60.
        {
            setImage("tanks (B2).png"); //Shows Tank image corresponding to Lv.
            if(Greenfoot.isKeyDown("enter") && Cooldown_Gun<upgrade_level)  //When enter is pressed and Cooldown is zero creates bullet and plays gun sound.
            {
                Bullet Peng = new Bullet();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.mp3");
                Cooldown_Gun = 80;
            }
            else //When no Bullets are fired Cooldown goes down.
            {
                Cooldown_Gun--;
            }
        }
        else  //when the lv. is  MAX.
        {
            setImage("tanks (B1).png"); //Shows Tank image corresponding to Lv.
            if(Greenfoot.isKeyDown("enter")) //As long as enter is pressed bullets are fired and the sound is looped.
            {
                Bullet Peng = new Bullet();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Minigun.playLoop();
            }
            else  if(!Greenfoot.isKeyDown("enter")) //Stops sound when key isn't pressed.
            {
                Minigun.stop();
            }
        }
    }
}
