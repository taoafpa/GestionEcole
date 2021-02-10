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
	// Adresse 
	private int numero;
	private String rue;
	private int codePostale;
	private String ville;
	private String pays;
	private JTextField numeroRue;
	private JTextField nomRue;
	private JTextField codeP;
	private JTextField nomVille;
	private JTextField nomPays;

	
	


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
		
		
	
		
		JLabel lblNewLabel_30 = new JLabel("Numero");
		GridBagConstraints gbc_lblNewLabel_30 = new GridBagConstraints();
		gbc_lblNewLabel_30.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_30.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_30.gridx = 0;
		gbc_lblNewLabel_30.gridy = 6;
		frame.getContentPane().add(lblNewLabel_30, gbc_lblNewLabel_30);
		
		numeroRue = new JTextField();
		GridBagConstraints gbc_numrue = new GridBagConstraints();
		gbc_numrue.gridwidth = 2;
		gbc_numrue.insets = new Insets(0, 0, 5, 0);
		gbc_numrue.fill = GridBagConstraints.HORIZONTAL;
		gbc_numrue.gridx = 1;
		gbc_numrue.gridy = 6;
		frame.getContentPane().add(numeroRue, gbc_numrue);
		numeroRue.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Rue");
		GridBagConstraints gbc_lblNewLabel_31 = new GridBagConstraints();
		gbc_lblNewLabel_31.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_31.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_31.gridx = 0;
		gbc_lblNewLabel_31.gridy = 7;
		frame.getContentPane().add(lblNewLabel_31, gbc_lblNewLabel_31);
		
		nomRue = new JTextField();
		GridBagConstraints gbc_rue = new GridBagConstraints();
		gbc_rue.gridwidth = 2;
		gbc_rue.insets = new Insets(0, 0, 5, 0);
		gbc_rue.fill = GridBagConstraints.HORIZONTAL;
		gbc_rue.gridx = 1;
		gbc_rue.gridy = 7;
		frame.getContentPane().add(nomRue, gbc_rue);
		nomRue.setColumns(10);
	
		JLabel  lblNewLabel_32 = new JLabel("Code Postale");
		GridBagConstraints gbc_lblNewLabel_32 = new GridBagConstraints();
		gbc_lblNewLabel_32.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_32.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_32.gridx = 0;
		gbc_lblNewLabel_32.gridy = 8;
		frame.getContentPane().add(lblNewLabel_32, gbc_lblNewLabel_32);

		codeP = new JTextField();
		GridBagConstraints gbc_codePostale = new GridBagConstraints();
		gbc_codePostale.gridwidth = 2;
		gbc_codePostale.insets = new Insets(0, 0, 5, 0);
		gbc_codePostale.fill = GridBagConstraints.HORIZONTAL;
		gbc_codePostale.gridx = 1;
		gbc_codePostale.gridy = 8;
		frame.getContentPane().add(codeP, gbc_codePostale);
		codeP.setColumns(10);
		
		
		JLabel lblNewLabel_33 = new JLabel("Ville");
		GridBagConstraints gbc_lblNewLabel_33 = new GridBagConstraints();
		gbc_lblNewLabel_33.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_33.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_33.gridx = 0;
		gbc_lblNewLabel_33.gridy = 9;
		frame.getContentPane().add(lblNewLabel_33, gbc_lblNewLabel_33);
		
		nomVille = new JTextField();
		GridBagConstraints gbc_ville = new GridBagConstraints();
		gbc_ville.gridwidth = 2;
		gbc_ville.insets = new Insets(0, 0, 5, 0);
		gbc_ville.fill = GridBagConstraints.HORIZONTAL;
		gbc_ville.gridx = 1;
		gbc_ville.gridy = 9;
		frame.getContentPane().add(nomVille, gbc_ville);
		nomVille.setColumns(10);
		
		
		JLabel  lblNewLabel_34 = new JLabel("Pays");
		GridBagConstraints gbc_lblNewLabel_34 = new GridBagConstraints();
		gbc_lblNewLabel_34.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_34.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_34.gridx = 0;
		gbc_lblNewLabel_34.gridy = 10;
		frame.getContentPane().add(lblNewLabel_34, gbc_lblNewLabel_34);
		
		nomPays = new JTextField();
		GridBagConstraints gbc_pays = new GridBagConstraints();
		gbc_pays.gridwidth = 2;
		gbc_pays.insets = new Insets(0, 0, 5, 0);
		gbc_pays.fill = GridBagConstraints.HORIZONTAL;
		gbc_pays.gridx = 1;
		gbc_pays.gridy = 10;
		frame.getContentPane().add(nomPays, gbc_pays);
		nomPays.setColumns(10);
		
		
		
		btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 11;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		btnNewButton_1 = new JButton("Valider");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				nom = inputNom.getText();
				
				prenom = inputPrenom.getText();
			//date de naissance
				jour = Integer.parseInt(jourNaissance.getText());  
				mois = Integer.parseInt(moisNaissance.getText());  
				annee = Integer.parseInt(anneeNaissance.getText());  
				// adresse

				numero = Integer.parseInt(numeroRue.getText());  
				rue = nomRue.getText();  
				codePostale = Integer.parseInt(codeP.getText());  
				ville = nomVille.getText();  
				pays = nomPays.getText();  

				
				EleveService eleveService = new EleveService() ;
				AdresseService adresseService = new AdresseService() ;
				
				LocalDate dateNaissance =LocalDate.of(annee, mois, jour) ;
				
			
				Adresse adresseEleve = new Adresse (numero, rue, codePostale ,ville,pays) ;
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
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 11;
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
