
/**
 *   0   1   2   3   4     <-----index Array
 *   10  5   3   7   2     <-----Zahlen des Array
 *   10                    <-----Neu sortiertes Array 
 *   i                     <-----äußereLoop  "durchlauf" (eigentlich i)
 *       j                 <-----innereLoop j
 *   
 *      kleinstesElement = 5
 *      temp=
 */

public class Selectionsort
{
    public static void main(String[]args){
        int []zahlen =  {10,5,3,7,2};
        int []zahlen2 = selectionSort(zahlen);
        System.out.print('\f');
        printArray(zahlen);
        System.out.println("Sortiert:");
        printArray(zahlen2);
    }

    public static int[] selectionSort(int[] B) {
        int[] A = B.clone();
        for (int i=0; i<A.length; i++) {
            int kleinstesElement = i;
            for (int j = i+1; j<A.length; j++) {
                if(A[j]<A[kleinstesElement]){
                    kleinstesElement=j;
                }
            }
            int temp = A[i];
            A[i] = A[kleinstesElement];
            A[kleinstesElement] = temp;
        }
        return A;
    }

    public static void printArray(int[] B){
        for (int i=0; i<B.length; i++){
            System.out.println(B[i]);
        }
    }
}
