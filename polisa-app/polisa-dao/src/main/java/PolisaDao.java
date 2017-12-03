import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.polisa.domain.Polisa;
import org.polisa.domain.PolisaFiltr;

import pl.atena.akademia.polisa.connections.DBConnection;

public class PolisaDao {
	
	public boolean create (Polisa polisa) throws SQLException {
		
		Connection conn = DBConnection.get();
		PreparedStatement ps = conn.prepareStatement(
				"INSERT INTO POLISA(ID, NR_POLISY,D_PODPISANIA,D_ROZPOCZENCIA,D_ZAKONCZENIA,SKLADKA) values (?,?,?,?,?,?)");
		ps.setInt(1, polisa.getId());
		ps.setString(2, polisa.getNrPolisy());
		ps.setDate(3, java.sql.Date.valueOf(polisa.getdPodpisania()));
		ps.setDate(4, java.sql.Date.valueOf(polisa.getdRozpoczecia()));
		ps.setDate(5, java.sql.Date.valueOf(polisa.getdZakoczenia()));
		ps.setBigDecimal(6, polisa.getSkladka());
		
		int row = ps.executeUpdate();
		return row > 0 ? true:false;
		
	}
	
	public boolean update (Polisa polisa) {
		
		return true;
		
	}
	
	public boolean delete (Integer id) {
		
		return true;
		
	}
	
	public List<Polisa> select(PolisaFiltr filtr){
		return null;
	}

}
