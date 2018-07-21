import org.junit.Test;
import zaj4.InsertionSort;

import static junit.framework.TestCase.assertEquals;

public class InsertionSortTest {
    @Test
    public void testInsort() {
        Double[] tab1 = {3.4,1.2,1.1,9.0,0.0};

        InsertionSort.insort(tab1);

        assertEquals(0.0,tab1[0].doubleValue());
        assertEquals(1.1,tab1[1].doubleValue());
        assertEquals(1.2,tab1[2].doubleValue());

        Integer[] tab2 = {0,5,1,4,3,2};

        InsertionSort.insort(tab2);

        assertEquals(0,tab2[0].intValue());
        assertEquals(1,tab2[1].intValue());

        String[] tab3 = {"zz","bb","UsersList","dd"};

        InsertionSort.insort(tab3);

        assertEquals("UsersList",tab3[0]);
        assertEquals("bb",tab3[1]);
    }

    @Test
    public void testQSGeneric() {
        Double[] tab1 = {3.4, 1.2, 1.1, 9.0, 0.0};

        int beg = 0, end = tab1.length -1;

        InsertionSort.qs(tab1 ,beg, end);

        assertEquals(0.0,tab1[0].doubleValue());
        assertEquals(1.1,tab1[1].doubleValue());
        assertEquals(1.2,tab1[2].doubleValue());


    }
}
