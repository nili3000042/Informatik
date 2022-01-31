import greenfoot.*;
public class BattleAttack extends Battle
{
    String name;
    String id;
    String type;
    int power;
    String category;
    String specialEffect;
    String statAffected;
    boolean statusTargetsHimself;
    
    GreenfootImage[] sprites;
    int currentFrame;
    int soundIndex;
    
    String startingText;
    String statusText;
    
    int time;
    
    boolean isFirst;
    boolean isPlayer;
    String nextAttack;
    
    public BattleAttack(String name, boolean isFirst, boolean isPlayer, String nextAttack)
    {
        this.name = name;
        switch(name)
        {
            case "PlayerPotion" : sprites = new GreenfootImage[22];
                id = "Potion";
                type = null;
                power = 20;
                category = "Heal";
                DataInventory.removeItem("Potion", 1);
                WorldWildBattle.attackOver = true;
                soundIndex = 0;
                break;
            case "PlayerSuperPotion" : sprites = new GreenfootImage[22];
                id = "Super Potion";
                type = null;
                power = 50;
                category = "Heal";
                DataInventory.removeItem("SuperPotion", 1);
                WorldWildBattle.attackOver = true;
                soundIndex = 0;
                break;
            case "PlayerTackle" : sprites = new GreenfootImage[11];
                id = "Tackle";
                type = "Normal";
                power = 35;
                category = "Physical";
                WorldWildBattle.attackOver = false;
                soundIndex = 1;
                break;
            case "EnemyTackle" : sprites = new GreenfootImage[11];
                id = "Tackle";
                type = "Normal";
                power = 35;
                category = "Physical";
                WorldWildBattle.attackOver = true;
                soundIndex = 1;
                break;
            case "PlayerFlamethrower" : sprites = new GreenfootImage[19];
                id = "Flamethrower";
                type = "Fire";
                power = 90;
                category = "Special";
                WorldWildBattle.attackOver = false;
                soundIndex = 2;
                break;
            case "PlayerEmber" : sprites = new GreenfootImage[9];
                id = "Ember";
                type = "Fire";
                power = 40;
                category = "Special";
                WorldWildBattle.attackOver = false;
                soundIndex = 3;
                break;
            case "PlayerLowSweep" : sprites = new GreenfootImage[11];
                id = "Low Sweep";
                type = "Fighting";
                power = 65;
                category = "Physical";
                WorldWildBattle.attackOver = false;
                soundIndex = 4;
                break;
            case "EnemyRockTomb" : sprites = new GreenfootImage[27];
                id = "Rock Tomb";
                type = "Rock";
                power = 50;
                category = "Physical";
                WorldWildBattle.attackOver = true;
                soundIndex = 5;
                break;
            case "PlayerRazorLeaf" : sprites = new GreenfootImage[24];
                id = "Razor Leaf";
                type = "Grass";
                power = 55;
                category = "Physical";
                WorldWildBattle.attackOver = true;
                soundIndex = 6;
                break;
            case "PlayerWaterGun" : sprites = new GreenfootImage[28];
                id = "Water Gun";
                type = "Water";
                power = 40;
                category = "Special";
                WorldWildBattle.attackOver = false;
                soundIndex = 7;
                break;
        }
        
        for(int i = 0; i < sprites.length; i++)
            sprites[i] = new GreenfootImage("Attacks/" + name + "/" + i +".png");
        setImage(sprites[0]);
        
        if(specialEffect != null)
        {
            switch(specialEffect)
            {
                case "IncreaseDefense" : statAffected = "Defense";
                    statusTargetsHimself = true;
                    break;
                case "LowerDefense" : statAffected = "Defense";
                    statusTargetsHimself = false;
                    break;
                case "IncreaseAttack" : statAffected = "Attack";
                    statusTargetsHimself = true;
                    break;
                case "LowerAttack" : statAffected = "Attack";
                    statusTargetsHimself = false;
                    break;
                case "IncreaseSpecialDefense" : statAffected = "Special Defense";
                    statusTargetsHimself = true;
                    break;
                case "LowerSpecialDefense" : statAffected = "Special Defense";
                    statusTargetsHimself = false;
                    break;
                case "IncreaseSpecialAttack" : statAffected = "Special Attack";
                    statusTargetsHimself = true;
                    break;
                case "LowerSpecialAttack" : statAffected = "Special Attack";
                    statusTargetsHimself = false;
                    break;
                case "IncreaseSpeed" : statAffected = "Speed";
                    statusTargetsHimself = true;
                    break;
                case "LowerSpeed" : statAffected = "Speed";
                    statusTargetsHimself = false;
                    break;
            }
            
            if(isPlayer)
            {
                if(statusTargetsHimself == true)
                    statusText = "Your " + DataPokemon.pokemons[DataPokemon.pokemonSelected] + "'s " + statAffected + "has been increased !";
                else
                    statusText = "Your " + DataPokemon.pokemons[DataPokemon.pokemonSelected] + "'s " + statAffected + "has been lowered !";
            }
            else
            {
                if(statusTargetsHimself == true)
                    statusText = "The wild " + DataWildPokemon.pokemons[DataWildPokemon.pokemonSelected] + "'s " + statAffected + "has been increased !";
                else
                    statusText = "The wild " + DataWildPokemon.pokemons[DataWildPokemon.pokemonSelected] + "'s " + statAffected + "has been lowered !";
            }
        }
        
        this.isFirst = isFirst;
        this.isPlayer = isPlayer;
        this.nextAttack = nextAttack;
    }
    
    public void act()
    {
        if(isPlayer && !category.equals("Heal"))
            startingText = "Your " + DataPokemon.pokemons[DataPokemon.pokemonSelected] + " uses " + id;
        else if(!isPlayer && !category.equals("Heal"))
            startingText = "The wild " + DataWildPokemon.pokemons[DataWildPokemon.pokemonSelected] + " uses " + id;
        else
            startingText = "You use a " + id;
        
        time++;
        if(time == 1)
            DataSound.attacks[soundIndex].play();
        if(time % 3 == 0)
            currentFrame++;
        setImage(sprites[currentFrame]);
        DataPlayer.interactTimer = 10;
        
        DataWildBattle dataWildBattle = getWorld().getObjects(DataWildBattle.class).get(0);
        if(time == sprites.length * 3 - 1 && isFirst)
        {
            dataWildBattle.endFirstTurn(this);
            getWorld().removeObject(this);
        }
        else if(time == sprites.length * 3 - 1)
        {
            dataWildBattle.endLastTurn(this);
            getWorld().removeObject(this);
        }
    }
}
