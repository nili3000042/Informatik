
/**
 
<p> Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 * @version 2.1 15.03.2014
 */



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AbfahrtslaufView extends JFrame {

    private JPanel contentPane;
	private JTextField nameEingabe;
	private JTextField landEingabe;
	private JTextField zeitEingabe;
	private JTextArea ergebnisListe;
	private JButton btnZiel;


    /**
     * Constructor for objects of class AbfahrtslaufView
     */
    public AbfahrtslaufView(){
        setTitle("Abfahrtslauf");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNamelabel = new JLabel("Name");
		lblNamelabel.setBounds(10, 16, 84, 14);
		contentPane.add(lblNamelabel);
		
		JLabel lblLandlabel = new JLabel("Land");
		lblLandlabel.setBounds(10, 42, 84, 14);
		contentPane.add(lblLandlabel);
		
		JLabel lblZeitlabel = new JLabel("Zeit (in Sek)");
		lblZeitlabel.setBounds(10, 67, 84, 14);
		contentPane.add(lblZeitlabel);
		
		nameEingabe = new JTextField();
		nameEingabe.setBounds(104, 11, 86, 20);
		contentPane.add(nameEingabe);
		nameEingabe.setColumns(10);
		
		landEingabe = new JTextField();
		landEingabe.setBounds(104, 36, 86, 20);
		contentPane.add(landEingabe);
		landEingabe.setColumns(10);

		zeitEingabe = new JTextField();
		zeitEingabe.setBounds(104, 61, 86, 20);
		contentPane.add(zeitEingabe);
		zeitEingabe.setColumns(10);

		btnZiel = new JButton("Am Ziel");
		btnZiel.setBounds(104, 89, 86, 25);
		contentPane.add(btnZiel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(211, 11, 221, 226);
		contentPane.add(scrollPane);
		ergebnisListe = new JTextArea();
		scrollPane.setViewportView(ergebnisListe);
	}

    public String getName(){
        return nameEingabe.getText();
    }
    
    public String getLand(){
        return landEingabe.getText();
    }
    
    public String getZeit(){
        return zeitEingabe.getText();
    }
    
     public void setTextfelder(String name, String land, String zeit){
        nameEingabe.setText(name);
        landEingabe.setText(land);
        zeitEingabe.setText(zeit);
    }
    
    public void setErgebnisListe(String rangfolge){
        ergebnisListe.setText(rangfolge);
    }
    
    public JButton getBtnZiel(){
        return btnZiel;
    }
}