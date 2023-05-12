 

/**
<p> Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
@Version 16.03.2014 
*/

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class AbfahrtslaufControl implements ActionListener{

    private AbfahrtslaufView abfahrtView;
    private Abfahrerliste dieListe;

    public AbfahrtslaufControl() {
        abfahrtView = new AbfahrtslaufView();
        abfahrtView.setVisible(true);
        JButton zielBtn = abfahrtView.getBtnZiel();
        zielBtn.addActionListener(this);
        dieListe=new Abfahrerliste();
    }

  public void actionPerformed(ActionEvent e) {
     if (e.getActionCommand().equals("Am Ziel")){
       String name = abfahrtView.getName();
       String land = abfahrtView.getLand();
       int zeit = Integer.parseInt(abfahrtView.getZeit());
       dieListe.einsortieren(new Abfahrtslaeufer(name, land, zeit));
       this.listeZeigen();
       abfahrtView.setTextfelder("","","");
     }
  }
   

    private void listeZeigen() {
       abfahrtView.setErgebnisListe(dieListe.ausgabe());
	}
	
}