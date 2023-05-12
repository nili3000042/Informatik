import java.util.*;
public class Ausprobieren
{
    Queue<Integer> a1Queue = new Queue<Integer>();
    Random rnd = new Random();
    
    public void fillQueue(){
        int a = rnd.nextInt(1001);
        do {
            a1Queue.enqueue(rnd.nextInt(1001));
            a--;
        } while(a>0);
    }
    
    public void printLength() {
        System.out.println(a1Queue.getLength());
    }
    
    public void ausgabe()
    {
        while(!a1Queue.isEmpty()) {
            System.out.println(a1Queue.front());
            a1Queue.dequeue();
        }
    }
}
