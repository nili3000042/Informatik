import greenfoot.*;
public class PokemonEnemy extends Battle
{
    GreenfootImage[] sprites;
    int currentImage;
    
    int time;
    
    boolean pokemonDead;
    
    public PokemonEnemy()
    {
        switch(DataWildPokemon.pokemons[DataWildPokemon.pokemonSelected])
        {
            case "Geodude" : sprites = new GreenfootImage[19];
                break;
            case "Roggenrola" : sprites = new GreenfootImage[25];
                break;
            case "Caterpie" : sprites = new GreenfootImage[22];
                break;
        }
        
        for(int i = 0; i < sprites.length; i++)
            sprites[i] = new GreenfootImage("Pokemons/" + DataWildPokemon.pokemons[DataWildPokemon.pokemonSelected] + "Front/" + i + ".png");
    }
    
    public void act()
    {
        if(getY() < 92)
            setLocation(getX(), getY() + 2);
        if(DataWildPokemon.hpStatsCurrent[DataWildPokemon.pokemonSelected] > 0)
        {
            time++;
            if(time == sprites.length * 3 - 4)
            {
                currentImage = 0;
                time = 0;
            }
            
            if(time % 3 == 0)
                currentImage++;
            setImage(sprites[currentImage]);
        }
        else
            pokemonDead = true;
        if(pokemonDead)
            setImage((GreenfootImage)null);
    }
}
