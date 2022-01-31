import greenfoot.*;
public class WorldTownTrash extends World
{
    static int originalX = 555, originalY = 200;
    
    static boolean[] itemTaken = {false,}, npcDone = {};
    
    Scroller scroller;
    Player scrollActor;
    
    static final int WIDE = 500, HIGH = 400;
    
    static int eventProf;
    
    public WorldTownTrash()
    {
        super(WIDE, HIGH, 1, false);
        setPaintOrder
        (
            Transition.class, OverlayTextTriangle.class, OverlayText.class, OverlayChoiceTriangle.class, OverlayOption.class, Warp.class, Event.class, ObjectZone.class, 
            ObjectBasicOver.class, DustCloud.class, Player.class, Objects.class, ObjectSpecialDoor.class, ObjectBasic.class
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
        addObject(new DataPlayer(), 0, 0);
        addObject(new DataInventory(), 0, 0);
    }
    
    public void addPlayer()
    {
        GreenfootImage bg = new GreenfootImage("BackOverworldGrass.png");
        scroller = new Scroller(this, bg, 880, 600);
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
        for(int i = 0; i < 9; i++)
        {
            addObject(new ObjectBasicOver("TreeTop"), 92 + 87 * i, 537);
            addObject(new ObjectSimple("TreeBottom"), 92 + 87 * i, 597);
        }
        for(int i = 0; i < 7; i++)
            addObject(new ObjectSimple("Tree"), 6 + 86 * i, 30);
        for(int i = 0; i < 3; i++)
            addObject(new ObjectSimple("Tree"), 874 + -86 * i, 30);
        for(int j = 0; j < 2; j++)
            for(int i = 0; i < 7; i++)
                addObject(new ObjectSimple("Tree"), 6 + 868 * j, 108 + 78 * i);
        addObject(new ObjectSimple("Tree"), 702, 108);
        
        addObject(new ObjectBasic("GroundPathTownTrash"), 400, 300);
        for(int i = 0; i < 11; i++)
            addObject(new ObjectSimple("BarrierStartHorizontal"), 367 + 16 * i, 368);
        addObject(new ObjectSimple("BarrierEndHorizontal"), 542, 368);
        for(int i = 0; i < 7; i++)
            addObject(new ObjectSimple("BarrierEndVertical"), 542, 386 + 25 * i);
        addObject(new ObjectText("SignWood", new String[] {"Route 113"}), 567, 100);
        
        if(!itemTaken[0])
            addObject(new ObjectItem("Potion", 1, 0), 62, 95);
        
        addObject(new ObjectNPC
        (
            "OldMan", 
            new String[] {"I was a Trash Pokémon trainer when I", "was young, but I'm too old now"}, 
            null, 
            false, true, "turn", null, 0, 0, -1
        ), 289, 271);
        addObject(new ObjectNPC
        (
            "MusicMan", 
            new String[] {"I love music, it relaxes me a lot."}, 
            null, 
            false, true, "turn", null, 0, 0, -1
        ), 200, 431);
        
        for(int j = 0; j < 2; j++)
            for(int i = 0; i < 4; i++)
                addObject(new ObjectSpecialFlower("Red"), 566 + 94 * j, 184 + 32 * i);
        for(int j = 0; j < 2; j++)
            for(int i = 0; i < 5; i++)
                addObject(new ObjectSpecialFlower("Blue"), 566 + 94 * j, 370 + 32 * i);
        
        addObject(new ObjectSimple("CenterLeft"), 130, 215);
        addObject(new ObjectSimple("CenterRight"), 238, 215);
        addObject(new ObjectSimple("CenterUp"), 184, 175);
        addObject(new ObjectBasicOver("CenterMiddle"), 184, 237);
        addObject(new ObjectSpecialDoor("Center"), 184, 276);
        
        addObject(new ObjectSimple("HouseRedLeft"), 363, 214);
        addObject(new ObjectSimple("HouseRedRight"), 469, 214);
        addObject(new ObjectSimple("HouseRedUp"), 397, 173);
        addObject(new ObjectBasicOver("HouseRedMiddle"), 397, 235);
        addObject(new ObjectSpecialDoor("HouseRed"), 397, 274);
        
        addObject(new ObjectZone("Trash Town"), 250, 200);
        
        addObject(new Warp("WorldCenterTownTrash", 250, 315, 40, 5, 1), 184, 215);
        addObject(new Warp("WorldHousePlayerTownTrash", 150, 315, 40, 5, 1), 397, 215);
        addObject(new Warp("WorldRoute113", 440, 419, 80, 10, 1), 613, 0);
        
        if(eventProf == 0)
            addObject(new Event("prof0", 52, 10), 631, 120);
    }
}
