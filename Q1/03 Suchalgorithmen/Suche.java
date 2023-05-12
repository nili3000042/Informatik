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
  private JLabel lMinimaleZahl1 = new JLabel();
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
  int[] list_l;
  int[] list_b;
  private JTextArea jAusgabe = new JTextArea("");
    private JScrollPane jAusgabeScrollPane = new JScrollPane(jAusgabe);
  // Ende Attribute
  
  public Suche() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1217; 
    int frameHeight = 891;
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
    jAusgabeScrollPane.setBounds(192, 528, 248, 80);
    jAusgabe.setEditable(false);
    cp.add(jAusgabeScrollPane);
    bGeneriereVariablen.setBounds(0, 360, 176, 24);
    bGeneriereVariablen.setText("Generiere Variablen");
    bGeneriereVariablen.setMargin(new Insets(2, 2, 2, 2));
    bGeneriereVariablen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGeneriereVariablen_ActionPerformed(evt);
      }
    });
    cp.add(bGeneriereVariablen);
    bBinaereSuche1.setBounds(500, 480, 120, 24);
    bBinaereSuche1.setText("Binaere Suche");
    bBinaereSuche1.setMargin(new Insets(2, 2, 2, 2));
    bBinaereSuche1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBinaereSuche1_ActionPerformed(evt);
      }
    });
    cp.add(bBinaereSuche1);
    bLineareSuche.setBounds(0, 472, 120, 24);
    bLineareSuche.setText("Lineare Suche");
    bLineareSuche.setMargin(new Insets(2, 2, 2, 2));
    bLineareSuche.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bLineareSuche_ActionPerformed(evt);
      }
    });
    cp.add(bLineareSuche);
    bGeneriereArray.setBounds(0, 392, 184, 24);
    bGeneriereArray.setText("Generiere Array");
    bGeneriereArray.setMargin(new Insets(2, 2, 2, 2));
    bGeneriereArray.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGeneriereArray_ActionPerformed(evt);
      }
    });
    cp.add(bGeneriereArray);
    jGesuchteZahl.setBounds(500, 312, 80, 24);
    jGesuchteZahl.setText("");
    cp.add(jGesuchteZahl);
    jLaengedesArrays.setBounds(500, 288, 80, 24);
    jLaengedesArrays.setText("");
    cp.add(jLaengedesArrays);
    jMaximaleZahl.setBounds(500, 256, 80, 24);
    jMaximaleZahl.setText("");
    cp.add(jMaximaleZahl);
    jMinimaleZahl.setBounds(500, 110, 500, 50);
    jMinimaleZahl.setText("");
    jMinimaleZahl.setFont(new Font("Dialog", Font.PLAIN, 30));
    cp.add(jMinimaleZahl);
    lGesuchteZahl.setBounds(0, 320, 88, 24);
    lGesuchteZahl.setText("Gesuchte Zahl:");
    lGesuchteZahl.setHorizontalAlignment(SwingConstants.LEFT);
    cp.add(lGesuchteZahl);
    lLaengedesArrays1.setBounds(0, 288, 90, 24);
    lLaengedesArrays1.setText("Laenge des Arrays:");
    cp.add(lLaengedesArrays1);
    lMaximaleZahl.setBounds(0, 256, 89, 24);
    lMaximaleZahl.setText("Maximale Zahl:");
    cp.add(lMaximaleZahl);
    lMinimaleZahl1.setBounds(0, 110, 500, 50);
    lMinimaleZahl1.setText("Minimale Zahl:  ");
    lMinimaleZahl1.setFont(new Font("Dialog", Font.BOLD, 30));
    cp.add(lMinimaleZahl1);
    lLineareundBinaereSucheimVergleich1.setBounds(0, 0, 1000, 100);
    lLineareundBinaereSucheimVergleich1.setText("Lineare und Binaere Suche im Vergleich.");
    lLineareundBinaereSucheimVergleich1.setHorizontalTextPosition(SwingConstants.CENTER);
    lLineareundBinaereSucheimVergleich1.setHorizontalAlignment(SwingConstants.CENTER);
    lLineareundBinaereSucheimVergleich1.setFont(new Font("Dialog", Font.BOLD, 55));
    cp.add(lLineareundBinaereSucheimVergleich1);
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Suche
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Suche();
  } // end of main
  
  public void bGeneriereArray_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    if (!(jMinimaleZahl.isNumeric())) {
      jAusgabe.setText("Minimale Zahl fehlt.");
    } else if (!(jMaximaleZahl.isNumeric())) {
        jAusgabe.setText("Maximale Zahl fehlt.");       
      } else if (!(jLaengedesArrays.isNumeric())) {
          jAusgabe.setText("Laenge des Arrays fehlt.");       
        } else if (!(jGesuchteZahl.isNumeric())) {
            jAusgabe.setText("Gesuchte Zahl fehlt.");       
          } else if (jGesuchteZahl.getInt()<jMinimaleZahl.getInt()) {
              jAusgabe.setText("Gesuchte Zahl ist zu klein.");       
            } else if (jGesuchteZahl.getInt()>jMaximaleZahl.getInt()) {
                jAusgabe.setText("Gesuchte Zahl ist zu groß.");  
              } else {
                list_l = getRandomList(jMinimaleZahl.getInt(),jMaximaleZahl.getInt(),jLaengedesArrays.getInt());
                list_b = list_l;
                jAusgabe.setText("Array Generiert.");
                
                int linearPos = linearSearch(jGesuchteZahl.getInt(), list_l);
                if (linearPos >= 0) {
                  jAusgabe.append("\n"+"Gefunden bei: " + linearPos + ". Wert: " + list_l[linearPos]);
                } else {
                  jAusgabe.append("\n"+"Nicht gefunden.");
                }
                
                Arrays.sort(list_b);
                int binaryPos = binarySearch(jGesuchteZahl.getInt(), list_b);
                if (binaryPos >= 0) {
                  jAusgabe.append("\n"+"Gefunden bei: " + binaryPos + ". Wert: " + list_b[binaryPos]);
                } else {
                  jAusgabe.append("\n"+"Nicht gefunden.");
                }
              } // end of if-else{
  } // end of bGeneriereArray_ActionPerformed
  
  private static int[] getRandomList(int min, int max, int size) {
    Random random = new Random();
    return random.ints(size, min, max).toArray();
  }
  
  public void bLineareSuche_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
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
    jMinimaleZahl.setInt(getRandom(0,100000));
    jMaximaleZahl.setInt(getRandom(jMinimaleZahl.getInt(),1000000));
    jLaengedesArrays.setInt(getRandom(0,1000000));
    jGesuchteZahl.setInt(getRandom(jMinimaleZahl.getInt(),jMaximaleZahl.getInt()));
  } // end of bGeneriereVariablen_ActionPerformed
  
  private static int getRandom(int min, int max) {
    return min + (int) (Math.random() * (max - min));
  }
  // Ende Methoden
} // end of class Suche
