
/**
 * Beschreiben Sie hier die Klasse INTree.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class INTree
{
   
    BinaryTree<Integer> b1;
    /**
     * Konstruktor für Objekte der Klasse INTree
     */
    public INTree()
    {
       BinaryTree<Integer> b7 = new BinaryTree<Integer>(10, null, null);
       BinaryTree<Integer> b5 = new BinaryTree<Integer>(7, null, null);
       BinaryTree<Integer> b2 = new BinaryTree(3, null, null);
       BinaryTree<Integer> b6 = new BinaryTree<Integer>(11, b7, null);
       BinaryTree<Integer> b4 = new BinaryTree<Integer>(6, b5, null);
       BinaryTree<Integer> b3 = new BinaryTree<Integer>(9, b6, b4);
       b1 = new BinaryTree(5, b2, b3);
       // ergänze siehe Buch S. 190f
       
       
       // Ergänze siehe Buch
       
       
       
       
       
       
       
    }

    /**
     * 
     */
    public void preorderAusgabe()
    {
       besuchePreorderAusgabe (b1);
    }
    
    public void inorderAusgabe()
    {
        besucheInorderAusgabe (b1);
    }
    
     public void postorderAusgabe()
    {
        besuchePostorderAusgabe (b1);
    }
    
    public void besuchePreorderAusgabe(BinaryTree<Integer> b)
    {
       if(b.getContent()!=null)
       {
           
           System.out.print(" ");
           System.out.println(b.getContent());
           
           
        }
        if(b.getLeftTree()!=null)
        {
            besuchePreorderAusgabe(b.getLeftTree());
        }
        if(b.getRightTree()!=null)
        {
            besuchePreorderAusgabe(b.getRightTree());
        }
    }
    
    public void besucheInorderAusgabe(BinaryTree<Integer> b)
    {
        
         if(b.getLeftTree()!=null)
        {
            besucheInorderAusgabe(b.getLeftTree());
        }
         if(b.getContent()!=null)
       {
           System.out.print(" ");
           System.out.print(b.getContent());
           
           
           
           
        }
        if(b.getRightTree()!=null)
        {
            besucheInorderAusgabe(b.getRightTree());
        }
         
    }
     public void besuchePostorderAusgabe(BinaryTree<Integer> b)
    {
         if(b.getLeftTree()!=null)
        {
            besucheInorderAusgabe(b.getLeftTree());
        }
        if(b.getRightTree()!=null)
        {
            besuchePostorderAusgabe(b.getRightTree());
        }
         if(b.getContent()!=null)
       {
           
           System.out.print(" ");
           System.out.print(b.getContent());
           
           
           
        }
        
               
    }
}
