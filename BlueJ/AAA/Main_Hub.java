import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main_Hub
{
    Scanner scan = new Scanner(System.in);
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public Main_Hub()
    {
        char eingabe ='n';
        do
        {
            new Rechner();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Möchtest du weitergehen in den nächsten Bereich "+'"'+"Altersabfrage"+'"'+"?");
            eingabe = scan.next().charAt(0);
        } while (eingabe!='y');
        do
        {
            new Altersabfrage();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Möchtest du weitergehen in den nächsten Bereich "+'"'+"Zahlen_Vergleichen"+'"'+"?");
            eingabe = scan.next().charAt(0);
        } while (eingabe!='y');
        do
        {
            new Zahlen_Vergleichen();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Möchtest du weitergehen in den nächsten Bereich "+'"'+"Verschachtelte_Schleifen_Bsp"+'"'+"?");
            eingabe = scan.next().charAt(0);
        } while (eingabe!='y');
        do
        {
            new Verschachtelte_Schleifen_Bsp();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Möchtest du weitergehen in den nächsten Bereich "+'"'+"Scanner_Bsp"+'"'+"?");
            eingabe = scan.next().charAt(0);
        } while (eingabe!='y');
        do
        {
            new Scanner_Bsp();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Möchtest du weitergehen in den nächsten Bereich "+'"'+"Scanner_While_Bsp_Chose"+'"'+"?");
            eingabe = scan.next().charAt(0);
        } while (eingabe!='y');
        do
        {
            new Scanner_While_Bsp_Chose();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Möchtest du weitergehen in den nächsten Bereich "+'"'+"Beenden"+'"'+"?");
            eingabe = scan.next().charAt(0);
        } while (eingabe!='y');
    }
}
