package mpr.mpr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import domain.EnumerationValue;
import domain.RolesPermissions;
import domain.User;
import domain.UserRoles;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import repo.IRepositoryCatalog;
import repo.RepoCatalog;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * @throws SQLException 
     */
	public void test () throws SQLException{
		
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb" );
		IRepositoryCatalog catalogOf = new RepoCatalog(connection);
		
		User tomek = new User();
		tomek.setLogin("Tomasz");
		tomek.setPassword("Bela");			
		catalogOf.users().add(tomek);
		
		UserRoles test = new UserRoles();
		test.setUserId(1);
		test.setRoleId(1);
		catalogOf.userRoles().add(test);
		
		
		EnumerationValue enu= new EnumerationValue();
		enu.setIntKey(1);
		enu.setStringKey("string");
		enu.setValue("1");
		enu.setEnumerationName("woj-pom");
		catalogOf.enumerations().add(enu);
	
		RolesPermissions perm= new RolesPermissions();
		perm.setRoleId(1);
		perm.setPermissionId(2);
		catalogOf.RolesPermissions().add(perm);
		catalogOf.saveAndClose();
		
	}
	
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
}
