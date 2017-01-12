package mpr.mpr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import domain.EnumerationValue;
import domain.RolesPermissions;
import domain.User;
import domain.UserRoles;
import repo.IRepositoryCatalog;
import repo.RepoCatalog;

public class App 
{
	

	
    public static void main( String[] args )
    {

       	try {

       		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb" );
    		IRepositoryCatalog catalogOf = new RepoCatalog(connection);
    		
    		//example of add new user
//    		User tomek = new User();
//    		tomek.setLogin("fest");
//    		tomek.setPassword("best");			
//			catalogOf.users().add(tomek);
//			catalogOf.saveAndClose();
			
		
			//example of delete user
		//	User tomek = new User();
		//	janek.setId(3);
		//	catalogOf.users().delete(tomek);
		//	catalogOf.saveAndClose();
			
			//example of update user
	//		User tomek = new User();	
	 //		janek.setId(1);
	//		janek.setLogin("new login");
	//		janek.setPassword("new pass");		
	//		catalogOf.users().update(tomek);
	//		catalogOf.saveAndClose();
				
    		//example of read users	
//			for(User u: catalogOf.users().getAll())
//			{
//				System.out.println(u.getLogin());
//			}
//			catalogOf.saveAndClose();
    		
			//exampe of user roles add
//    		UserRoles test = new UserRoles();
    	//	test.setId(1);
//    		test.setUserId(1);
//    		test.setRoleId(2);
//    		catalogOf.userRoles().add(test);
//			catalogOf.saveAndClose();
    		
			//example of read specyfic users	
			
//			User b =  catalogOf.users().get(1);
//			System.out.println(b.getLogin());
//			catalogOf.saveAndClose();
//			
//			example of enumeration value add
			
//			EnumerationValue enu= new EnumerationValue();
//			enu.setValue("level 2");
//			enu.setEnumerationName("Admin");
//			catalogOf.enumerations().add(enu);
//			catalogOf.saveAndClose();
//			
//			example of permission add
			
//			RolesPermissions perm= new RolesPermissions();
//			perm.setRoleId(1);
//			perm.setPermissionId(2);
//			catalogOf.RolesPermissions().add(perm);
//			catalogOf.saveAndClose();
			
			
       		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
    }
}
