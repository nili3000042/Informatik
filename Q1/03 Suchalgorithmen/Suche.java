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
  private JLabel lLineareundBinaereSucheimVergleich = new JLabel();
  private JLabel lMinimaleZahl = new JLabel();
  private JLabel lMaximaleZahl = new JLabel();
  private JLabel lLaengedesArrays = new JLabel();
  private JLabel lGesuchteZahl = new JLabel();
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private JNumberField jNumberField3 = new JNumberField();
  private JNumberField jNumberField4 = new JNumberField();
  private JButton bGeneriereArray = new JButton();
  private JButton bLineareSuche = new JButton();
  private JButton bBinaereSuche = new JButton();
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
    jAusgabe.setBounds(64, 272, 80, 24);
    jAusgabe.setText("");
    cp.add(jAusgabe);
    bBinaereSuche.setBounds(144, 208, 80, 24);
    bBinaereSuche.setText("Binäre Suche");
    bBinaereSuche.setMargin(new Insets(2, 2, 2, 2));
    bBinaereSuche.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBinaereSuche_ActionPerformed(evt);
      }
    });
    cp.add(bBinaereSuche);
    bLineareSuche.setBounds(16, 208, 80, 24);
    bLineareSuche.setText("Lineare Suche");
    bLineareSuche.setMargin(new Insets(2, 2, 2, 2));
    bLineareSuche.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bLineareSuche_ActionPerformed(evt);
      }
    });
    cp.add(bLineareSuche);
    bGeneriereArray.setBounds(80, 176, 80, 24);
    bGeneriereArray.setText("Generiere Array");
    bGeneriereArray.setMargin(new Insets(2, 2, 2, 2));
    bGeneriereArray.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGeneriereArray_ActionPerformed(evt);
      }
    });
    cp.add(bGeneriereArray);
    jNumberField4.setBounds(128, 136, 80, 24);
    jNumberField4.setText("");
    cp.add(jNumberField4);
    jNumberField3.setBounds(128, 112, 80, 24);
    jNumberField3.setText("");
    cp.add(jNumberField3);
    jNumberField2.setBounds(128, 80, 80, 24);
    jNumberField2.setText("");
    cp.add(jNumberField2);
    jNumberField1.setBounds(128, 48, 80, 24);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    lGesuchteZahl.setBounds(32, 144, 352, 24);
    lGesuchteZahl.setText("Gesuchte Zahl:");
    lGesuchteZahl.setHorizontalAlignment(SwingConstants.LEFT);
    cp.add(lGesuchteZahl);
    lLaengedesArrays.setBounds(24, 112, 107, 24);
    lLaengedesArrays.setText("Länge des Arrays:");
    cp.add(lLaengedesArrays);
    lMaximaleZahl.setBounds(16, 80, 89, 24);
    lMaximaleZahl.setText("Maximale Zahl:");
    cp.add(lMaximaleZahl);
    lMinimaleZahl.setBounds(16, 48, 85, 24);
    lMinimaleZahl.setText("Minimale Zahl:");
    cp.add(lMinimaleZahl);
    lLineareundBinaereSucheimVergleich.setBounds(96, 16, 227, 24);
    lLineareundBinaereSucheimVergleich.setText("Lineare und Binäre Suche im Vergleich.");
    cp.add(lLineareundBinaereSucheimVergleich);
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Suche
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Suche();
  } // end of main
  
  public void bGeneriereArray_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bGeneriereArray_ActionPerformed

  public void bLineareSuche_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bLineareSuche_ActionPerformed

  public void bBinaereSuche_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bBinaereSuche_ActionPerformed

  // Ende Methoden
} // end of class Suche
