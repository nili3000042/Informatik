import greenfoot.*;
public class ObjectSpecialNPCProfessor extends Objects
{
    GreenfootImage[] sprites = new GreenfootImage[8];
    
    int[] time = new int[15];
    
    static int status;
    
    Player player;
    
    public ObjectSpecialNPCProfessor(int status)
    {
        ObjectSpecialNPCProfessor.status = status;
        sprites[0] = new GreenfootImage("Objects/Special/NPCProfessor/Down.png");
        sprites[1] = new GreenfootImage("Objects/Special/NPCProfessor/Up.png");
        sprites[2] = new GreenfootImage("Objects/Special/NPCProfessor/Left.png");
        sprites[3] = new GreenfootImage("Objects/Special/NPCProfessor/Right.png");
        sprites[4] = new GreenfootImage("Objects/Special/NPCProfessor/DownRun.png");
        sprites[5] = new GreenfootImage("Objects/Special/NPCProfessor/UpRun.png");
        sprites[6] = new GreenfootImage("Objects/Special/NPCProfessor/LeftRun.png");
        sprites[7] = new GreenfootImage("Objects/Special/NPCProfessor/RightRun.png");
        setImage(sprites[0]);
        
        switch(status)
        {
            case 0 : time[0] = 50;
                break;
        }
    }
    
    public void act()
    {
        player = (Player)getWorld().getObjects(Player.class).get(0);
        player.setImage(player.sprites[1]);
        checkPlayer();
        time0();
        time1();
        time2();
        time3();
        time4();
        time5();
    }
    
    public void time5()
    {
        time[5]--;
        if(time[5] > 0)
        {
            Player.speed = 0;
            setLocation(getX(), getY() - 2);
            if(time[5] % 12 == 0)
                setImage(sprites[5]);
            else if(time[5] % 6 == 0)
                setImage(sprites[1]);
            if(getY() == 0)
            {
                WorldTownTrash.eventProf = 1;
                Player.speed = 2;
                WorldHousePlayerTownTrash.npcDone[0] = true;
                getWorld().removeObject(this);
            }
        }
    }
    
    public void time4()
    {
        time[4]--;
        if(time[4] > 0)
        {
            if(time[4] == 1 && DataPlayer.interactInput())
                time[5] = 50;
            else if(time[4] == 1)
                time[4]++;
            if(time[4] % 75 == 0 && DataPlayer.interactInput())
                time[4]--;
            else if(time[4] % 75 == 0)
                time[4]++;
        }
    }
    
    public void time3()
    {
        time[3]--;
        if(time[3] > 0)
        {
            if(time[3] == 1 && DataPlayer.interactInput())
            {
                getWorld().addObject(new OverlayText(new String[] {"Oh, so you chose " + DataPokemon.pokemons[0] + " ?", "Excellent choice !", "See you soon, Red"}, 75), 250, 350);
                time[4] = 225;
            }
            else if(time[3] == 1)
                time[3]++;
        }
    }
    
    public void time2()
    {
        time[2]--;
        if(time[2] > 0)
        {
            if(time[2] == 1 && DataPlayer.interactInput())
            {
                DataPokemon.pokemons[0] = DataPlayer.choice;
                DataPokemon.pokemonNumber = 1;
                DataPokemon.pokemonMoves3[0] = null;
                DataPokemon.pokemonMoves4[0] = null;
                DataPokemon.pokemonLevels[0] = 5;
                switch(DataPlayer.choice)
                {
                    case "Tepig" : DataPokemon.pokemonMoves1[0] = "Ember";
                        DataPokemon.pokemonMoves2[0] = "Tackle";
                        break;
                    case "Mudkip" : DataPokemon.pokemonMoves1[0] = "WaterGun";
                        DataPokemon.pokemonMoves2[0] = "Tackle";
                        break;
                    case "Turtwig" :  DataPokemon.pokemonMoves1[0] = "RazorLeaf";
                        DataPokemon.pokemonMoves2[0] = "Tackle";
                        break;
                }
                DataPlayer.choice = null;
                time[3] = 2;
            }
            else if(time[2] == 1)
                time[2]++;
        }
    }
    
    public void time1()
    {
        time[1]--;
        if(time[1] > 0)
        {
            if(time[1] == 1 && DataPlayer.interactInput())
            {
                getWorld().addObject(new OverlayOption(new String[] {"Tepig", "Mudkip", "Turtwig"}), 400, 200);
                time[2] = 11;
            }
            else if(time[1] == 1)
                time[1]++;
            if(time[1] % 75 == 0 && DataPlayer.interactInput())
                time[1]--;
            else if(time[1] % 75 == 0)
                time[1]++;
        }
    }
    
    public void time0()
    {
        time[0]--;
        if(time[0] > 0)
        {
            if(time[0] < (40 + (player.getY() - 116) / 2))
            {
                setLocation(getX(), getY() + 2);
                if(time[0] % 12 == 0)
                    setImage(sprites[4]);
                else if(time[0] % 6 == 0)
                    setImage(sprites[0]);
                if(time[0] == 1)
                {
                    time[1] = 225;
                    getWorld().addObject(new OverlayText(new String[] {"Oh, hello Red.", "I got a Pokémon for you !", "Choose one of these."}, 75), 250, 350);
                }
            }
        }
    }
}
