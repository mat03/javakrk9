package TDD1;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmployeeManagerTest {
    private EmployeeServices employeeServices = new EmployeeServiceImpl();

    @BeforeClass //wykona sie tylko 1 raz przed wykonaniemwszystkich metod testowych
    public static void setUpBeforeClass() {
        System.out.println("before");
    }

    @Before // wykona sie przed kazdym razem przed wykonaniem metody testowej
    public void setUpBefore() {
        //System.out.println("before");
        //tutaj najczesciej znajduje sie przygotowaniedo testow
        employeeServices.add(new Employee(1L, "Kowalsk", 1.0));
        employeeServices.add(new Employee(2L, "Nowak", 2.2));
        employeeServices.add(new Employee(3L, "Gondek", 3.3));
    }

    @After //wykonuje sie zawsze po kazdym wywolaniu metody testowej
    public void setUpAfter() {
        System.out.println("after");
        //najczesciej nastepuje sprzatnie suwanie plikow zamykaniepolaczen
    }

    @AfterClass // wykonuje sie zawsze tylko raz po
    public static void setUpAfterClass() {
        System.out.println("after");
    }

    //@Ignore taki test bedzie  pomijany

    // test jedostkowynie nie powinien wplywac na testy jednostkowe inne

    @Test
    public void testAddEmployee() {
        //wspulny fragment

    }

    @Test
    public void testRemoveEmployee() {
        //wspuly fragment
        employeeServices.remove(4L);
        assertEquals(3,employeeServices.count());

        employeeServices.remove(2L);
        assertFalse(employeeServices.exists(new Employee(2L, "Nowak", 2.2)));

    }

    @Test
    public void testExistEmployee() {
        assertTrue(employeeServices.exists(new Employee(1L, "Kowalsk", 1.0)));

        assertFalse(employeeServices.exists(new Employee(55L, "Kolasa", 2.2)));

    }

    @Test
    public void testCountEmployee() {
        assertEquals(3,employeeServices.count());
        employeeServices.remove(1L);
        assertEquals(2,employeeServices.count());
        employeeServices.remove(2L);
        assertEquals(1,employeeServices.count());
        employeeServices.remove(3L);
        assertEquals(0,employeeServices.count());
    }

}
