import org.junit.Test;
import zaj3.Sort;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class SortTest {
    @Test
    public void testSort() {
        char[] t = {'a','f','f','a','c','b'};
        Sort.sortChars(t);
        char[]correct = {'a','a','b','c','f','f'};

        for(int i = 0; i < t.length; ++i){
            assertEquals(t[i],correct[i]);
        }
    }

    @Test
    public void testSortChars() {
        char[] test = {'f','e','c','b','b','a','b','e'};
        Sort.sortChars(test);

        for(int i = 0; i < test.length -1; ++i) {
            int asciFirst = (int)test[i];
            int asciSecond = (int)test[i+1];

            if (asciFirst > asciSecond) {
                fail();
            }
        }
    }
}
