import greenfoot.*;
public class WorldWildBattle extends World
{
    public static boolean attackOver;
    
    public WorldWildBattle()
    {
        super(600, 500, 1);
        setPaintOrder
        (
            Transition.class, BattleCursor.class, OverlayTextTriangle.class, OverlayText.class, BattleButton.class, BattleOverlay.class, 
            PokemonPlayer.class, BattleAttack.class, PokemonEnemy.class
        );
        addData();
        addOverlays();
        addMenuButtons();
        addStartObjects();
    }
    
    public void act()
    {
        if(!attackOver)
            setPaintOrder
            (
                Transition.class, BattleCursor.class, OverlayTextTriangle.class, OverlayText.class, BattleButton.class, BattleOverlay.class, 
                PokemonPlayer.class, BattleAttack.class, PokemonEnemy.class
            );
        else
            setPaintOrder
            (
                Transition.class, BattleCursor.class, OverlayTextTriangle.class, OverlayText.class, BattleButton.class, BattleOverlay.class, 
                BattleAttack.class, PokemonPlayer.class, PokemonEnemy.class
            );
    }
    
    public void addData()
    {
        addObject(new DataSound(), 0, 0);
        addObject(new DataPlayer(), 0, 0);
        addObject(new DataPokemon(), 0, 0);
        addObject(new DataWildPokemon(this.getClass().getName()), 0, 0);
        addObject(new DataWildBattle(), 0, 0);
        addObject(new DataInventory(), 0, 0);
    }
    
    public void addOverlays()
    {
        addObject(new Transition("outWild", null), 300, 200);
        addObject(new BattleOverlay(), 300, 450);
        addObject(new BattleCursor(), 114, 428);
        addOverlayText(new String[] 
        {
            "A wild " + DataWildPokemon.pokemons[DataWildPokemon.pokemonSelected] + " appeared !", DataPokemon.pokemons[DataPokemon.pokemonSelected] + ", go !"
        }, 125);
    }
    
    public void addStartObjects()
    {
        addObject(new BasePlayer("Grass"), 204, 460);
        addObject(new BaseEnemy("Grass"), 450, 68);
        addObject(new PokemonEnemy(), 450, 0);
        addObject(new BattlePlayer(), 300, 250);
    }
    
    public void addMenuButtons()
    {
        removeObjects(getObjects(BattleButtonFight.class));
        addObject(new BattleButtonMenu("Fight"), 115, 428);
        addObject(new BattleButtonMenu("Bag"), 340, 428);
        addObject(new BattleButtonMenu("Pokemon"), 115, 475);
        addObject(new BattleButtonMenu("Run"), 340, 475);
    }
    
    public void addFightButtons()
    {
        removeObjects(getObjects(BattleButtonMenu.class));
        addObject(new BattleButtonFight(DataPokemon.pokemonMoves1[DataPokemon.pokemonSelected]), 115, 428);
        addObject(new BattleButtonFight(DataPokemon.pokemonMoves2[DataPokemon.pokemonSelected]), 340, 428);
        addObject(new BattleButtonFight(DataPokemon.pokemonMoves3[DataPokemon.pokemonSelected]), 115, 475);
        addObject(new BattleButtonFight(DataPokemon.pokemonMoves4[DataPokemon.pokemonSelected]), 340, 475);
    }
    
    public void addBagButtons()
    {
        removeObjects(getObjects(BattleButtonMenu.class));
        addObject(new BattleButtonFight(DataInventory.items[0]), 115, 428);
        addObject(new BattleButtonFight(DataInventory.items[1]), 340, 428);
        addObject(new BattleButtonFight(DataInventory.items[2]), 115, 475);
        addObject(new BattleButtonFight(DataInventory.items[3]), 340, 475);
    }
    
    public void addOverlayText(String[] texts, int time)
    {
        addObject(new OverlayText(texts, time, "WorldWildBattle"), 227, 450);
    }
}
