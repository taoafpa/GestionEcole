package fr.afpa.collection.gestionecole.metier;

/*
 * Définir une classe Adresse  avec les attributs suivants: 
 * numRue , nomRue , codePostale, Ville , Pays.

 * */
public class Adresse {
	int idAdresse ;
	int numRue ;
	String nomRue  ; 
	int codePostale ; 
	String ville  ; 
	String pays ;
	
	public Adresse(int idAdresse, int numRue, String nomRue, 
					int codePostale, String ville, String pays) {
		super();
		this.idAdresse = idAdresse;
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codePostale = codePostale;
		this.ville = ville;
		this.pays = pays;
	}

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresse(int numRue, String nomRue, 
					int codePostale, String ville, String pays) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codePostale = codePostale;
		this.ville = ville;
		this.pays = pays;
	}

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public int getCodePostale() {
		return codePostale;
	}


	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codePostale;
		result = prime * result + ((nomRue == null) ? 0 : nomRue.hashCode());
		result = prime * result + numRue;
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (codePostale != other.codePostale)
			return false;
		if (nomRue == null) {
			if (other.nomRue != null)
				return false;
		} else if (!nomRue.equals(other.nomRue))
			return false;
		if (numRue != other.numRue)
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n numRue=" + numRue + ", nomRue=" + nomRue + ", codePostale=" + codePostale + ", ville=" + ville
				+ ", pays=" + pays + "";
	}
	
	
	
	
	
	
}
