import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Do28_04.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Do28_04
{
   public static void Insertion()
   {
       System.out.println('\u000C'); //Feld leeren
       Random zufall = new Random();
        
       int[]A= new int[7];
        
      for(int i=0; i<A.length; i++)//Zufallszahlen werden generiert
      {
            A[i]=zufall.nextInt(100);
            System.out.print(A[i] + " ");
            
      }
      
      System.out.println(" ");
        
      for(int i=1; i<A.length; i++)
      {
            int merke = A[i];
            int j = i;
            
            while(j>0 && A[j-1]>merke)
            {
                A[j]=A[j-1];
                j--;
            }
            
            A[j]=merke;
            
      }
        
      for (int i=0; i<A.length; i++)//Zahlen werden ausgegeben
      {
            System.out.print(A[i]+" ");
      }
   }
    
   public static void bubble()
    {
      System.out.println('\u000C'); //Feld leeren
      Random zufall = new Random();
        
      int[]A= new int[7];
        
      for(int i=0; i<A.length; i++)//Zufallszahlen werden generiert
      {
            A[i]=zufall.nextInt(100);
            System.out.print(A[i] + " ");
            
      }
      
      System.out.println(" ");
      
      int n= A.length;
      
      while(n>1)
      {
          for ( int i=0; i<=n-2; i++)//Zahlen werden getauscht
          {
              if (A[i]>A[i+1])
              {
                  int hilf = A[i];
                  A[i]=A[i+1];
                  A[i+1]=hilf;
              }
          }
          
          n--;
      }
      
      for (int i=0; i<A.length; i++)//Zahlen werden ausgegeben
      {
            System.out.print(A[i]+" ");
      }
    }
}
