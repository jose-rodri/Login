package Cn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {

static{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}

	public Connection getConectar(){
		
		Connection cn = null;
		try {
			
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","123456");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return cn;
		
	}
	
	
}
