  
/**
 * Eine Queue, die auch zaehlen kann, wie viele Elemente enthalten sind
 */

public class Zaehlschlange<ContentType> extends Queue<ContentType>{
  
  //Bezugsobjekte & Attribute
  private int anzahl;
  
              
  //Konstruktor oberklasse (Queue) wird aufgerufen mit super
  public Zaehlschlange(){
     super();
  anzahl= 0;
  }
  
  //Methoden
  public int getAnzahl() {
        return anzahl;
    }
  
  //von Queue geerbte Methoden überprüfen
  
  @Override
  public void enqueue(ContentType pContent){
    if (pContent !=null) {
       super.enqueue(pContent);
       anzahl++;
    } // end of if
       
    }
  
  @Override
  public void dequeue(){
    if (!isEmpty()) {
       super.dequeue();
       anzahl--;
    } // end of if
       
    }
}
