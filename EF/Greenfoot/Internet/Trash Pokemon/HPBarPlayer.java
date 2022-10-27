import greenfoot.*;
public class HPBarPlayer extends Battle
{
    GreenfootImage[] images = 
    {
        new GreenfootImage("Battle/HPBar0.png"),
        new GreenfootImage("Battle/HPBar1.png"),
        new GreenfootImage("Battle/HPBar2.png"),
    };
    
    int hp = DataPokemon.hpStats[DataPokemon.pokemonSelected];
    int hpCurrent = DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected];
    int hpPercentage;
    
    boolean stopShowing;
    
    public HPBarPlayer()
    {
        hp = DataPokemon.hpStats[DataPokemon.pokemonSelected];
        hpCurrent = DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected];
        hpPercentage = (hpCurrent * 100) / hp;
        animate();
    }
    
    public void act()
    {
        hp = DataPokemon.hpStats[DataPokemon.pokemonSelected];
        hpCurrent = DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected];
        hpPercentage = (hpCurrent * 100) / hp;
        if(getY() > 299)
            setLocation(getX(), getY() - 3);
        else if(!stopShowing)
        {
            getWorld().showText(hpCurrent + "/" + hp, 470, 316);
            getWorld().showText(DataPokemon.pokemons[DataPokemon.pokemonSelected], 410, 275);
            getWorld().showText("lvl " + DataPokemon.pokemonLevels[DataPokemon.pokemonSelected], 575, 275);
            animate();
        }
    }
    
    public void animate()
    {
        if(hpPercentage >= 50)
            setImage(images[0]);
        else if(hpPercentage >= 20)
            setImage(images[1]);
        else
            setImage(images[2]);
        if(hpPercentage > 0)
            getImage().scale(hpPercentage, 4);
        else
            getImage().scale(1, 4);
        setLocation((470 + (hpPercentage - 101) / 2), 299);
    }
}
