import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.managmenet.Director;
import staff.managmenet.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Paul", 2000, 100000, "Management", 50000);
    }

    @Test
    public void checkDirectorsName(){
        assertEquals("Paul", director.getName());
    }

    @Test
    public void checkDirectorsNiNumber(){
        assertEquals(2000, director.getNiNmunber(),0.01);
    }

    @Test
    public void checkDirectorsSalary(){
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void checkDirectorsDepartment(){
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void checkDirectorsBudget(){
        assertEquals(50000, director.getBudget(), 0.01);
    }

    @Test
    public void giveDirectorPayRise(){
        director.raiseSalary(100);
        assertEquals(100100, director.getSalary(), 0.1);
    }

    @Test
    public void checkCantGiveNegativePayRise(){
        director.raiseSalary(-1000);
        assertEquals(100000, director.getSalary(),0.1);
    }

    @Test
    public void checkCanChangeDirectorsName(){
        director.setName("Paulie");
        assertEquals("Paulie", director.getName());
    }

    @Test
    public void checkCantMakeDirectorsNameNull(){
        director.setName(null);
        assertEquals("Paul", director.getName());
    }

    @Test
    public void payDirectorTwoPercentBonus(){
        assertEquals(2000, director.payBonus(), 0.1);
    }


}
