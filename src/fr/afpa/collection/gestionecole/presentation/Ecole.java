package fr.afpa.collection.gestionecole.presentation;

import fr.afpa.collection.gestionecole.dao.AdresseService;
import fr.afpa.collection.gestionecole.metier.Adresse;


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
		// J'efface cette adresse de la base de donnée
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
	}

}
