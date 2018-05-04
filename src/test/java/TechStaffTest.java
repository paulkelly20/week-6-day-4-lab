import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.managmenet.Manager;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TechStaffTest {

    Employee developer;
    Employee databaseadmin;

    @Before
    public void before (){

        developer = new Developer("Paul", 1000, 50000);
        databaseadmin = new DatabaseAdmin("Hadsan", 10011, 100000);

    }

    @Test

    public void testEmployeeHasName(){
        assertEquals("Paul", developer.getName());
        assertEquals("Hadsan", databaseadmin.getName());
    }

    @Test

    public void testEmployeeHasNiNumber(){
        assertEquals(1000, developer.getNiNmunber());
        assertEquals(10011, databaseadmin.getNiNmunber());
    }

    @Test

    public void testEmployeeHasSalary(){
        assertEquals(50000, developer.getSalary(), 0.1);
        assertEquals(100000, databaseadmin.getSalary(), 0.1);
    }


    @Test
    public void testRaiseSalary(){
        developer.raiseSalary(200);
       databaseadmin.raiseSalary(200);
        assertEquals(50200, developer.getSalary(), 0.01);
        assertEquals(100200, databaseadmin.getSalary(), 0.01);
    }
    @Test

    public void testBonus(){
        assertEquals(500, developer.payBonus(), 0.01);
        assertEquals(1000, databaseadmin.payBonus(), 0.01);
    }
}
