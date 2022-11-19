import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Verkehrskontrolle.
 * Verkehrskontrolle erzeugt zunächst Fahrzeugs und übergibt diese der Kolonne, in der die Fahrzeugs solnange 
 * kontrolliert werden, bis die max. Zahl an Kontrollen durchgeführt wurde oder die max Anzahl an 
 * Mängeln festgestellt wurde. 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Verkehrskontrolle
{
    private int maxAnzahlMaengel = 5;
    private int maxAnzahlKontrolle = 10;
    private int gefundeneMaengel;
    private int kontrollierteFahrzeuge;
    private int fahrzeugeInKontrolle;
    private int fahrzeugeInKolonne;
    private int anzahlFahrzeuge;
    
    Random rnd = new Random();
    
    private String []Modell ={"Golf"+"Yeti"+"Roomster"+"Polo"+"Corsa"+"Mondeo"+"Galaxy"+"Touran"+"BMW3"+"Porsche 911"+"Trabi"};
    private String []Farbe ={"grau"+"rot"+"gold"+"orange"+"beige"+"weiß"+"schwarz"+"silber"+"blau"+"hellbraun"+"grün"};
    private String []Character ={"A"+"B"+"C"+"D"+"E"+"F"+"G"+"H"+"I"+"J"+"K"+"L"+"M"+"N"+"O"+"P"+"Q"+"R"+"S"+"T"+"U"+"V"+"W"+"X"+"Y"+"Z"};
    
    private Fahrzeug auto1;
    private Fahrzeug auto2;
    private Fahrzeug auto3;
    private Fahrzeug auto4;
    private Fahrzeug auto5;
    private Fahrzeug auto6;
    private Fahrzeug auto7;
    private Fahrzeug auto8;
    private Fahrzeug auto9;
    private Fahrzeug auto10;
    private Fahrzeug auto11;

    private Queue<Fahrzeug> verkehrskontrolle;
    private Queue<Fahrzeug> kolonne;
    private Queue<Fahrzeug> hold;

    public Verkehrskontrolle()
    {
        kontrollierteFahrzeuge = 0;
        gefundeneMaengel = 0;
        fahrzeugeInKontrolle = 0;
        verkehrskontrolle = new Queue<Fahrzeug>();
        kolonne = new Queue<Fahrzeug>();
        hold = new Queue<Fahrzeug>();
        fahrzeugeInKolonne = 0;
        autosErzeugen();
        fahrzeugeInDieKolonne();
        /** Um das Programm leichter zu testen, werden alle 11 Fahrzeuge der Kolonne
         * in den Kontrollbereich überführt.
         */
        /**
        int anzahlInKolonne = getAnzahlFahrzeugeInKolonne();
        for (int i=0;i<anzahlInKolonne;i++)
        {
        herauswinken();
        }
         **/    
    }
    
    public void kolonneAusgeben()
    {
        Fahrzeug aktuellesFahrzeug;
        while(!kolonne.isEmpty())
        {
            aktuellesFahrzeug = kolonne.front();
            System.out.println(aktuellesFahrzeug.getModell()+" "+aktuellesFahrzeug.getFarbe()+" "+aktuellesFahrzeug.getKennzeichen()+" "+aktuellesFahrzeug.getVerkehrstauglich());
            hold.enqueue(aktuellesFahrzeug);
            kolonne.dequeue();
        }
        while(!hold.isEmpty())
        {
            aktuellesFahrzeug = hold.front();
            kolonne.enqueue(aktuellesFahrzeug);
            hold.dequeue();
        }
    }
    
    public void randomAuto()
    {
        kolonne.enqueue(new Fahrzeug(Modell[rnd.nextInt(Modell.length)], Farbe[rnd.nextInt(Farbe.length)], Character[rnd.nextInt(Character.length)]+Character[rnd.nextInt(Character.length)]+" "+Character[rnd.nextInt(Character.length)]+Character[rnd.nextInt(Character.length)]+" "+rnd.nextInt(9999)+1, rnd.nextBoolean()));
    }

    public void alleKontrollieren()
    {
        int anzahlInKolonne = getAnzahlFahrzeugeInKolonne();
        for (int i=0;i<anzahlInKolonne;i++)
        {
            herauswinken();
            dieKontrolle();
        }
    }

    public void nichtKontrollieren()
    {
        kolonne.dequeue();
        fahrzeugeInKolonne--;
    }

    /** Die Methode soll das Austesten erleichtern. Einige Fahrzeuge werden automatisch
     * generiert. Der Zeitaufwand über die Workbench die Autos zu erzeugen ist gerade für das Testen
     * sehr störend
     */
    private void autosErzeugen()
    {
        auto1 = new Fahrzeug("Golf", "blau", "PB AA 1", true);
        auto2 = new Fahrzeug("Yeti", "hellbraun", "HX MS 3813", false);
        auto3 = new Fahrzeug("Roomster", "blau", "HA RZ 1000", true);
        auto4 = new Fahrzeug("Polo", "silber", "PB AO 10", false);
        auto5 = new Fahrzeug("Corsa", "schwarz", "HX XE 64", false);
        auto6 = new Fahrzeug("Mondeo", "weiß", "PB BI 69", true);
        auto7 = new Fahrzeug("Golf", "beige", "PB AD 66", true);
        auto8 = new Fahrzeug("Touran", "orange", "BI NE 007", false);
        auto9 = new Fahrzeug("BMW3", "gold", "PB AS 12", false);
        auto10 = new Fahrzeug("Porsche 911", "rot", "PB ZZ 911", false);
        auto11 = new Fahrzeug("Trabi", "grau", "B RD 90", true);
        anzahlFahrzeuge = anzahlFahrzeuge + 11;
    }

    public void fahrzeugeInDieKolonne(Fahrzeug pFahrzeug) {
        kolonne.enqueue(pFahrzeug);
        fahrzeugeInKolonne++;
    }

    /** Genau wie die Methode autosErzeugen() dient die Methode fahrzeugeInDieKolonne der Zeitersparnis
     * 
     */
    private void fahrzeugeInDieKolonne()
    {
        kolonne.enqueue(auto1);
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto2);  
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto3);  
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto4);  
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto5);  
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto6);  
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto7);  
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto8);  
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto9);  
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto10);  
        fahrzeugeInKolonne++;
        kolonne.enqueue(auto11);  
        fahrzeugeInKolonne++;
    }

    /** Hilfsmethode,
     * wird nicht für die Funktionalität benötigt
     */
    public int getAnzahlkontrollierteFahrzeuge()
    {
        return kontrollierteFahrzeuge;
    }
    
    /** Hilfsmethode,
     * wird nicht für die Funktionalität benötigt
     */
    public int getfahrzeugeInKontrolle()
    {
        return fahrzeugeInKontrolle;
    }

    public int getAnzahlFahrzeugeInKolonne()
    {
        return fahrzeugeInKolonne;
    }

    /** Hilfsmethode,
     * wird nicht für die Funktionalität benötigt
     */
    public int getAnzahlMaengel()
    {
        return gefundeneMaengel;
    }

    public void herauswinken()
    {
        if (!kolonne.isEmpty())
        {
            verkehrskontrolle.enqueue(kolonne.front());
            kolonne.dequeue();
            fahrzeugeInKolonne--;
            fahrzeugeInKontrolle++;
        }
        else 
        {
            System.out.println("Keine Fahrzeuge mehr in der Kolonne.");
        }
    }

    public void kolonneAufloesen()
    {
        while(!kolonne.isEmpty())
        {
            kolonne.dequeue();
            fahrzeugeInKolonne--;
        }
    }

    public boolean fahrzeugUeberpruefen()
    {
        Fahrzeug aktuellesFahrzeug;

        aktuellesFahrzeug = verkehrskontrolle.front();
        if (aktuellesFahrzeug.getVerkehrstauglich() == false)
        {
            gefundeneMaengel++;
            System.out.println("Auto mit Mängel gefunden, Kennzeichen: " + aktuellesFahrzeug.getKennzeichen());
        }
        return aktuellesFahrzeug.getVerkehrstauglich();

    }

    public void dieKontrolle()
    {
        if (!verkehrskontrolle.isEmpty())
        {
            if ((gefundeneMaengel < maxAnzahlMaengel) && (kontrollierteFahrzeuge < maxAnzahlKontrolle))
            {
                fahrzeugUeberpruefen();
                kontrollierteFahrzeuge++;
                verkehrskontrolle.dequeue();
                fahrzeugeInKontrolle--;
            }
            else
            {
                System.out.println("Kontrolle zu Ende, die Restlichen haben Glück!");
                this.kolonneAufloesen();
            }
        }
    }
}
