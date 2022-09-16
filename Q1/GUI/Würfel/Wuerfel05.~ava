import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.09.2022
 * @author 
 */

public class Wuerfel05 extends JFrame {
  // Anfang Attribute
  private JLabel lWuerfel1 = new JLabel();
  private JLabel jAusgabe = new JLabel();
  private JButton bWuerfeln1 = new JButton();
  Random rnd = new Random();
  private JNumberField jEingabe = new JNumberField();
  private JNumberField jNumberField1 = new JNumberField();
  private JLabel lAugenzahl1 = new JLabel();
  private JLabel jLabel1 = new JLabel();
  private JLabel lAnzahl = new JLabel();
  private JLabel lSeitenanzahl = new JLabel();
  // Ende Attribute
  
  public Wuerfel05() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 473; 
    int frameHeight = 396;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Wuerfel05");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    lSeitenanzahl.setBounds(104, 128, 81, 25);
    lSeitenanzahl.setText("Seitenanzahl:");
    cp.add(lSeitenanzahl);
    lAnzahl.setBounds(136, 80, 49, 25);
    lAnzahl.setText("Anzahl:");
    cp.add(lAnzahl);
    jLabel1.setBounds(8, 232, 384, 24);
    jLabel1.setText("");
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(jLabel1);
    jNumberField1.setBounds(192, 128, 88, 24);
    jNumberField1.setText("6");
    cp.add(jNumberField1);
    jEingabe.setBounds(192, 80, 88, 24);
    jEingabe.setText("2");
    cp.add(jEingabe);
    bWuerfeln1.setBounds(144, 280, 88, 24);
    bWuerfeln1.setText("Wuerfeln");
    bWuerfeln1.setMargin(new Insets(2, 2, 2, 2));
    bWuerfeln1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWuerfeln1_ActionPerformed(evt);
      }
    });
    cp.add(bWuerfeln1);
    jAusgabe.setBounds(8, 168, 384, 24);
    jAusgabe.setHorizontalAlignment(SwingConstants.CENTER);
    jAusgabe.setHorizontalTextPosition(SwingConstants.CENTER);
    jAusgabe.setText("Deine Summe:");
    cp.add(jAusgabe);
    lWuerfel1.setBounds(88, 24, 200, 24);
    lWuerfel1.setText("Mehr Wuerfel");
    cp.add(lWuerfel1);
    lAugenzahl1.setBounds(8, 200, 384, 24);
    lAugenzahl1.setText("Summe des Computers:");
    lAugenzahl1.setHorizontalAlignment(SwingConstants.CENTER);
    lAugenzahl1.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(lAugenzahl1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Wuerfel05
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Wuerfel05();
  } // end of main
  
  public void bWuerfeln1_ActionPerformed(ActionEvent evt) {  
    // Deklarierung und Initialisierung des Integer Arrays wurf der länge des wertes in jEingabe
    int [] wurf=new int[jEingabe.getInt()];  
    // Deklarierung und Initialisierung des Integer Arrays wurf_C der länge des wertes in jEingabe
    int [] wurf_C=new int[jEingabe.getInt()]; 
    // Deklarierung und Initialisierung des Integers summe mit wert 0
    int summe=0;   
    // Deklarierung und Initialisierung des Integers summe_C mit wert 0
    int summe_C=0;
    // Wiederhole sooft wie wurf lang ist
    for (int i =0;i<wurf.length;i++) {
      // Instanzierung von wurf an Position i mit einem zufälligen wert zwischen 1 und dem wert in jNumberfield1
      wurf[i]=rnd.nextInt(jNumberField1.getInt())+1;
      // wert von wurf in position i wird auf summe addiert.
      summe=summe+wurf[i];
    } // ende von Wiederhole
    // Wiederhole sooft wie wurf_C lang ist
    for (int i =0;i<wurf_C.length;i++) {
      // Instanzierung von wurf_C an Position i mit einem zufälligen wert zwischen 1 und dem wert in jNumberfield1
      wurf_C[i]=rnd.nextInt(jNumberField1.getInt())+1;
      // wert von wurf_C in position i wird auf summe_C addiert.
      summe_C=summe_C+wurf_C[i];
    } // ende von Wiederhole
    // Gebe die geworfene Summe aus
    jAusgabe.setText("Deine Summe: "+Integer.toString(summe));
    // Gebe die geworfene Summe_C aus
    lAugenzahl1.setText("Summe des Computers: "+Integer.toString(summe_C));
    // Wenn summe größer ist als summe_C
    if (summe>summe_C) {
      // Gebe Du hast Gewonnen!! aus
      jLabel1.setText("Du hast Gewonnen!!");
    } else if (summe_C>summe) { // ansonsten wenn summe_C Größer ist als summe
      // Gebe Der Computer hat Gewonnen HAHA aus  
      jLabel1.setText("Der Computer hat Gewonnen HAHA");
    } else {   // ansonsten
      // Gebe Gleichstand aus  
      jLabel1.setText("Gleichstand");
    }  // end of if-else
  } // end of bWuerfeln1_ActionPerformed

  // Ende Methoden
} // end of class Wuerfel01
