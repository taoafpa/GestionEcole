package fr.afpa.collection.gestionecole.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * @author KESKES Taoufik
 * Cette class nous permet d'appeler une connection Oracle ou MySQL
 */
public class MySQLConnUtils {
	
	
 
   // Connect to MySQL
   public static Connection getMySQLConnection() throws SQLException,
           ClassNotFoundException {
       String hostName = "localhost";
       String dbName = "ecolesup";
       String userName = "root";
       String password = "root";
       String paramConn = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
       return getMySQLConnection(hostName, dbName, userName, password, paramConn);
   }
 
   public static Connection getMySQLConnection(String hostName, String dbName,
           String userName, String password ,String paramConn) throws SQLException,
           ClassNotFoundException {
 
       String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName+paramConn ;
       Connection conn = DriverManager.getConnection(connectionURL, userName, password);
       return conn;
   }
}
