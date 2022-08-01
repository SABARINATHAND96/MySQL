package mySQL;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ConnectionCreationSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection JDBCconnection=DriverManager.getConnection("jdbc:mysql://root@localhost/avengers");
		//("jdbc:mysql://localhost:3306/avengers","root","root1");
		
		
		java.sql.Statement statement=JDBCconnection.createStatement();
		
		ResultSet result=statement.executeQuery("SELECT * FROM superheroes");
		
		while(result.next())
		{
			System.out.println("Nick Name: "+result.getString(1)+" Power Name: "+result.getString(2));
		}
		
	}

}
