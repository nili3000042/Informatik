import greenfoot.*;
public class WorldCenterTownTrash extends World
{
    static int originalX = 250, originalY = 120;
    
    static boolean[] itemTaken = {}, npcDone = {false,};
    
    Scroller scroller;
    Actor scrollActor;
    
    static final int WIDE = 500, HIGH = 400;
    
    public WorldCenterTownTrash()
    {
        super(WIDE, HIGH, 1, false);
        setPaintOrder
        (
            Transition.class, OverlayTextTriangle.class, OverlayText.class, Warp.class, ObjectBasicOver.class, DustCloud.class, Player.class, Objects.class
        );
        setActOrder(Player.class, OverlayOption.class);
        addData();
        addObjects();
        addPlayer();
    }
    
    public void act()
    {
        if(scrollActor != null)
            scroll();
    }
    
    public void scroll()
    {
        int dsX = scrollActor.getX() - WIDE / 2;
        int dsY = scrollActor.getY() - HIGH / 2;
        scroller.scroll(dsX, dsY);
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
        GreenfootImage bg = new GreenfootImage("BackCenter.png");
        scroller = new Scroller(this, bg, 500, 400);
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
        addObject(new Wall(40, 400, 0), 20, 200);
        addObject(new Wall(40, 400, 0), 480, 200);
        addObject(new Wall(500, 40, 0), 250, 380);
        addObject(new Wall(500, 20, 0), 250, 10);
        addObject(new Wall(50, 50, 45), 40, 35);
        addObject(new Wall(50, 50, 45), 460, 35);
        addObject(new Wall(50, 50, 45), 40, 360);
        addObject(new Wall(50, 50, 45), 460, 360);
        
        addObject(new ObjectSimple("WallBackCenter"), 250, 44);
        addObject(new ObjectSimple("WallBackLeftCenter"), 53, 56);
        addObject(new ObjectSimple("WallBackRightCenter"), 447, 56);
        addObject(new ObjectSimple("Bookshelf"), 106, 60);
        addObject(new ObjectSimple("TableCenter"), 395, 270);
        addObject(new ObjectSimple("PotPlant"), 58, 290);
        addObject(new ObjectBasic("CarpetExit"), 250, 355);
        addObject(new ObjectBasic("CouchBlue"), 415, 320);
        addObject(new ObjectBasic("CouchYellow"), 378, 320);
        addObject(new ObjectBasic("CouchYellow"), 342, 285);
        addObject(new ObjectBasic("CouchOrange"), 342, 255);
        addObject(new ObjectBasic("CouchYellow"), 57, 135);
        addObject(new ObjectBasic("CouchOrange"), 90, 135);
        addObject(new ObjectBasic("MapCenter"), 400, 48);
        addObject(new ObjectText("PCCenter", new String[] {"The PC isn't available yet"}), 349, 54);
        addObject(new ObjectNPC
        (
            "YoungGirl", 
            new String[] {"Hello !", "Someone gave me this, you want it ?"},
            new String[] {"Do you like this potion ?"},
            npcDone[0], true, "still", "Potion", 1, 0, 0
        ), 57, 102);
        addObject(new ObjectSpecialNPCCenterNurse(), 250, 85);
        addObject(new ObjectSpecialCenterMain(), 234, 80);
        
        addObject(new Warp("WorldTownTrash", 184, 315, 50, 5, 1), 250, 350);
    }
}
