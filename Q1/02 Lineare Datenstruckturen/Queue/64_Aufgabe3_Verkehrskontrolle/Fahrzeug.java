public class Fahrzeug
{
    private String modell;
    private String farbe;
    private String kennzeichen;
    private boolean verkehrstauglich;

    public Fahrzeug(String pModell, String pFarbe, String pKennzeichen, boolean pVerkehrstauglich)
    {
        modell = pModell;
        farbe = pFarbe;
        kennzeichen = pKennzeichen;
        verkehrstauglich = pVerkehrstauglich;

    }

    public boolean getVerkehrstauglich()
    {
        return verkehrstauglich;
    }

    public String getKennzeichen()
    {
        return kennzeichen;
    }
}
