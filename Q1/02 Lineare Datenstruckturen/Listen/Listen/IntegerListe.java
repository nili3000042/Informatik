import java.util.*;
public class IntegerListe
{
    public static void main(){
        System.out.print('\u000c');
        List<Integer> iListe =new ArrayList<Integer>();
        iListe.add(2099);
        iListe.add(30);
        iListe.add(2099);
        iListe.add(45);
        iListe.add(0,89);
        iListe.remove(1);
        iListe.remove(iListe.indexOf(2099));
        iListe.add(3012);
        if(iListe.contains(2099)==true){
            System.out.print("Position of 2099: ");
            System.out.println(iListe.indexOf(2099));
            System.out.println();
        }
        else if(iListe.contains(45)==true){
            System.out.print("Position of 45: ");
            System.out.println(iListe.indexOf(45));
            System.out.println();
        }
        iListe.add(2);
        iListe.remove(2);
        for(int i =0; i<iListe.size();i++){
            System.out.println(iListe.get(i));
        }
    }
}
