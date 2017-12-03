package pl.atena.akademia.polisa.connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			con = DriverManager.getConnection("jdbc:hsqldb:mydatabase","SA","");
			if (con != null) {
				System.out.println("Sukces");
			} else {
				System.out.println("Błąd");
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return con;
	}

}
