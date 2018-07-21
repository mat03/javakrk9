package TDD1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class ArrayCommonsTest {

    @Test
    public void testReplaceCorrectArg() {
        Integer[] arr = new Integer[]{2,3,1,0,5};

        try {
            ArrayCommons.replace(arr, 2, 4, -1);
            assertTrue(!arr[0].equals(-1) && arr[2].equals(-1) && arr[3].equals(-1) && arr[4].equals(-1));

            ArrayCommons.replace(new Integer[]{1},0,0,-1);

        } catch (InvalidArgumentException e) {
            fail();
        }
    }

    @Test
    public void testReplaceIncorrectArg() {
        boolean q= false;
        try {
            Integer[] arr = new Integer[] {2,3,45,56,0};
            ArrayCommons.replace(arr, -2,4,-4);
        } catch (InvalidArgumentException e) {
            q = true;
        }
        assertTrue(q);
    }

    @Test(expected = InvalidArgumentException.class) // tylko jedna funkcaj z ta notacja
    public void testReplaceIncorrectArg2() throws InvalidArgumentException {
        ArrayCommons.replace(new Integer[] {2,3,45,56,0}, -4,-5,-3);
    }

    @Test
    public void testReverseSumCorrect() {

        Double[] arr1 = new Double[]{1.0,2.0,3.0,4.4};
        Double[] arr2 = new Double[]{1.1,1.2,1.3,1.0};
        Double[] goodAns = new Double[]{5.4,4.3,3.2,2.1};


        try {
            Double[] res = ArrayCommons.reverseSum(arr1,arr2);
            assertArrayEquals(res,goodAns);
        } catch (InvalidArgumentException e) {
            fail();
        }
    }

    @Test
    public void testReverseSumIncorrectNullArray() {
        try {
            ArrayCommons.reverseSum(null,null);
        } catch (InvalidArgumentException e) {
            return;
        }
        fail();
    }

    @Test(expected = InvalidArgumentException.class)
    public void testReverseSumIncorrectArraysLen() throws InvalidArgumentException {
        ArrayCommons.reverseSum(new Double[]{1.0}, new Double[]{2.0,3.0});
    }

}
