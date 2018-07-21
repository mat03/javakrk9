package TDD1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MathHelperTest {
    @Test
    public void testSum() {

        assertEquals(new Double(2.0) ,MathHelper.sum(new Double(1.0), new Double(1.0)));
    }

    @Test
    public void testMult() {
        assertEquals(new Double(1.0), MathHelper.mult(new Double(1.0), new Double(1.0)));
    }

    @Test
    public  void testDiv() {
        try {
            assertEquals(new Double(2.0), MathHelper.div(new Double(6.0), new Double(3.0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDivCatchExc() {
        try {
            MathHelper.div(new Double(3.0), new Double(0.0));
        } catch (Exception e) {
            return;
        }
        fail();

    }
}
