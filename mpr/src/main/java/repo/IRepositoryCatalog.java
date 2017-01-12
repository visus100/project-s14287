package repo;

import java.sql.SQLException;

public interface IRepositoryCatalog {


	
	public IEnumerationValueRepository enumerations();
	public IUserRepository users();
	public IUserRoles userRoles();
	public IRolesPermissions RolesPermissions();
	
	public void saveAndClose() throws SQLException;
	

}
