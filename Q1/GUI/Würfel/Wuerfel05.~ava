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
    setTitle("Wuerfel03");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    jLabel1.setBounds(8, 232, 384, 24);
    jLabel1.setText("");
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(jLabel1);
    jNumberField1.setBounds(144, 128, 88, 24);
    jNumberField1.setText("Seitenanzahl");
    cp.add(jNumberField1);
    jEingabe.setBounds(144, 80, 88, 24);
    jEingabe.setText("Anzahl");
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
    jAusgabe.setText("Summe:");
    cp.add(jAusgabe);
    lWuerfel1.setBounds(88, 24, 200, 24);
    lWuerfel1.setText("Mehr Wuerfel");
    cp.add(lWuerfel1);
    lAugenzahl1.setBounds(8, 200, 384, 24);
    lAugenzahl1.setText("Summe:");
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
    // TODO hier Quelltext einfügen
    int [] wurf=new int[jEingabe.getInt()];
    int summe=0;
    for (int i =0;i<wurf.length;i++) {
      wurf[i]=rnd.nextInt(jNumberField1.getInt())+1;
      summe=summe+wurf[i];
    } // end of for
    jAusgabe.setText("Summe: "+Integer.toString(summe));
  } // end of bWuerfeln1_ActionPerformed

  // Ende Methoden
} // end of class Wuerfel01
