package domain;

import java.util.List;

public class RolesPermissions extends Entity {
	private int roleId;
	private int permissionId;
	

	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
	
}
