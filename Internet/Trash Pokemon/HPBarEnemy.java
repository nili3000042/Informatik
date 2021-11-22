import greenfoot.*;
public class HPBarEnemy extends Battle
{
    GreenfootImage[] images = 
    {
        new GreenfootImage("Battle/HPBar0.png"),
        new GreenfootImage("Battle/HPBar1.png"),
        new GreenfootImage("Battle/HPBar2.png"),
    };
    
    int hp;
    int hpCurrent;
    int hpPercentage;
    
    boolean stopShowing;
    
    public HPBarEnemy()
    {
        setImage(images[0]);
    }
    
    public void act()
    {
        hp = DataWildPokemon.hpStats[DataWildPokemon.pokemonSelected];
        hpCurrent = DataWildPokemon.hpStatsCurrent[DataWildPokemon.pokemonSelected];
        hpPercentage = (hpCurrent * 100) / hp;
        if(getY() < 107)
            setLocation(getX(), getY() + 3);
        else if(!stopShowing)
        {
            getWorld().showText(DataWildPokemon.pokemons[DataWildPokemon.pokemonSelected], 60, 85);
            getWorld().showText("lvl " + DataWildPokemon.pokemonLevels, 200, 85);
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
        setLocation((126 + (hpPercentage - 101) / 2), 109);
    }
}
