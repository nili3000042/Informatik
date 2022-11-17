/**
* Objekte der generischen Klasse Queue (Warteschlange) 
* verwalten beliebige Objekte vom Typ
* ContentType nach dem First-In-First-Out-Prinzip, 
* d.h., das zuerst abgelegte Objekt wird als
* erstes wieder entnommen. Alle Methoden haben eine 
* konstante Laufzeit, unabhängig von der
* Anzahl der verwalteten Objekte.
*/
public class Queue<ContentType> {
  
  /**
  * Klasse zum Verwalten von verketteten Inhaltsobjekten
  */
  private class Container<ContentType>{
    //Bezugsobjekte
    private ContentType content;
    private Container<ContentType> next;
    
    //Konstruktor
    public Container(ContentType pContent){
      content = pContent;
      next = null;
    }
    
    //Methoden
    public ContentType getContent(){
      return content;
    }
    
    public Container<ContentType> getNext(){
      return next;
    }
    
    public void setNext(Container<ContentType> pNext){
      next = pNext;
    }
  }
  
  //Bezugsobjekte der Klasse Queue
  private Container<ContentType> front;
  private Container<ContentType> tail;
  
  //Konstruktor
  /**
  * Eine leere Schlange wird erzeugt. 
  * Objekte, die in dieser Schlange
  * verwaltet werden, müssen vom Typ ContentType sein.
  */
  public Queue(){
    front = null;
    tail = null;
  }
  
  //Methoden
  /**
  * Die Anfrage liefert den Wert true, 
  * wenn die Schlange keine Objekte enthält, 
  * sonst liefert sie den Wert false.
  */
  public boolean isEmpty(){
    return front == null;
  }
  
  /**
  * Das Objekt pContent wird an die Schlange angehängt. 
  * Falls pContent gleich null ist, 
  * bleibt die Schlange unverändert.
  */
  public void enqueue(ContentType pContent){
    if (pContent != null) {
      Container<ContentType> newTail = new Container<>(pContent);
      if (isEmpty() == true) {
        front = newTail;        
      } else {        
        tail.setNext(newTail);        
      } // end of if-else      
      tail = newTail;
    } // end of if         
  }
  
  /**
  * Das erste Objekt wird aus der Schlange entfernt. 
  * Falls die Schlange leer ist, wird sie nicht verändert.
  */
  public void dequeue(){
    if(!isEmpty()){
      if(front == tail){
        tail = null;
      }
      front = front.getNext();
    }
  }
  
  /**
  * Die Anfrage liefert das erste Objekt der Schlange. 
  * Die Schlange bleibt unverändert. 
  * Falls die Schlange leer ist, wird null zurückgegeben.
  */
  public ContentType front(){
    if(isEmpty()){
      return null;
    } else {
      return front.getContent();
    } // end of if-else    
  }
}





