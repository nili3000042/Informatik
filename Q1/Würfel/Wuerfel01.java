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

public class Wuerfel01 extends JFrame {
  // Anfang Attribute
  private JLabel lWuerfel1 = new JLabel();
  private JLabel jAusgabe = new JLabel();
  private JButton bWuerfeln1 = new JButton();
  Random rnd = new Random();
  // Ende Attribute
  
  public Wuerfel01() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 136; 
    int frameHeight = 155;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Wuerfel01");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
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
    jAusgabe.setText("Augenzahl:");
    cp.add(jAusgabe);
    lWuerfel1.setBounds(32, 0, 56, 24);
    lWuerfel1.setText("Wuerfel");
    cp.add(lWuerfel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Wuerfel01
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Wuerfel01();
  } // end of main
  
  public void bWuerfeln1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int wurf=rnd.nextInt(6)+1;
    jAusgabe.setText("Augenzahl: "+Integer.toString(wurf));
  } // end of bWuerfeln1_ActionPerformed

  // Ende Methoden
} // end of class Wuerfel01
