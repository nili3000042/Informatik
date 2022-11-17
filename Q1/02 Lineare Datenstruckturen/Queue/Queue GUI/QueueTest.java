import java.awt.*;
import java.awt.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.02.2019
 * @author 
 */

public class QueueTest extends Frame {
  // Anfang Attribute
  private Button btNeu = new Button();
  private Button btEnqueue = new Button();
  private Button btDequeue = new Button();
  private Button btIsEmpty = new Button();
  private TextField textField1 = new TextField();
  private Button btFront = new Button();
  private Label labelEingabe = new Label();
  private TextField tfEingabe = new TextField();
  private Label labelAusgabe = new Label();
  private TextField tfAusgabe = new TextField();
  
  //Verweis auf die Klasse Queue
  private Queue<String> schlange;
  // Ende Attribute
  
  public QueueTest() { 
    // Frame-Initialisierung
    super();
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 468; 
    int frameHeight = 406;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("QueueTest");
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    btNeu.setBounds(24, 96, 57, 33);
    btNeu.setLabel("Neu");
    btNeu.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btNeu_ActionPerformed(evt);
      }
    });
    cp.add(btNeu);
    btEnqueue.setBounds(96, 96, 57, 33);
    btEnqueue.setLabel("Enqueue");
    btEnqueue.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btEnqueue_ActionPerformed(evt);
      }
    });
    cp.add(btEnqueue);
    btDequeue.setBounds(24, 144, 57, 33);
    btDequeue.setLabel("Dequeue");
    btDequeue.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btDequeue_ActionPerformed(evt);
      }
    });
    cp.add(btDequeue);
    btIsEmpty.setBounds(96, 144, 57, 33);
    btIsEmpty.setLabel("isEmpty");
    btIsEmpty.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btIsEmpty_ActionPerformed(evt);
      }
    });
    cp.add(btIsEmpty);
    textField1.setBounds(128, 80, 105, 1);
    cp.add(textField1);
    btFront.setBounds(24, 192, 57, 33);
    btFront.setLabel("Front");
    btFront.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btFront_ActionPerformed(evt);
      }
    });
    cp.add(btFront);
    labelEingabe.setBounds(32, 32, 65, 33);
    labelEingabe.setText("Eingabe:");
    cp.add(labelEingabe);
    tfEingabe.setBounds(104, 32, 201, 41);
    cp.add(tfEingabe);
    labelAusgabe.setBounds(24, 248, 73, 33);
    labelAusgabe.setText("Ausgabe");
    cp.add(labelAusgabe);
    tfAusgabe.setBounds(112, 248, 193, 41);
    cp.add(tfAusgabe);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public QueueTest
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new QueueTest();
  } // end of main
  
  public void btNeu_ActionPerformed(ActionEvent evt) {
    schlange = new Queue<>();
    
  } // end of btNeu_ActionPerformed

  public void btEnqueue_ActionPerformed(ActionEvent evt) {
    schlange.enqueue(tfEingabe.getText());
    
  } // end of btEnqueue_ActionPerformed

  public void btDequeue_ActionPerformed(ActionEvent evt) {
    schlange.dequeue();
    
  } // end of btDequeue_ActionPerformed

  public void btIsEmpty_ActionPerformed(ActionEvent evt) {
       labelAusgabe.setText(""+schlange.isEmpty());      
  } // end of btIsEmpty_ActionPerformed
  
  public void btFront_ActionPerformed(ActionEvent evt) {
       labelAusgabe.setText(schlange.front());          
  } // end of btFront_ActionPerformed

  // Ende Methoden
} // end of class QueueTest

