import java.util.*;
/**
 * Nils Knupp
 */
public class Wuerfel
{
    Random rnd = new Random();
    public Wuerfel(){
        System.out.println('\u000c');
        int wurf = rnd.nextInt(6)+1;
        System.out.println("Es wurde eine "+wurf+" gewürfelt.");
    }
}
