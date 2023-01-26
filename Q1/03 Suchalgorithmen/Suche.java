import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * Beschreibung;
Ideen
     Wieviele Schritte Tracken
     Zeit Tracken?
 *
 * @version 1.0 vom 19.01.2023
 * @author 
 */

public class Suche extends JFrame {
  // Anfang Attribute
  private JLabel lLineareundBinaereSucheimVergleich1 = new JLabel();
  private JLabel lMinimaleZahl = new JLabel();
  private JLabel lMaximaleZahl = new JLabel();
  private JLabel lLaengedesArrays1 = new JLabel();
  private JLabel lGesuchteZahl = new JLabel();
  private JNumberField jMinimaleZahl = new JNumberField();
  private JNumberField jMaximaleZahl = new JNumberField();
  private JNumberField jLaengedesArrays = new JNumberField();
  private JNumberField jGesuchteZahl = new JNumberField();
  private JButton bGeneriereArray = new JButton();
  private JButton bLineareSuche = new JButton();
  private JButton bBinaereSuche1 = new JButton();
  private JButton bGeneriereVariablen = new JButton();
  private JLabel jAusgabe = new JLabel();
  // Ende Attribute
  
  public Suche() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 689; 
    int frameHeight = 592;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Suche");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    jAusgabe.setBounds(96, 280, 80, 24);
    jAusgabe.setText("");
    cp.add(jAusgabe);
    bGeneriereVariablen.setBounds(216, 136, 80, 24);
    bGeneriereVariablen.setText("Generiere Variablen");
    bGeneriereVariablen.setMargin(new Insets(2, 2, 2, 2));
    bGeneriereVariablen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGeneriereVariablen_ActionPerformed(evt);
      }
    });
    cp.add(bGeneriereVariablen);
    bBinaereSuche1.setBounds(144, 240, 80, 24);
    bBinaereSuche1.setText("Binaere Suche");
    bBinaereSuche1.setMargin(new Insets(2, 2, 2, 2));
    bBinaereSuche1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBinaereSuche1_ActionPerformed(evt);
      }
    });
    cp.add(bBinaereSuche1);
    bLineareSuche.setBounds(16, 240, 80, 24);
    bLineareSuche.setText("Lineare Suche");
    bLineareSuche.setMargin(new Insets(2, 2, 2, 2));
    bLineareSuche.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bLineareSuche_ActionPerformed(evt);
      }
    });
    cp.add(bLineareSuche);
    bGeneriereArray.setBounds(80, 208, 80, 24);
    bGeneriereArray.setText("Generiere Array");
    bGeneriereArray.setMargin(new Insets(2, 2, 2, 2));
    bGeneriereArray.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGeneriereArray_ActionPerformed(evt);
      }
    });
    cp.add(bGeneriereArray);
    jGesuchteZahl.setBounds(128, 136, 80, 24);
    jGesuchteZahl.setText("");
    cp.add(jGesuchteZahl);
    jLaengedesArrays.setBounds(128, 112, 80, 24);
    jLaengedesArrays.setText("");
    cp.add(jLaengedesArrays);
    jMaximaleZahl.setBounds(128, 80, 80, 24);
    jMaximaleZahl.setText("");
    cp.add(jMaximaleZahl);
    jMinimaleZahl.setBounds(128, 48, 80, 24);
    jMinimaleZahl.setText("");
    cp.add(jMinimaleZahl);
    lGesuchteZahl.setBounds(24, 136, 352, 24);
    lGesuchteZahl.setText("Gesuchte Zahl:");
    lGesuchteZahl.setHorizontalAlignment(SwingConstants.LEFT);
    cp.add(lGesuchteZahl);
    lLaengedesArrays1.setBounds(24, 112, 114, 24);
    lLaengedesArrays1.setText("Laenge des Arrays:");
    cp.add(lLaengedesArrays1);
    lMaximaleZahl.setBounds(16, 80, 89, 24);
    lMaximaleZahl.setText("Maximale Zahl:");
    cp.add(lMaximaleZahl);
    lMinimaleZahl.setBounds(16, 48, 85, 24);
    lMinimaleZahl.setText("Minimale Zahl:");
    cp.add(lMinimaleZahl);
    lLineareundBinaereSucheimVergleich1.setBounds(96, 16, 234, 24);
    lLineareundBinaereSucheimVergleich1.setText("Lineare und Binaere Suche im Vergleich.");
    cp.add(lLineareundBinaereSucheimVergleich1);
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Suche
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Suche();
    int[] list_l = getRandomList(jMinimaleZahl.getInt(),jMaximaleZahl.getInt(),jLaengedesArrays.getInt());;
    int[] list_b = list_l;
  } // end of main
  
  public void bGeneriereArray_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    list_l = getRandomList(jMinimaleZahl.getInt(),jMaximaleZahl.getInt(),jLaengedesArrays.getInt());
    list_b = list_l;
  } // end of bGeneriereArray_ActionPerformed
  
  private static int[] getRandomList(int min, int max, int size) {
        Random random = new Random();
        return random.ints(size, min, max).toArray();
  }
  
  public void bLineareSuche_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int linearPos = linearSearch(jGesuchteZahl.getInt(), list_l);
    if (linearPos >= 0) {
       System.out.println("Gefunden bei: " + linearPos + ". Wert: " + list_l[linearPos]);
    } else {
      System.out.println("Nicht gefunden.");
    }
  } // end of bLineareSuche_ActionPerformed
  
  public static int linearSearch(int search, int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (search == list[i]) {
                return i;
            }
        }
        return -1;
  }
  
  public void bBinaereSuche1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    Arrays.sort(list_b);
    int binaryPos = binarySearch(jGesuchteZahl.getInt(), list_b);
    if (binaryPos >= 0) {
       System.out.println("Gefunden bei: " + binaryPos + ". Wert: " + list_b[binaryPos]);
    } else {
      System.out.println("Nicht gefunden.");
    }
  } // end of bBinaereSuche1_ActionPerformed
  
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
  
  public void bGeneriereVariablen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jMinimaleZahl.setInt(getRandom(0,1000000));
    jMaximaleZahl.setInt(getRandom(jMinimaleZahl.getInt(),1000001));
    jLaengedesArrays.setInt(getRandom(0,1000000));
    jGesuchteZahl.setInt(getRandom(jMinimaleZahl.getInt(),jMaximaleZahl.getInt()));
  } // end of bGeneriereVariablen_ActionPerformed
  
  private static int getRandom(int min, int max) {
        return min + (int) (Math.random() * (max - min));
  }
  // Ende Methoden
} // end of class Suche
