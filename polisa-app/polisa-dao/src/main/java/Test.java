import java.math.BigDecimal;
import java.sql.SQLException;

import org.polisa.domain.Polisa;

import pl.atena.akademia.polisa.connections.DBConnection;

public class Test {

	public static void main(String[] args) throws SQLException {
			
			DBConnection.get();
			Polisa polisa1 = new Polisa(1,"EWA20171203001",BigDecimal.valueOf(100));
			
			PolisaDao dao = new PolisaDao();
			
			dao.create(polisa1);


	}

}
