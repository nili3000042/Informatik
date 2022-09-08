import java.util.*;
/**
 * Nils Knupp
 */
public class mehrWuerfel
{
    Random rnd = new Random();
    public void mehrWuerfel(int anzahl)
    {
        System.out.print('\u000c');
        int wuerfe[] = new int[anzahl];
        for(int i =0;i<wuerfe.length;i++)
        {
            wuerfe[i]=rnd.nextInt(6)+1;
        }
        int summe=0;
        for(int i =0;i<wuerfe.length;i++)
        {
            summe=summe+wuerfe[i];
        }
        System.out.println("Die gesammt Summe von "+wuerfe.length+" Würfen ist: "+summe);
    }
}
