package map;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.RolesPermissions;

public class RolesPermissionsMapper  implements IMaper<RolesPermissions>{

	
	public RolesPermissions map(ResultSet rs) throws SQLException {
		RolesPermissions u = new RolesPermissions();
			u.setId(rs.getInt("id"));

			u.setRoleId(rs.getInt("roleId"));
			u.setPermissionId(rs.getInt("permissionId"));
		return u;
	}
	
}
