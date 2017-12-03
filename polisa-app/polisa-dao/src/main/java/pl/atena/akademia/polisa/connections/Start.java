package pl.atena.akademia.polisa.connections;

import java.sql.Connection;

public class Start {

	public static void main(String[] args) {
		
		DBConnection conn = new DBConnection();
		conn.getConnection();

	}

}
