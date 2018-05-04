import org.junit.Before;
import org.junit.Test;
import staff.managmenet.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before (){

        manager = new Manager("Paul", 10, 5000, "IT");

    }

    @Test

    public void testEmployeeHasName(){
        assertEquals("Paul", manager.getName());
    }

    @Test

    public void testEmployeeHasNiNumber(){
        assertEquals(10, manager.getNiNmunber());
    }

    @Test

    public void testEmployeeHasSalary(){
        assertEquals(5000, manager.getSalary(), 0.1);
    }

    @Test
    public void testDepartment(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void testRaiseSalary(){
        manager.raiseSalary(200);
        assertEquals(5200, manager.getSalary(), 0.01);
    }
    @Test

    public void testBonus(){
        assertEquals(50, manager.payBonus(), 0.01);
    }
}
