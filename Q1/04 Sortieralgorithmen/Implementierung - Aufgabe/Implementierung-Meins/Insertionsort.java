
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
        int []zahlen2 = insertionSort(zahlen);
        System.out.print('\f');
        printArray(zahlen);
        System.out.println("Sortiert:");
        printArray(zahlen2);
    }

    public static int[] insertionSort(int[] A) {
        int[] B = A.clone();
        for (int i=1; i <=B.length; i++) {
            int a = B[i];
            int j;
            for(j=i-1;j>=0 && B[j]>a;j--){
                B[j+1]=B[j];
            }
            B[j+1]=a;
        }
        return B;
    }

    public static void printArray(int[] B){
        for (int i=0; i<B.length; i++){
            System.out.println(B[i]);
        }
    }
}