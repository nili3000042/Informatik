
/**
 * Beschreiben Sie hier die Klasse Ahnenbaum.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ahnenbaum
{
   private BinaryTree<Ahne> timsAhnenbaum;

    /**
     * Konstruktor für Objekte der Klasse Ahnenbaum
     */
    public Ahnenbaum()
    {
       Ahne rudolph = new Ahne ("Rudolph", "Moormann", 'm');
       Ahne freia = new Ahne ("Freia", "Moormann", 'w');
       Ahne tim = new Ahne ("Tim", "Moormann", 'm');
       Ahne patrick = new Ahne ("Patrick", "Simon", 'm');
       Ahne silke = new Ahne ("Silke", "Moormann", 'w');
       
       // ergänze siehe Buch S. 190f
       
       // Ergänze siehe Buch
       
       BinaryTree<Ahne> b8 = new BinaryTree(freia, null, null);
       BinaryTree<Ahne> b7 = new BinaryTree(rudolph, null, null);
       BinaryTree<Ahne> b3 = new BinaryTree(silke, b7, b8);
       BinaryTree<Ahne> b6 = new BinaryTree(patrick, null, null);
       timsAhnenbaum = new BinaryTree<Ahne>(tim,b3,b6);
    }

    /**
     * 
     */
    public void preorderAusgabe()
    {
       besuchePreorderAusgabe (timsAhnenbaum);
    }
    
    public void inorderAusgabe()
    {
        besucheInorderAusgabe (timsAhnenbaum);
    }
    
     public void postorderAusgabe()
    {
        besuchePostorderAusgabe (timsAhnenbaum);
    }
    
    public void besuchePreorderAusgabe(BinaryTree<Ahne> b)
    {
       if(b.getContent()!=null)
       {
           System.out.print(b.getContent().getVorname());
           System.out.print(" ");
           System.out.print(b.getContent().getNachname());
           System.out.print(" ");
           System.out.println(b.getContent().getGeschlecht());
           
           
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
    
    public void besucheInorderAusgabe(BinaryTree<Ahne> b)
    {
        
         if(b.getLeftTree()!=null)
        {
            besucheInorderAusgabe(b.getLeftTree());
        }
         if(b.getContent()!=null)
       {
           System.out.print(b.getContent().getVorname());
           System.out.print(" ");
           System.out.print(b.getContent().getNachname());
           System.out.print(" ");
           System.out.println(b.getContent().getGeschlecht());
           
           
        }
        if(b.getRightTree()!=null)
        {
            besucheInorderAusgabe(b.getRightTree());
        }
         
    }
     public void besuchePostorderAusgabe(BinaryTree<Ahne> b)
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
           System.out.print(b.getContent().getVorname());
           System.out.print(" ");
           System.out.print(b.getContent().getNachname());
           System.out.print(" ");
           System.out.println(b.getContent().getGeschlecht());
           
           
        }
        
               
    }
}
