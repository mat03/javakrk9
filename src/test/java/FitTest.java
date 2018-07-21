import org.junit.Test;
import zaj4.Fib;

import static junit.framework.TestCase.assertEquals;

public class FitTest {
    @Test
    public void testGetFib() {
        assertEquals(0,Fib.getFib(0));
        assertEquals(1,Fib.getFib(1));
        assertEquals(1,Fib.getFib(2));
        assertEquals(2,Fib.getFib(3));
        assertEquals(4181,Fib.getFib(19));
    }
}
