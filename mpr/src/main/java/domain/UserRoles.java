package domain;

import java.util.ArrayList;
import java.util.List;

public class UserRoles  extends Entity {

	private int userId;
	private int roleId;
	
	private List<UserRoles> roles;
	
//	public UserRoles() {
//		roles = new ArrayList<UserRoles>();
//	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
//	public List<UserRoles> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(List<UserRoles> roles) {
//		this.roles = roles;
//	}
	
}
