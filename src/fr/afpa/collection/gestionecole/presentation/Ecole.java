package fr.afpa.collection.gestionecole.presentation;

import java.time.LocalDate;

import fr.afpa.collection.gestionecole.dao.AdresseService;
import fr.afpa.collection.gestionecole.dao.EleveService;
import fr.afpa.collection.gestionecole.dao.SalleService;
import fr.afpa.collection.gestionecole.metier.Adresse;
import fr.afpa.collection.gestionecole.metier.Eleve;
import fr.afpa.collection.gestionecole.metier.Salle;

public class Ecole {
	public static void main(String[] args) {
		AdresseService adresseService = new AdresseService() ;
		// Je cherche une adresse avec son ID
		Adresse myAdresse= adresseService.findById(1) ;
		System.out.println(myAdresse.toString());
		// Je crée une adresse trois fois dans la base de donnée
		Adresse adr = new Adresse (25, "Avenue Hoch", 75008 ,"Paris","France") ;
		adresseService.create(adr) ;
		adresseService.create(adr) ;
		adresseService.create(adr) ;
		// Je stocke cette adresse dans une autre variable
		Adresse adrToDelete = adr ;
		// Je cree une autre adresse
	    adr = new Adresse (33, "Avenue de belleville", 75019 ,"Paris","France") ;
		adresseService.create(adr) ;
		// Afficher toutes les adresses :
		System.out.println(adresseService.findAll());
		// Je met à jour l'adresse à l'ID 4 dans la base :
		adr =  new Adresse (7,15, "Rue d'ARRAS ", 75018 ,"Paris","France") ;
	    adresseService.update(adr) ;
	    // J'affiche la taille de la base de données avec la liste des adresses
		System.out.println("apres l'update ********* Liste des " + adresseService.findAll().size()+" adresses" + adresseService.findAll());
		// Je cherche une adresse dans la base de donnée qui a les valeurs de adrToDelete
		adr = adresseService.findTheAdress(adrToDelete) ;
	/*	// J'efface cette adresse de la base de donnée
		adresseService.delete(adr) ;
		System.out.println("Après delete : ");
		System.out.println("Liste des " + adresseService.findAll().size()+"adresses" + adresseService.findAll());
			
		System.out.println("delete all the adresse : ");
		// Je cherche la liste des adresse dans la base de donnée qui a les valeurs de adrToDelete
			for(Adresse adrr : adresseService.findAllTheAdress(adrToDelete)) {
			 adresseService.delete(adrr) ;
			}
		System.out.println("Après all delete : ");
		System.out.println("Liste des " + adresseService.findAll().size()+"adresses" + adresseService.findAll());
	*/
		SalleService salleService = new SalleService() ;
		// Je cherche une salle avec son ID
		Salle mySalle= salleService.findById(1) ;
		System.out.println(mySalle.toString());
		// Je crée une adresse trois fois dans la base de donnée
		Salle salle = new Salle ("INFO", "Salle Informatique") ;
		// Je stocke cette adresse dans une autre variable
		Salle salleToDelete = salle ;
		salleService.create(salle) ;
		salleService.create(salle) ;
		salleService.create(salle) ;
		// Je cree une autre adresse
		salle = new Salle ("IRIS", "Salle Evrard") ;
		salleService.create(salle) ;
		salle = new Salle ("PHYS", "Salle Physique") ;
		salleService.create(salle) ;
		// Afficher toutes les adresses :
		System.out.println(salleService.findAll());
		// Je met à jour l'adresse à l'ID 4 dans la base :
		salle =  new Salle (2, "FEYNMAN", "ARRAS") ;
	    salleService.update(salle) ;
	    // J'affiche la taille de la base de données avec la liste des adresses
		System.out.println("apres l'update ********* Liste des " + salleService.findAll().size()+" adresses" + salleService.findAll());
		// Je cherche une adresse dans la base de donnée qui a les valeurs de adrToDelete
		Salle salle2 = salleService.findTheSalle(salleToDelete) ;
		// J'efface cette adresse de la base de donnée
		salleService.delete(salle2) ;
		System.out.println("Après delete : ");
		System.out.println("Liste des " + salleService.findAll().size()+"adresses" + salleService.findAll());
			
		System.out.println("delete all the adresse : ");
		// Je cherche la liste des adresse dans la base de donnée qui a les valeurs de adrToDelete
			for(Salle s : salleService.findAllTheSalle(salleToDelete)) {
			 salleService.delete(s) ;
			}
		System.out.println("Après all delete : ");
		System.out.println("Liste des " + salleService.findAll().size()+"adresses" + salleService.findAll());
	
		EleveService eleveService = new EleveService() ;
	
		LocalDate dateNaissance =LocalDate.of(1992, 11, 16) ;
		Adresse adresseEleve = new Adresse (55, "rue des dupont", 92222 ,"Neuilly","France") ;
		System.out.println("adresseEleve : "+ adresseEleve);
		 adresseService.create(adresseEleve) ;
		Adresse theDatabaseAdress = adresseService.findTheAdress(adresseEleve) ;
		System.out.println("theDatabaseAdress : "+ theDatabaseAdress);
		
		Eleve eleve = new Eleve ("Dupont","Valéria", dateNaissance , 33 , theDatabaseAdress ) ;
		// Je stocke cette adresse dans une autre variable
		Eleve EleveToDelete = eleve ;
		eleveService.create(eleve) ;

		// Je cherche un eleve  avec son ID
		dateNaissance =LocalDate.of(2001, 01, 19) ;
		 adresseEleve = new Adresse (16, "rue des Pont", 93333 ,"Neuilly s/ marne","France") ;
		 adresseService.create(adresseEleve) ;
		 theDatabaseAdress = adresseService.findTheAdress(adresseEleve) ;
		eleve = new Eleve ("Durant","Valentin", dateNaissance , 33 , theDatabaseAdress ) ;
		eleveService.create(eleve) ;
		dateNaissance =LocalDate.of(2010, 02, 22) ;
		 adresseEleve = new Adresse (16, "rue de rivoli", 75001 ,"Paris","France") ;
		 adresseService.create(adresseEleve) ;
		 theDatabaseAdress = adresseService.findTheAdress(adresseEleve) ;
		eleve = new Eleve ("Leroi","Mat", dateNaissance , 88 , theDatabaseAdress ) ;
		eleveService.create(eleve) ;
		dateNaissance =LocalDate.of(1999, 9, 29) ;
		 adresseEleve = new Adresse (16, "rue des oliviers", 75009 ,"Paris","France") ;
		 adresseService.create(adresseEleve) ;
		 theDatabaseAdress = adresseService.findTheAdress(adresseEleve) ;
		eleve = new Eleve ("LePetit","Francis", dateNaissance , 23 , theDatabaseAdress ) ;
		eleveService.create(eleve) ;
		
		eleveService.toString() ;
	}

}
