
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener
{
    int zähler = 0;
    JLabel text = new JLabel ("Anzahl an KLicks : 0");
    JFrame inhalt = new JFrame ();
    
    public GUI () //Konstruktor
    {
        //Der Button
        JButton knopf = new JButton ("Drück mich!");
        knopf.addActionListener(this);
        
        
        //Fenster Inhalt mit Knopf und Text
        JPanel fenster = new JPanel();
        fenster.add(knopf);
        fenster.add(text);
        
        //Rand und sonstige Einstellungen
        inhalt.add(fenster, BorderLayout.CENTER);
        inhalt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inhalt.setTitle("Mein erstes GUI");
        inhalt.pack();
        inhalt.setVisible(true);
        
    }
    
    
    //Knopf programmieren
    public void actionPerformed(ActionEvent e)
    {
        zähler++;
        text.setText("Anzahl der Klicks : " + zähler);
        
    }
    
    //Fenster aufrufen
    public static void main(String[] args)
    {
        new GUI();
    }
}


