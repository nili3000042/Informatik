import greenfoot.*;
public class ObjectSpecialNPCCenterNurse extends Objects
{
    GreenfootImage[] sprites = new GreenfootImage[2];
    
    int time;
    
    static boolean forcedInteraction;
    
    public ObjectSpecialNPCCenterNurse()
    {
        sprites[0] = new GreenfootImage("Objects/Special/NPCCenterNurse/Down.png");
        sprites[1] = new GreenfootImage("Objects/Special/NPCCenterNurse/Left.png");
        setImage(sprites[0]);
    }
    
    public void act()
    {
        checkPlayer();
        animate();
    }
    
    @Override
    public void checkPlayer()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        if((isTouching(Player.class) && DataPlayer.interactInput() && player.getImage() == player.sprites[1] && time < -10) || forcedInteraction)
        {
            time = 150;
            Player.direction = 1;
            ObjectSpecialCenterMain.time = 101;
            getWorld().addObject(new OverlayText(new String[] {"Welcome to the Trash Pokémon Center !", "Your Pokémons have been healed."}, 75), 250, 345);
            for(int i = 0; i < DataPokemon.pokemonNumber; i++)
                DataPokemon.hpStatsCurrent[i] = DataPokemon.hpStats[i];
            forcedInteraction = false;
        }
    }
    
    public void animate()
    {
        time--;
        if(time > 0)
        {
            Player.speed = 0;
            if(time == 149)
                setImage(sprites[1]);
            else if(time == 74 && DataPlayer.interactInput())
                setImage(sprites[0]);
            else if(time == 74)
                time++;
            else if(time == 1 && DataPlayer.interactInput())
                time--;
            else if(time == 1)
                time++;
        }
        else if(time == 0)
            Player.speed = 2;
    }
}
