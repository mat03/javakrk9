import org.junit.Test;
import zaj3.Person;
import zaj3.SortPersons;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SortPersonsTest {
    @Test
    public void testMin()  {
        List<Person> persons = new LinkedList<>();

        persons.add(new Person(3L,"za@bgma.com"));
        persons.add(new Person(2L,"bb@bgma.com"));
        persons.add(new Person(1L,"cc@bgma.com"));
        persons.add(new Person(9L,"dd@bgma.com"));
        persons.add(new Person(11L,"ee@bgma.com"));
        try {
            Person minimum = SortPersons.min(persons);
            assertEquals(1L,minimum.getId());
        } catch (Exception e) {

        }
    }

    @Test
    public void testMinNull() {
        try {
            SortPersons.min(null);
            fail();
        }catch (Exception e) {

        }
    }

}
