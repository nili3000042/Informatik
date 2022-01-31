import greenfoot.*;
public class BattleExplosion extends Battle
{
    GreenfootImage[] sprites = new GreenfootImage[7];
    int currentImage;
    
    int time;
    
    public BattleExplosion()
    {
        for(int i = 0; i < sprites.length; i++)
            sprites[i] = new GreenfootImage("BattleExplosion/" + i + ".png");
        setImage(sprites[0]);
    }
    
    public void act()
    {
        time++;
        if(time % 2 == 0)
            currentImage++;
        setImage(sprites[currentImage]);
        if(time == 9)
        {
            int hp = DataPokemon.hpStats[DataPokemon.pokemonSelected];
            int hpCurrent = DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected];
            int hpPercentage = (hpCurrent * 100) / hp;
            getWorld().addObject(new PokemonPlayer(), 205, 320);
            getWorld().addObject(new HPPlayer(), 470, 400);
            getWorld().addObject(new HPEnemy(), 126, 0);
            getWorld().addObject(new HPBarPlayer(), (470 + (hpPercentage - 100) / 2), 401);
            getWorld().addObject(new HPBarEnemy(), 126, 7);
        }
        else if(time == 13)
            getWorld().removeObject(this);
    }
}
