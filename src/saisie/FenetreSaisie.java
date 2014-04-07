package saisie;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import boutons.GetAction;


public class FenetreSaisie extends JFrame{
	private JTextField textField;
	private JLabel label;
	
	public FenetreSaisie(){
		super();
		
		build();//On initialise notre fen�tre
	}
	
	private void build(){
		setTitle("Fen�tre qui demande du texte"); //On donne un titre � l'application
		setSize(320,240); //On donne une taille � notre fen�tre
		setLocationRelativeTo(null); //On centre la fen�tre sur l'�cran
		setResizable(true); //On permet le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit � l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		textField = new JTextField();
		textField.setColumns(10);
		
		panel.add(textField);
		
		label = new JLabel("Rien pour le moment");
		
		panel.add(label);

		JButton bouton = new JButton(new GetAction(this, "Changer le texte de place"));
		
		panel.add(bouton);
		
		return panel;
	}
	
	public JTextField getTextField(){
		return textField;
	}
	
	public JLabel getLabel(){
		return label;
	}
	
	public static void main(String[] args) {
		//On cr�e une nouvelle instance de notre FenetreTexte
		FenetreSaisie fenetre = new FenetreSaisie();
		fenetre.setVisible(true);//On la rend visible
	}
}