public class QueueNode<ContentType>
{
    
    private ContentType content = null;
    private QueueNode<ContentType> nextNode = null;
    
    public QueueNode(ContentType pContent) {
        content = pContent;
        nextNode = null;
    }
    
    public void setNext(QueueNode pNext) {
        nextNode = pNext;
    }
    
    public  QueueNode getNext() {
        return nextNode;
    }
    
    public ContentType getContent() {
        return content;
    }
}