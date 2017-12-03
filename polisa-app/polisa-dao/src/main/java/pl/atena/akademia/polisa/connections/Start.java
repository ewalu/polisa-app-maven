package pl.atena.akademia.polisa.connections;

import java.math.BigDecimal;
import java.sql.Connection;

import org.polisa.domain.Polisa;

public class Start {

	public static void main(String[] args) {
		
		DBConnection.get();
		//Polisa polisa1 = new Polisa(1,"EWA20171203001",BigDecimal.valueOf(100));

	}

}
