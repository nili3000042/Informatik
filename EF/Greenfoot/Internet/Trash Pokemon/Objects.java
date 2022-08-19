import greenfoot.*;
public class Objects extends Actor
{
    int playerX, playerY;
    
    int textX = 250, textY = 345;
    
    int center;
    
    static boolean canScroll;
    
    public void checkPlayer()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        playerX = player.getX();
        playerY = player.getY();
        if(isTouching(Player.class) && playerY < getY() + center)
            player.hitBox();
    }
    
    public boolean isInRange()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        boolean isInRange = (Math.abs(player.getY() - getY()) < (getImage().getHeight() / 2 + player.getImage().getHeight() / 2 + 3) && 
            Math.abs(player.getX() - getX()) < (getImage().getWidth() / 2 + player.getImage().getWidth() / 2 + 5));
        if(isInRange && playerY - getY() < (center + 2) && playerY > getY() && 
        Math.abs(playerX - getX()) < getImage().getWidth() / 2 + player.getImage().getWidth() / 2)
            return(player.getImage() == player.sprites[1]);
        else if(getY() > (getImage().getHeight() / 2) + playerY + player.getImage().getHeight() / 2 - 2 && 
        Math.abs(playerX - getX()) < getImage().getWidth() / 2 + player.getImage().getWidth() / 2)
            return(player.getImage() == player.sprites[0]);
        else if(isInRange && playerX < getX())
            return(player.getImage() == player.sprites[3]);
        else if(isInRange && playerX > getX())
            return(player.getImage() == player.sprites[2]);
        return false;
    }
}
