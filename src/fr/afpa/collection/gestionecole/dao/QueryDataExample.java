package fr.afpa.collection.gestionecole.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
public class QueryDataExample {
 
    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
 
        // Get Connection
        Connection connection = ConnectionUtils.getMyConnection();
 
        // Create statement
        Statement statement = connection.createStatement();
 
      // create
        String sql = "Insert into ADRESSE (NUM_RUE, NOM_RUE, CODE_POSTALE,VILLE,PAYS )Values ('23','Rue Des Oliviers','60800','Valois','France')";
 
        // Execute SQL statement returns a ResultSet object.
        statement.executeUpdate(sql);
       // String sql = "Select Emp_Id, Emp_No, Emp_Name from Employee";
        // create
        String sqlRead = "select ADRESSE_ID, NUM_RUE, NOM_RUE, CODE_POSTALE,VILLE,PAYS from adresse";
 
        // Execute SQL statement returns a ResultSet object.
      ResultSet rs= statement.executeQuery(sqlRead);
 
        while (rs.next()) {
            int adresseId = rs.getInt(1);
            int numRue = rs.getInt(2);
            String nomRue = rs.getString(3);
            int codePostale = rs.getInt(4);
            String ville = rs.getString(5);
            String pays = rs.getString("PAYS");
            System.out.println("--------------------");
            System.out.println("adresseId:" + adresseId);
            System.out.println("numRue:" + numRue);
            System.out.println("nomRue:" + nomRue);
            System.out.println("codePostale:" + codePostale);
            System.out.println("ville:" + ville);
            System.out.println("pays:" + pays);
        }
        // update
        
   sql = "UPDATE  ADRESSE SET NOM_RUE='Rue Victor Hugo' where ADRESSE_ID='2'";
   statement.executeUpdate(sql);
   
   
   sql = "DELETE FROM adresse where ADRESSE_ID='1'";
   statement.executeUpdate(sql);
   
        // Fetch on the ResultSet        
        // Move the cursor to the next record.
    /*    while (rs.next()) {
            int empId = rs.getInt(1);
            String empNo = rs.getString(2);
            String empName = rs.getString("Emp_Name");
            System.out.println("--------------------");
            System.out.println("EmpId:" + empId);
            System.out.println("EmpNo:" + empNo);
            System.out.println("EmpName:" + empName);
        }*/
 
        // Close connection.
   
   // Execute SQL statement returns a ResultSet object.
 rs= statement.executeQuery(sqlRead);

     while (rs.next()) {
         int adresseId = rs.getInt(1);
         int numRue = rs.getInt(2);
         String nomRue = rs.getString(3);
         int codePostale = rs.getInt(4);
         String ville = rs.getString(5);
         String pays = rs.getString("PAYS");
         System.out.println("--------------------");
         System.out.println("adresseId:" + adresseId);
         System.out.println("numRue:" + numRue);
         System.out.println("nomRue:" + nomRue);
         System.out.println("codePostale:" + codePostale);
         System.out.println("ville:" + ville);
         System.out.println("pays:" + pays);
     }
     // update
   
   
   
        connection.close();
    }
 
}
