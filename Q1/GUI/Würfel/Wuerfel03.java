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

public class Wuerfel03 extends JFrame {
  // Anfang Attribute
  private JLabel lWuerfel1 = new JLabel();
  private JLabel jAusgabe = new JLabel();
  private JButton bWuerfeln1 = new JButton();
  Random rnd = new Random();
  private JNumberField jEingabe = new JNumberField();
  // Ende Attribute
  
  public Wuerfel03() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 186; 
    int frameHeight = 184;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Wuerfel03");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    jEingabe.setBounds(16, 24, 88, 24);
    jEingabe.setText("Anzahl");
    cp.add(jEingabe);
    bWuerfeln1.setBounds(16, 72, 88, 24);
    bWuerfeln1.setText("Wuerfeln");
    bWuerfeln1.setMargin(new Insets(2, 2, 2, 2));
    bWuerfeln1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWuerfeln1_ActionPerformed(evt);
      }
    });
    cp.add(bWuerfeln1);
    jAusgabe.setBounds(8, 48, 88, 24);
    jAusgabe.setText("Summe:");
    cp.add(jAusgabe);
    lWuerfel1.setBounds(0, 0, 120, 24);
    lWuerfel1.setText("Mehr Wuerfel");
    lWuerfel1.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(lWuerfel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Wuerfel03
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Wuerfel03();
  } // end of main
  
  public void bWuerfeln1_ActionPerformed(ActionEvent evt) {
    // Deklarierung und Initialisierung des Integer Arrays wurf der länge des wertes in jEingabe
    int [] wurf=new int[jEingabe.getInt()]; 
    // Deklarierung und Initialisierung des Integers summe mit wert 0
    int summe=0;              
    // Wiederhole sooft wie wurf lang ist
    for (int i =0;i<wurf.length;i++) {
      // Instanzierung von wurf an Position i mit einem zufälligen wert von 6 bis 1
      wurf[i]=rnd.nextInt(6)+1;
      // wert von wurf in position i wird auf summe addiert.
      summe=summe+wurf[i];
    } // ende von Wiederhole
    // Gebe die geworfene Summe aus
    jAusgabe.setText("Summe: "+Integer.toString(summe));
  } // end of bWuerfeln1_ActionPerformed

  // Ende Methoden
} // end of class Wuerfel01
