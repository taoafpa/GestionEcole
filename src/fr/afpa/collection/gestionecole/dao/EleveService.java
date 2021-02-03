package fr.afpa.collection.gestionecole.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import fr.afpa.collection.gestionecole.metier.Adresse;
import fr.afpa.collection.gestionecole.metier.Eleve;


public class EleveService implements IDao<Eleve> {

	//Map<Integer , Eleve> listeEleves = new HashMap<Integer , Eleve>() ;
	
	@Override
	public Eleve findById(int id) {

		Eleve result = new Eleve();
		try {
			String sql = "select ELEVE_ID ,NOM, PRENOM, DATE_NAISSANCE,AGE ,ID_ADRESSE from eleve  where  ELEVE_ID = ? ";
			 // Get Connection
		    Connection connection = ConnectionUtils.getMyConnection();

			 // Create a PreparedStatement object.
	        PreparedStatement pstm = connection.prepareStatement(sql);
	        
	        // Set value for the first parameter (First '?')
	        pstm.setInt(1, id);
	        
	        ResultSet rs = pstm.executeQuery();
	        while (rs.next()) {
	        	int idEleve = rs.getInt(1);
	            String nom = rs.getString(2);
	            String prenom = rs.getString(3);	            
	            LocalDate dateNaissance =  rs.getDate(4).toLocalDate();
	            int age = rs.getInt(5);
	            int idAdresse = rs.getInt(6);
	        AdresseService adresseService = new AdresseService() ;
	  		// Je cherche une adresse avec son ID
	    	System.out.println("idAdresse pour creation eleve "+idAdresse);
	  		Adresse adresse= adresseService.findById(idAdresse) ;
	  		System.out.println("adresse pour creation eleve "+adresse);
	    	 result = new Eleve( idEleve,nom, prenom,dateNaissance, age,adresse ) ;
	        }
	       
	        System.out.println("Update OK "+rs.getRow());
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
			}
			return result;
	}


	@Override
	public boolean create(Eleve e) {
		try {
		String sql = "Insert into ELEVE (NOM, PRENOM, DATE_NAISSANCE,AGE,ID_ADRESSE )"
				+ "Values (?,?,?,?,?)";
		 // Get Connection
	    Connection connection = ConnectionUtils.getMyConnection();
		 // Create a PreparedStatement object.
        PreparedStatement pstm = connection.prepareStatement(sql);
        // Set value for the first parameter (First '?')
        pstm.setString(1, e.getNom());
        pstm.setString(2, e.getPrenom());
        
        pstm.setDate(3, convertToDateViaSqlDate( e.getDateNaissance()));
     
        pstm.setInt(4, e.getAge());
        pstm.setInt(5, e.getAdresse().getIdAdresse());  
        
        System.out.println("Create OK "+pstm.executeUpdate());
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
	public Date convertToDateViaSqlDate(LocalDate dateToConvert) {
	    return java.sql.Date.valueOf(dateToConvert);
	}

	
	
	

	


	@Override
	public boolean delete(Eleve o) {
		return true ;
	}

	@Override
	public boolean update(Eleve e) {
		
		return false;
	}


	public Eleve findByFirstName(String fn) {
		System.out.println(fn);
		for(Eleve e: findAll()) {
			System.out.println(	e.getPrenom());
			if(e.getPrenom().equalsIgnoreCase(fn)) {
				
				System.out.println("J'ai  trouvé l'eleve");
				return e;
			}
		}
		System.out.println("J'ai pas trouvé l'eleve");
		return null;
	}
	
	
	@Override
	public List<Eleve> findAll() {

		List<Eleve> result = new ArrayList<Eleve>() ;
		 // Get Connection
        Connection connection;
		try {
		connection = ConnectionUtils.getMyConnection();
        Statement statement = connection.createStatement();
        String sql = "Select ELEVE_ID, NOM, PRENOM,DATE_NAISSANCE, AGE, ID_ADRESSE from eleve";
        // Execute SQL statement returns a ResultSet object.
        ResultSet rs = statement.executeQuery(sql);
        // Fetch on the ResultSet        
        // Move the cursor to the next record.
        while (rs.next()) {
        	AdresseService myAdresseService = new AdresseService() ;
        Adresse adresse = myAdresseService.findById(rs.getInt(6)) ;
        	Eleve a = new Eleve(rs.getInt(1), rs.getString(2), rs.getString(3) , rs.getDate(4).toLocalDate() ,rs.getInt(5),adresse) ;
            result.add(a) ;
        }
 
        // Close connection.
        connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result ;
	}

	
	
	@Override
	public String toString() {
		return "listeEleves=" + findAll() ;
	}
	
	
	

}
