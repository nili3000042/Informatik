import greenfoot.*;
public class Player extends Actor
{
    GreenfootImage[] sprites = new GreenfootImage[8];
    static int direction;
    
    int moveTime = 7;
    static int speed = 2;
    boolean isMoving;
    
    static int originalX, originalY;
    static int worldX, worldY;
    static int previousWorldX, previousWorldY;
    
    public Player()
    {
        sprites[0] = new GreenfootImage("Player/" + DataPlayer.gender + "Down.png");
        sprites[1] = new GreenfootImage("Player/" + DataPlayer.gender + "Up.png");
        sprites[2] = new GreenfootImage("Player/" + DataPlayer.gender + "Left.png");
        sprites[3] = new GreenfootImage("Player/" + DataPlayer.gender + "Right.png");
        sprites[4] = new GreenfootImage("Player/" + DataPlayer.gender + "DownRun.png");
        sprites[5] = new GreenfootImage("Player/" + DataPlayer.gender + "UpRun.png");
        sprites[6] = new GreenfootImage("Player/" + DataPlayer.gender + "LeftRun.png");
        sprites[7] = new GreenfootImage("Player/" + DataPlayer.gender + "RightRun.png");
        setImage(sprites[direction]);
    }
    
    public void act()
    {
        checkMove();
    }
    
    public void checkMove()
    {
        originalX = getX();
        originalY = getY();
        previousWorldX = worldX;
        previousWorldY = worldY;
        if(speed > 0)
        {
            if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down"))
                moveTime--;
            if(Greenfoot.isKeyDown("left"))
            {
                direction = 2;
                move(-speed);
                worldX -= speed;
                if(getImage() == sprites[2] && moveTime == 0)
                    setImage(sprites[6]);
                else if(moveTime == 0)
                    setImage(sprites[2]);
            }
            else if(Greenfoot.isKeyDown("right"))
            {
                direction = 3;
                move(speed);
                worldX += speed;
                if(getImage() == sprites[3] && moveTime == 0)
                    setImage(sprites[7]);
                else if(moveTime == 0)
                    setImage(sprites[3]);
            }
            else if(Greenfoot.isKeyDown("down"))
            {
                direction = 0;
                setLocation(getX(), getY() + speed);
                worldY += speed;
                if(getImage() == sprites[0] && moveTime == 0)
                    setImage(sprites[4]);
                else if(moveTime == 0)
                    setImage(sprites[0]);
            }
            else if(Greenfoot.isKeyDown("up"))
            {
                direction = 1;
                setLocation(getX(), getY() - speed);
                worldY -= speed;
                if(getImage() == sprites[1] && moveTime == 0)
                    setImage(sprites[5]);
                else if(moveTime == 0)
                    setImage(sprites[1]);
            }
            if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down"))
            {
                isMoving = true;
                if(moveTime == 0)
                    moveTime = 7;
            }
            else
            {
                isMoving = false;
                setImage(sprites[direction]);
                moveTime = 7;
            }
        }
        else
            isMoving = false;
    }
    
    public void checkGrass()
    {
        if(Greenfoot.getRandomNumber(5) == 0 && isMoving)
            getWorld().addObject(new DustCloud(), getX(), getY() + 5);
    }
    
    public void hitBox()
    {
        if(!isTouching(WallReverse.class))
        {
            setLocation(originalX, originalY);
            worldX = previousWorldX;
            worldY = previousWorldY;
        }
    }
}
