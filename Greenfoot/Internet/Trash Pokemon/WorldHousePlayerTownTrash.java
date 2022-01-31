import greenfoot.*;
public class WorldHousePlayerTownTrash extends World
{
    static int originalX = 250, originalY = 120;
    
    static boolean[] itemTaken = {}, npcDone = {false,};
    
    Scroller scroller;
    Actor scrollActor;
    
    static final int WIDE = 500, HIGH = 400;
    
    public WorldHousePlayerTownTrash()
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
        GreenfootImage bg = new GreenfootImage("BackHouseRed.png");
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
        addObject(new Wall(70, 400, 0), 20, 200);
        addObject(new Wall(70, 400, 0), 480, 200);
        addObject(new Wall(500, 40, 0), 250, 380);
        addObject(new Wall(500, 20, 0), 250, 10);
        
        addObject(new ObjectBasic("CarpetExit"), 150, 355);
        addObject(new ObjectBasic("CarpetBig"), 270, 205);
        addObject(new ObjectBasic("ChairBlueLeft"), 213, 185);
        addObject(new ObjectBasic("ChairBlueLeft"), 213, 215);
        addObject(new ObjectBasic("ChairBlueRight"), 326, 185);
        addObject(new ObjectBasic("ChairBlueRight"), 326, 215);
        addObject(new ObjectSimple("WallBackHouseRed"), 250, 44);
        addObject(new ObjectSimple("TableHouse"), 270, 201);
        addObject(new ObjectSimple("SinkHouse"), 87, 70);
        addObject(new ObjectSimple("Bookshelf"), 151, 63);
        addObject(new ObjectText("TVHouse", new String[] {"Poké News :", "New Pokémons have been discovered lately."}), 251, 63);
        
        addObject(new ObjectNPC
        (
            "PlayerMom",
            new String[] {"Hello Red !", "Go find professor Trash, he will give", "you a Pokémon.", "I hope you'll like your adventure !"}, 
            new String[] {"Hello Red, how is your adventure going ?"}, 
            npcDone[0], true, "still", null, 0, 2, 0
        ), 323, 183);
        
        addObject(new Warp("WorldTownTrash", 397, 315, 50, 5, 1), 150, 350);
    }
}
