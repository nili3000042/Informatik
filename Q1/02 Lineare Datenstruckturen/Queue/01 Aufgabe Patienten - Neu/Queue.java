public class Queue<ContentType> 
{
    private QueueNode<ContentType> head;
    private QueueNode<ContentType> tail;
    private int Length = 0;

    public Queue() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(ContentType pContent) {
        if (pContent != null) {
            QueueNode newNode = new QueueNode(pContent);
            Length++;
            if (this.isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.setNext(newNode);
                tail = newNode;
            }
        }
    }

    public void dequeue() {
        if (!this.isEmpty()) {
            head = head.getNext();
            Length--;
            if (this.isEmpty()) {
                head = null;
                tail = null;
            }
        }
    }

    public ContentType front() {
        if (this.isEmpty()) {
            return null;
        } else {
            return head.getContent();
        }
    }
    
    public int getLength() {
        return Length;
    }
}