
/**
 * Beschreiben Sie hier die Klasse CharTree.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class CharTree
{
   
    BinaryTree<Character> b1;
    /**
     * Konstruktor für Objekte der Klasse CharTree
     */
    public CharTree()
    {
       BinaryTree<Character> b7 = new BinaryTree<Character>(10, null, null);
       BinaryTree<Character> b5 = new BinaryTree<Character>(7, null, null);
       BinaryTree<Character> b2 = new BinaryTree<Character>(3, null, null);
       BinaryTree<Character> b6 = new BinaryTree<Character>(11, b7, null);
       BinaryTree<Character> b4 = new BinaryTree<Character>(6, b5, null);
       BinaryTree<Character> b3 = new BinaryTree<Character>(9, b6, b4);
       b1 = new BinaryTree<Character>(, b2, b3);
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
    
    public void besuchePreorderAusgabe(BinaryTree<Character> b)
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
    
    public void besucheInorderAusgabe(BinaryTree<Character> b)
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
     public void besuchePostorderAusgabe(BinaryTree<Character> b)
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
