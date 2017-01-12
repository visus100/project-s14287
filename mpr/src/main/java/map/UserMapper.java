package map;

import java.sql.ResultSet;
import java.sql.SQLException;


import domain.User;

public class UserMapper implements IMaper<User>{

	
	public User map(ResultSet rs) throws SQLException {
		User u = new User();
			u.setId(rs.getInt("id"));
			u.setLogin(rs.getString("login"));
			u.setPassword(rs.getString("password"));
		return u;
	}
	
}
