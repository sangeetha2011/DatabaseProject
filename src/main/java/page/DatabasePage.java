package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabasePage {
	
	
	public static String getData(String columname) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlUrl = "jdbc:mysql://localhost:3306/jan2021";
		String sqlUserName = "root";
		String sqlPassword = "root";
		String query = "select * from users";
		//creating connection to your local database
		Connection con = DriverManager.getConnection(sqlUrl, sqlUserName, sqlPassword);
		//Empowering the con ref variable to execute queries
		Statement smt = con.createStatement();
		//Excecuting query
		ResultSet rs = smt.executeQuery(query);
		while(rs.next()) {
			return rs.getString(columname);
		}
		return columname;
		
	}

}
