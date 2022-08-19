import greenfoot.*;
public class WorldRoute113 extends World
{
    static int originalX = 300, originalY = 200;
    
    static boolean[] itemTaken = {false,}, npcDone = {false,};
    
    Scroller scroller;
    Actor scrollActor;
    
    static final int WIDE = 500, HIGH = 400;
    
    public WorldRoute113()
    {
        super(WIDE, HIGH, 1, false);
        setPaintOrder
        (
            Transition.class, OverlayTextTriangle.class, OverlayText.class, OverlayChoiceTriangle.class, OverlayOption.class, Warp.class, Event.class, ObjectZone.class, 
            ObjectBasicOver.class, DustCloud.class, Player.class, Objects.class
        );
        setActOrder(Player.class, OverlayOption.class);
        addData();
        addObjects();
        addPlayer();
    }
    
    public void act()
    {
        scroll();
    }
    
    public void scroll()
    {
        if(scrollActor != null)
        {
            int dsX = scrollActor.getX() - WIDE / 2;
            int dsY = scrollActor.getY() - HIGH / 2;
            scroller.scroll(dsX, dsY);
        }
    }
    
    public void addData()
    {
        addObject(new DataSound(), 0, 0);
        addObject(new DataPokemon(), 0, 0);
        addObject(new DataWildPokemon(this.getClass().getName()), 0, 0);
        addObject(new DataPlayer(), 0, 0);
        addObject(new DataInventory(), 0, 0);
    }
    
    public void addPlayer()
    {
        GreenfootImage bg = new GreenfootImage("BackOverworldGrass.png");
        scroller = new Scroller(this, bg, 621, 444);
        scrollActor = new Player();
        addObject(scrollActor, originalX, originalY);
        Player.originalX = originalX;
        Player.originalY = originalY;
        Player.worldX = originalX;
        Player.worldY = originalY;
        Player.speed = 2;
        scroll();
    }
    
    public void addObjects()
    {
        for(int i = 0; i < 4; i++)
        {
            addObject(new ObjectBasicOver("TreeTop"), 92 + 86 * i, 382);
            addObject(new ObjectSimple("TreeBottom"), 92 + 86 * i, 441);
        }
        addObject(new ObjectBasicOver("TreeTop"), 529, 382);
        addObject(new ObjectSimple("TreeBottom"), 529, 441);
        for(int i = 0; i < 8; i++)
            addObject(new ObjectSimple("Tree"), 6 + 87 * i, 30);
        for(int j = 0; j < 2; j++)
            for(int i = 0; i < 5; i++)
                addObject(new ObjectSimple("Tree"), 6 + 609 * j, 108 + 78 * i);
        
        addObject(new ObjectNPC
        (
            "AdventureMan",
            new String[] {"Wild Pokémons are dangerous. Take this."}, 
            new String[] {"Don't forget to use them when your", "Pokémon's hp are low."}, 
            npcDone[0], true, "turn", "Potion", 3, 2, 0
        ), 560, 311);
        addObject(new ObjectSpecialGrass("Test"), 100, 145);
        if(!itemTaken[0])
            addObject(new ObjectItem("SuperPotion", 1, 0), 558, 95);
        
        addObject(new ObjectZone("Route 113"), 250, 200);
        
        addObject(new Warp("WorldTownTrash", 613, 25, 80, 10, 1), 440, 444);
    }
}
