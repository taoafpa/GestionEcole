package fr.afpa.collection.gestionecole.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fr.afpa.collection.gestionecole.metier.Eleve;
import fr.afpa.collection.gestionecole.metier.Salle;

public class EleveService implements IDao<Eleve> {

	Map<Integer , Eleve> listeEleves = new HashMap<Integer , Eleve>() ;
	
	@Override
	public boolean create(Eleve e) {
		 listeEleves.put(e.getId(), e) ;
		return true;
	}

	@Override
	public boolean delete(Eleve o) {
		return listeEleves.remove(o.getId(), o);
	}

	@Override
	public boolean update(Eleve e) {
		listeEleves.put(e.getId(), e);
		return false;
	}

	@Override
	public Eleve findById(int id) {
		listeEleves.get(id);
		return null;
	}


	public Eleve findByFirstName(String fn) {
		for(Eleve e: findAll()) {
			if(e.getPrenom()== fn) {
				return e;
			}
		}
		return null;
	}
	
	
	@Override
	public List<Eleve> findAll() {
		return listeEleves.values().stream().collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "listeEleves=" + listeEleves + "]";
	}
	
	
	

}
