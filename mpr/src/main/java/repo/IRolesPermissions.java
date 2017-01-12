package repo;

import java.util.List;

import domain.RolesPermissions;

public interface IRolesPermissions extends IRepository<RolesPermissions>{
	public List<RolesPermissions> Permissions(RolesPermissions user);
}
