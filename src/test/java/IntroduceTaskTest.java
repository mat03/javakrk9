import org.junit.Test;
import zaj1.IntroduceTask;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class IntroduceTaskTest {
    @Test
    public void testGameAlg() {
        assertTrue(IntroduceTask.gameAlg("GD"));
        assertTrue(IntroduceTask.gameAlg("LP"));
        assertFalse(IntroduceTask.gameAlg("LL"));
    }

    @Test
    public void testFib() {
        assertEquals(IntroduceTask.fib(1), 1);
        assertEquals(IntroduceTask.fib(2), 1);
        assertEquals(IntroduceTask.fib(9), 34);
        assertEquals(IntroduceTask.fib(13), 233);
        assertEquals(IntroduceTask.fib(19), 4181);
    }

    @Test
    public void testSolution() {
        assertEquals(IntroduceTask.solution(9), 2);
        assertEquals(IntroduceTask.solution(20), 1);
        assertEquals(IntroduceTask.solution(15), 0);
    }

    @Test
    public void testSpecialMax() {
        Integer[] a = new Integer[]{1, 2, 9};
        Integer[] b = new Integer[]{5};
        Integer[] c = new Integer[]{};
        Integer[] d = new  Integer[] {1,2,2,2,3};

        assertEquals(IntroduceTask.specialMax(a).longValue(), 9);
        assertEquals(IntroduceTask.specialMax(b).longValue(), 5);
        assertEquals(IntroduceTask.specialMax(c), null);
        assertEquals(IntroduceTask.specialMax(d), null);
    }

    @Test
    public void testGetIndex() {
        int[] a = {1,3,4};
        int[] b = {43,23,2,3,4};
        assertEquals(IntroduceTask.getIndex(a),-1);
        assertEquals(IntroduceTask.getIndex(b),2);
    }

    @Test
    public void testMaxDivider() {
        assertEquals(IntroduceTask.maxDivider(6),3);
        assertEquals(IntroduceTask.maxDivider(3),-1);
        assertEquals(IntroduceTask.maxDivider(8),4);
        assertEquals(IntroduceTask.maxDivider(500),250);
    }

    @Test
    public void testMedian() {
        int[] a = {3};
        int[] b ={4, 2};
        int[] c = {10, 1, 8};
        int[] d = {12, 6, 2, 8};

        assertEquals(3, IntroduceTask.median(a));
        assertEquals(3, IntroduceTask.median(b));
        assertEquals(8, IntroduceTask.median(c));
        assertEquals(7, IntroduceTask.median(d));
    }
    @Test
    public void testPalindrome() {
        assertEquals(true, IntroduceTask.palindrome(9));
        assertEquals(true, IntroduceTask.palindrome(21));
        assertEquals(false, IntroduceTask.palindrome(22));
        assertEquals(true, IntroduceTask.palindrome(1));
        assertEquals(true, IntroduceTask.palindrome(3));
        assertEquals(false, IntroduceTask.palindrome(4));

    }
}