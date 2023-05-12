
/**
 *   0   1   2   3   4     <-----index Array
 *   10  5   3   7   2     <-----Zahlen des Array
 *   10                    <-----Neu sortiertes Array 
 *   i                     <-----äußereLoop  "durchlauf" eigentlich i
 *       j                 <-----innereLoop j
 *   x                     <-----Marker beim sortierten Teil des Arrays
 *      zuSortierendesElement = 5
 *       
 */


public class Insertionsort
{
    public static void main(String[]args){
        int []zahlen =  {10,5,3,7,2};
        
        insertionSort(zahlen);
        printArray(zahlen);
        
    }
    

    public static int[] insertionSort(int[] zahlen) {

        

        for (int durchlauf=1; 
        
        
        
        
        
        
        
        }
        return zahlen;
    }
    
    public static void printArray(int[] zahlen){
        for (int i=0; i<zahlen.length; i++){
            System.out.println(zahlen[i]);
        }
    }
}
