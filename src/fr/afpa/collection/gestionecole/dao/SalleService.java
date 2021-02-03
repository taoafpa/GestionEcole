package fr.afpa.collection.gestionecole.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.afpa.collection.gestionecole.metier.Salle;


/*
 * Créer la classe SalleService qui implémente l'interface IDao. 
 * Dans cette classe 
 * les données seront stockés dans une collection de type List.
 * */
public class SalleService implements IDao<Salle> {

	public List<Salle> salles = new ArrayList<Salle>() ;

	public int findIdByName(String name) {
		for(Salle s: salles) {
			if(s.getLibelle()== name) {
				return s.getId() ;
			}
		}
		return 0;
	}
	
	public Salle findByName(String name) {
		for(Salle s: salles) {
			if(s.getLibelle()== name) {
				return s;
			}
		}
		return null;
	}
	
	public void afficheListeSalles() {
	for(Salle s : salles) {
		System.out.println(s);
	}
	}
	
	
	public boolean create(Salle e) {
		try {
		String sql = "Insert into Salle (CODE, LIBELLE)"
				+ "Values (?,?)";
		 // Get Connection
	    Connection connection = ConnectionUtils.getMyConnection();

		 // Create a PreparedStatement object.
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        // Set value for the first parameter (First '?')
 
        pstm.setString(1, e.getCode());
        pstm.setString(2, e.getLibelle());
     
        System.out.println("Create OK "+pstm.executeUpdate());
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
		return true;
	}


	@Override
	public boolean delete(Salle salle) {
		try {
			String sql = "DELETE FROM salle where  SALLE_ID= ?";
			 // Get Connection
		    Connection connection = ConnectionUtils.getMyConnection();

			 // Create a PreparedStatement object.
	        PreparedStatement pstm = connection.prepareStatement(sql);
	        
	        // Set value for the first parameter (First '?')
	        System.out.println(salle);
	        pstm.setInt(1, salle.getId());
	        System.out.println("Delete OK "+ pstm.executeUpdate());
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
			}
			return true;
	}

	@Override
	public boolean update(Salle ad) {
		try {
			String sql = "UPDATE SALLE SET CODE=? ,LIBELLE=?  where SALLE_ID=?";;
			 // Get Connection
		    Connection connection = ConnectionUtils.getMyConnection();
			 // Create a PreparedStatement object.
	        PreparedStatement pstm = connection.prepareStatement(sql);
	        // Set value for the first parameter (First '?')

	        pstm.setString(1, ad.getCode());
	        pstm.setString(2, ad.getLibelle());
	        pstm.setInt(3, ad.getId());
	        System.out.println("Update OK "+ pstm.executeUpdate());
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
			}
			return true;
	}


	
	@Override
	public Salle findById(int id) {
		Salle result = new Salle();
		try {
		
			String sql = "select  SALLE_ID ,CODE, LIBELLE from salle  where SALLE_ID = ? ";
			 // Get Connection
		    Connection connection = ConnectionUtils.getMyConnection();

			 // Create a PreparedStatement object.
	        PreparedStatement pstm = connection.prepareStatement(sql);
	        
	        // Set value for the first parameter (First '?')
	        pstm.setInt(1, id);
	        
	        ResultSet rs = pstm.executeQuery();
	        while (rs.next()) {
	        	int idSalle = rs.getInt(1);
	            String code = rs.getString(2);
	            String libelle = rs.getString(3);
	    	 result = new Salle( idSalle,code, libelle) ;
	        }
	       
	        System.out.println("Update OK "+rs.getRow());
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
			}
			return result;
	}

	public Salle findTheSalle(Salle salle) {
		for(Salle s: findAll()) {
			if(s.equals(salle)) {
				return s;
			}
		}
		return null;
	}
	
	public List<Salle> findAllTheSalle(Salle adr) {
		List<Salle> result = new ArrayList<Salle>() ;
		for(Salle e: findAll()) {
			if(e.equals(adr)) {
				result.add(e) ;
			}
		}
		return result;
	}
	
	@Override
	public List<Salle> findAll() {
		List<Salle> result = new ArrayList<Salle>() ;
		 // Get Connection
        Connection connection;
		try {
			connection = ConnectionUtils.getMyConnection();
     
        Statement statement = connection.createStatement();
        String sql = "Select SALLE_ID, CODE, LIBELLE from SALLE";
        // Execute SQL statement returns a ResultSet object.
        ResultSet rs = statement.executeQuery(sql);
        // Fetch on the ResultSet        
        // Move the cursor to the next record.
        while (rs.next()) {
        	Salle a = new Salle(rs.getInt(1), rs.getString(2), rs.getString(3)) ;
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
		return "listeAdresses= ";
	}
	
	
	
	

}
