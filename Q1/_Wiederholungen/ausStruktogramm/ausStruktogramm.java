
/**
 * Nils Knupp
 */
public class ausStruktogramm
{
    //Methode mit para-Übergabe
    public void Vergleichen(int pA,int pB)
    {
        //Während pA und pB gröser sind als 0
        while(pA>0 && pB>0)
        {
            //Wenn pA größer ist als pB
            if(pA>pB)
            {
                //pA gleich pA minus pB
                pA=pA-pB;
            }
            //ansonst
            else
            {
                //pB gleich pB minus pA
                pB=pB-pA;
            }
        }
        //Wenn pB gleich 0 ist
        if(pB==0)
        {
            //gebe pA aus
            System.out.println(pA);
        }
        //ansonst
        else
        {
            //gebe pB aus
            System.out.println(pA);
        }
    }
}
