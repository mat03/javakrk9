import org.junit.Test;
import zaj1.BinarySearch;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class BinarySearchTest {
    @Test
    public void test() {
        int[] tab = {100, 100, 99, 98, 88, 33, 22, 11, 10, 9, 9, 9, 5, 3, 2, 1};

        boolean q = BinarySearch.search(tab,9);
        assertTrue(q);

        boolean k = BinarySearch.search(tab, 111);
        assertFalse(k);
    }
}
