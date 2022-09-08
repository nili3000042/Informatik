import java.util.*;
/**
 * Nils Knupp
 */
public class mehrWuerfelstatic
{
    Random rnd = new Random();
    public static void mehrWuerfelstatic(int anzahl)
    {
        System.out.print('\u000c');
        int wuerfe[] = new int[anzahl];
        for(int i =0;i<wuerfe.length;i++)
        {
            wuerfe[i]=(int)(Math.random()*6+1);
        }
        int summe=0;
        for(int i =0;i<wuerfe.length;i++)
        {
            summe=summe+wuerfe[i];
        }
        System.out.println("Die gesammt Summe von "+wuerfe.length+" Würfen ist: "+summe);
    }
}
