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

public class Wuerfel04 extends JFrame {
  // Anfang Attribute
  private JLabel lWuerfel1 = new JLabel();
  private JLabel jAusgabe = new JLabel();
  private JButton bWuerfeln1 = new JButton();
  Random rnd = new Random();
  private JNumberField jEingabe = new JNumberField();
  // Ende Attribute
  
  public Wuerfel04() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 136; 
    int frameHeight = 165;
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
    lWuerfel1.setBounds(32, 0, 56, 24);
    lWuerfel1.setText("Mehr Wuerfel");
    cp.add(lWuerfel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Wuerfel04
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Wuerfel04();
  } // end of main
  
  public void bWuerfeln1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int [] wurf=new int[jEingabe.getInt()];
    int summe=0;
    for (int i =0;i<wurf.length;i++) {
      wurf[i]=rnd.nextInt(6)+1;
      summe=summe+wurf[i];
    } // end of for
    jAusgabe.setText("Summe: "+Integer.toString(summe));
  } // end of bWuerfeln1_ActionPerformed

  // Ende Methoden
} // end of class Wuerfel01
