import java.util.*;
public class StringListe
{
    public static void main(){
        System.out.print('\u000c');
        List<String> sListe =new ArrayList<String>();
        sListe.add("Your Mom");
        sListe.add("Jans Mom");
        sListe.add("Your Mom");
        sListe.add("My Mom");
        sListe.add(0,"Lukas Mom");
        sListe.remove(1);
        sListe.remove(sListe.indexOf("Your Mom"));
        sListe.add("Chris Mom");
        if(sListe.contains("Your Mom")==true){
            System.out.print("Position of 'Your Mom': ");
            System.out.println(sListe.indexOf("Your Mom"));
            System.out.println();
        }
        else if(sListe.contains("My Mom")==true){
            System.out.print("Position of 'My Mom': ");
            System.out.println(sListe.indexOf("My Mom"));
            System.out.println();
        }
        sListe.add("Lucas Mom");
        sListe.remove(2);
        for(int i =0; i<sListe.size();i++){
            System.out.println(sListe.get(i));
        }
    }
}
