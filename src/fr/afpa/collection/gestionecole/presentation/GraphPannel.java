package fr.afpa.collection.gestionecole.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import fr.afpa.collection.gestionecole.dao.AdresseService;
import fr.afpa.collection.gestionecole.dao.EleveService;
import fr.afpa.collection.gestionecole.metier.Adresse;
import fr.afpa.collection.gestionecole.metier.Eleve;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GraphPannel {
	private JFrame frame;
	private JFrame frame2;
	
	// nom et prenom
	private String nom;
	private String prenom;
	private JTextField inputNom;
	private JTextField inputPrenom;
	
	
	
	// date de naissance
	private int jour;
	private int mois;
	private int annee;
	private JTextField jourNaissance;
	private JTextField moisNaissance;
	private JTextField anneeNaissance;
	
	private JLabel lblNewLabel_3;
	private JTextField adresse;
	private JLabel lblNewLabel_4;
	private JComboBox selectSalle;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_5;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					GraphPannel window = new GraphPannel();
					window.frame.setVisible(true);
					
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GraphPannel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 317);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel_5 = new JLabel("Création d'élève");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridwidth = 3;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 0;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Nom");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		inputNom = new JTextField();
		
		GridBagConstraints gbc_inputNom = new GridBagConstraints();
		gbc_inputNom.gridwidth = 2;
		gbc_inputNom.insets = new Insets(0, 0, 5, 0);
		gbc_inputNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_inputNom.gridx = 1;
		gbc_inputNom.gridy = 1;
		frame.getContentPane().add(inputNom, gbc_inputNom);
		inputNom.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Prénom");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		inputPrenom = new JTextField();
		
		GridBagConstraints gbc_inputPrenom = new GridBagConstraints();
		gbc_inputPrenom.gridwidth = 2;
		gbc_inputPrenom.insets = new Insets(0, 0, 5, 0);
		gbc_inputPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_inputPrenom.gridx = 1;
		gbc_inputPrenom.gridy = 2;
		frame.getContentPane().add(inputPrenom, gbc_inputPrenom);
		inputPrenom.setColumns(10);
		
	
		JLabel lblNewLabel_21 = new JLabel("Jour");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 0;
		gbc_lblNewLabel_21.gridy = 3;
		frame.getContentPane().add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		jourNaissance = new JTextField();
		GridBagConstraints gbc_jourNaissance = new GridBagConstraints();
		gbc_jourNaissance.gridwidth = 2;
		gbc_jourNaissance.insets = new Insets(0, 0, 5, 0);
		gbc_jourNaissance.fill = GridBagConstraints.HORIZONTAL;
		gbc_jourNaissance.gridx = 1;
		gbc_jourNaissance.gridy = 3;
		frame.getContentPane().add(jourNaissance, gbc_jourNaissance);
		jourNaissance.setColumns(3);
		
		JLabel lblNewLabel_22 = new JLabel("mois");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 0;
		gbc_lblNewLabel_22.gridy = 4;
		frame.getContentPane().add(lblNewLabel_22, gbc_lblNewLabel_22);
		
		moisNaissance = new JTextField();
		GridBagConstraints gbc_moisNaissance = new GridBagConstraints();
		gbc_moisNaissance.gridwidth = 2;
		gbc_moisNaissance.insets = new Insets(0, 0, 5, 0);
		gbc_moisNaissance.fill = GridBagConstraints.HORIZONTAL;
		gbc_moisNaissance.gridx = 1;
		gbc_moisNaissance.gridy = 4;
		frame.getContentPane().add(moisNaissance, gbc_moisNaissance);
		moisNaissance.setColumns(3);
		
		JLabel lblNewLabel_23 = new JLabel("année");
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_23.gridx = 0;
		gbc_lblNewLabel_23.gridy = 5;
		frame.getContentPane().add(lblNewLabel_23, gbc_lblNewLabel_23);
		
		anneeNaissance = new JTextField();
		GridBagConstraints gbc_anneeNaissance = new GridBagConstraints();
		gbc_anneeNaissance.gridwidth = 2;
		gbc_anneeNaissance.insets = new Insets(0, 0, 5, 0);
		gbc_anneeNaissance.fill = GridBagConstraints.HORIZONTAL;
		gbc_anneeNaissance.gridx = 1;
		gbc_anneeNaissance.gridy = 5;
		frame.getContentPane().add(anneeNaissance, gbc_anneeNaissance);
		anneeNaissance.setColumns(3);
		
		lblNewLabel_3 = new JLabel("Adresse");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 6;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		adresse = new JTextField();
		GridBagConstraints gbc_adresse = new GridBagConstraints();
		gbc_adresse.gridwidth = 2;
		gbc_adresse.insets = new Insets(0, 0, 5, 0);
		gbc_adresse.fill = GridBagConstraints.HORIZONTAL;
		gbc_adresse.gridx = 1;
		gbc_adresse.gridy = 6;
		frame.getContentPane().add(adresse, gbc_adresse);
		adresse.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Salle");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 7;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		selectSalle = new JComboBox();
		GridBagConstraints gbc_selectSalle = new GridBagConstraints();
		gbc_selectSalle.gridwidth = 2;
		gbc_selectSalle.insets = new Insets(0, 0, 5, 0);
		gbc_selectSalle.fill = GridBagConstraints.HORIZONTAL;
		gbc_selectSalle.gridx = 1;
		gbc_selectSalle.gridy = 7;
		frame.getContentPane().add(selectSalle, gbc_selectSalle);
		
		btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 8;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		btnNewButton_1 = new JButton("Valider");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				nom = inputNom.getText();
				
				prenom = inputPrenom.getText();
			
				jour = Integer.parseInt(jourNaissance.getText());  
				mois = Integer.parseInt(moisNaissance.getText());  
				annee = Integer.parseInt(anneeNaissance.getText());  
				
	
				
				EleveService eleveService = new EleveService() ;
				AdresseService adresseService = new AdresseService() ;
				
				LocalDate dateNaissance =LocalDate.of(annee, mois, jour) ;
				Adresse adresseEleve = new Adresse (55, "rue des dupont", 92222 ,"Neuilly","France") ;
				System.out.println("adresseEleve : "+ adresseEleve);
				 adresseService.create(adresseEleve) ;
				Adresse theDatabaseAdress = adresseService.findTheAdress(adresseEleve) ;
				System.out.println("theDatabaseAdress : "+ theDatabaseAdress);
				
				Eleve eleve = new Eleve (nom,prenom, dateNaissance , 33 , theDatabaseAdress ) ;
				// Je stocke cette adresse dans une autre variable
				Eleve EleveToDelete = eleve ;
				eleveService.create(eleve) ;
				
				
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 9;
		frame.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Crétion de salle");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
	}

}
