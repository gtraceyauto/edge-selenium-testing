package ice_stepDefinitions;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class OrclConn {

	private Connection connection;    
	 private String serverName;     
	 private String portNumber;     
	 private String sid;      
	 private String url;      
	 private String username;     
	 private String password;     
	 private Statement stmt;
	 public ResultSet rset;
	
	
}	   
	   
