import greenfoot.*;
public class Player extends PC //The Player.
{
    GreenfootSound Minigun = new GreenfootSound("minigun.mp3"); //Makes it playable as a Loop.
    public int wait=0; //Temp value
    public int wait_2=0; //Temp value
    public void act() //Done around 50 times per secound.
    {
        wasd_Rotate();
        gun();
        upgrade();
        regen();
        lose_immortality();
        forcefield();
    }    
    public void wasd_Rotate() //Moves the Player with the wasd keys.
    {
        if(Greenfoot.isKeyDown("w")) //Moves forward using w.
        {
            this.move(3);
        }
        if(Greenfoot.isKeyDown("s")) //Moves backwards using s.
        {
            this.move(-3);
        }
        if(Greenfoot.isKeyDown("a")) //Turns counterclockwise using a.
        {
            this.turn(-3);
        }
        if(Greenfoot.isKeyDown("d")) //Turns clockwise using a.
        {
            this.turn(3);
        }
    }
    public void forcefield() //Spawns the Forcefield that Protects the Player.
    {
        if(isTouching(Forcefield_item.class)) //Makes shure it is touching the item.
        {
            if(!MyWorld.forcefield) //Checks that there is no forcefield object already and Spawns object if there isn't. Asweĺl as a timer to display the current Forcefield time left.
            {
                getWorld().addObject(new Forcefield(), this.getX(), this.getY());
                getWorld().addObject(new Forcefield_timer(), 640, 610);
                MyWorld.forcefield=true;
            }
            MyWorld.forcefield_active = MyWorld.forcefield_active+1000; //Adds 20 Seconds to the Forcefield time.
            Greenfoot.playSound("upmid.mp3"); // Plays a nice Sound.
            removeTouching(Forcefield_item.class); //Removes the Item.
        }
    }
    public void lose_immortality() //makes the player lose immortality.
    {
        if(MyWorld.player_immortal>0) //makes shure the Player has immortality.
        {
            MyWorld.player_immortal--; //immortality decreases by 1.
            if(MyWorld.even(MyWorld.player_immortal)&&wait_2==0) //makes it so that the player image is changed around every 4/50 of a secound to get a flickering effect while the player is immortal.
            {
                setImage(new GreenfootImage("", 50, Color.RED, new Color(0,0,0,0)));
                wait_2=1;
            }
            else if(MyWorld.even(MyWorld.player_immortal))
            {
                wait_2=0;
            }
        }
    }
    public void regen()
    {
        if(isTouching(MediKit.class)&&MyWorld.Hearts<10) //Makes shure it is touching the item and the player has less than 10 hearts.
        {
            MyWorld.Hearts++; //Increases the Hearts by 1.
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
            MyWorld.upgrade_level = MyWorld.upgrade_level+1; //Increases Lv.
            Greenfoot.playSound("upshort.mp3"); // Plays a nice Sound.
            removeTouching(Upgrade.class); //Removes the Item.
        }
    }
    public void gun() //Fires Bullets to Kill Slimes.
    {
        if(MyWorld.upgrade_level<20) //when the lv. is under 20.
        {
            setImage("tanks (R4).png"); //Shows Tank image corresponding to Lv.
            if(Greenfoot.isKeyDown("space") && MyWorld.Cooldown_Gun<MyWorld.upgrade_level) //When Space is pressed and Cooldown is zero creates bullet and plays gun sound.
            {
                Bullet Peng = new Bullet();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.mp3");
                MyWorld.Cooldown_Gun = 300;
            }
            else if(!Greenfoot.isKeyDown("space")) //As long as key is not pressed the cooldown goes down
            {
                MyWorld.Cooldown_Gun=MyWorld.Cooldown_Gun-1;
            }
        }
        else if (MyWorld.upgrade_level<40) //when the lv. is under 40.
        {
            setImage("tanks (R3).png"); //Shows Tank image corresponding to Lv.
            if(Greenfoot.isKeyDown("space") && MyWorld.Cooldown_Gun<MyWorld.upgrade_level)  //When Space is pressed and Cooldown is zero creates bullet and plays gun sound.
            {
                Bullet Peng = new Bullet();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.mp3");
                MyWorld.Cooldown_Gun = 150;
            }
            else //When no Bullets are fired Cooldown goes down.
            {
                MyWorld.Cooldown_Gun=MyWorld.Cooldown_Gun-1;
            }
        }
        else if (MyWorld.upgrade_level<60) //when the lv. is under 60.
        {
            setImage("tanks (R2).png"); //Shows Tank image corresponding to Lv.
            if(Greenfoot.isKeyDown("space") && MyWorld.Cooldown_Gun<MyWorld.upgrade_level)  //When Space is pressed and Cooldown is zero creates bullet and plays gun sound.
            {
                Bullet Peng = new Bullet();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.mp3");
                MyWorld.Cooldown_Gun = 80;
            }
            else //When no Bullets are fired Cooldown goes down.
            {
                MyWorld.Cooldown_Gun=MyWorld.Cooldown_Gun-1;
            }
        }
        else  //when the lv. is  MAX.
        {
            setImage("tanks (R1).png"); //Shows Tank image corresponding to Lv.
            if(Greenfoot.isKeyDown("space")) //As long as Space is pressed bullets are fired and the sound is looped.
            {
                Bullet Peng = new Bullet();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Minigun.playLoop();
            }
            else  if(!Greenfoot.isKeyDown("space")) //Stops sound when key isn't pressed.
            {
                Minigun.stop();
            }
        }
    }
}