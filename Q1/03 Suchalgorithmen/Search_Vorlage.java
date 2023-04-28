import java.util.Arrays;
import java.util.Random;

public class Search_Vorlage {
    public static void main(String[] args) {
        int[] list = getRandomList(0, 10000, 100000000);
        int search = getRandom(0, 10000);
        
        System.out.println("Gesucht: " + search);
        
        System.out.println("---");
        
        int linearPos = linearSearch(search, list);
        if (linearPos >= 0) {
            System.out.println("Gefunden bei: " + linearPos + ". Wert: " + list[linearPos]);
        } else {
            System.out.println("Nicht gefunden.");
        }
        
        System.out.println("---");
        
        Arrays.sort(list);
        
        int binaryPos = binarySearch(search, list);
        
        if (binaryPos >= 0) {
            System.out.println("Gefunden bei: " + binaryPos + ". Wert: " + list[binaryPos]);
        } else {
            System.out.println("Nicht gefunden.");
        }
    }

    /**
     * Sucht das erste Vorkommen von search in list.
     *
     * @param search Die gesuchte Zahl.
     * @param list Die Liste in der gesucht werden soll.
     * @return Der Index an dem die gesuchte Zahl zu finden ist, oder -1.
     */
    public static int linearSearch(int search, int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (search == list[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Sucht ein Vorkommen von search in list.
     *
     * @param search Die gesuchte Zahl.
     * @param list Die Liste in der gesucht werden soll.
     * @return Der Index an dem die gesuchte Zahl zu finden ist, oder -1.
     */
    public static int binarySearch(int search, int[] list) {
        int start = 0;
        int end = list.length - 1;
        
        while (start != end) {
            int center = start + ((end - start) / 2);

            if (list[center] == search) {
                return center;
            }

            if (list[center] > search) {
                end = center;
            } else {
                start = center + 1;
            }
        }

        return -1;
    }

    /**
     * Generiert ein Array mit zufälligen int-Werten.
     * @param min Minimaler Zufallswert.
     * @param max Maximaler Zufallswert.
     * @param size Größe des Arrays.
     * @return Array mit zufälligen int-Werten zwischen min und max mit Länge
     * size.
     */
    private static int[] getRandomList(int min, int max, int size) {
        Random random = new Random();
        return random.ints(size, min, max).toArray();
    }

    /**
     * Generiert eine zufälligen int-Wert.
     * @param min Minimaler Wert.
     * @param max Maximaler Wert.
     * @return Zufälliger int-Wert zwischen min und max.
     */
    private static int getRandom(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }
}