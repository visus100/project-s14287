package map;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;
import domain.UserRoles;

public class UserRolesMapper implements IMaper<UserRoles>{

	
	public UserRoles map(ResultSet rs) throws SQLException {
		UserRoles u = new UserRoles();
			u.setId(rs.getInt("id"));
			u.setUserId(rs.getInt("UserId"));
			u.setRoleId(rs.getInt("RoleId"));
		return u;
	}
	
}
