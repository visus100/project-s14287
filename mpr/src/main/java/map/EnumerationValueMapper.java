package map;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.EnumerationValue;

public class EnumerationValueMapper implements IMaper<EnumerationValue>{
	
	public EnumerationValue map(ResultSet rs) throws SQLException {
		EnumerationValue u = new EnumerationValue();
			u.setId(rs.getInt("id"));
			u.setIntKey(rs.getInt("intKey"));
			u.setStringKey(rs.getString("StringKey"));
			u.setValue(rs.getString("evalue"));
			u.setEnumerationName(rs.getString("enumerationName"));
		return u;
	}
}
