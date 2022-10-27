import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.09.2022
 * @author 
 */

public class AAAA extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JButton bClickHere = new JButton();
  // Ende Attribute
  
  public AAAA() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("AAAA");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    bClickHere.setBounds(88, 176, 80, 24);
    bClickHere.setText("Click Here!!!!");
    bClickHere.setMargin(new Insets(2, 2, 2, 2));
    bClickHere.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bClickHere_ActionPerformed(evt);
      }
    });
    cp.add(bClickHere);
    jLabel1.setBounds(80, 64, 176, 24);
    jLabel1.setText("");
    cp.add(jLabel1);
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public AAAA
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new AAAA();
  } // end of main
  
  public void bClickHere_ActionPerformed(ActionEvent evt) {
    jLabel1.setText("Luca ist Doof!!!");
    
  } // end of bClickHere_ActionPerformed

  // Ende Methoden
} // end of class AAAA
