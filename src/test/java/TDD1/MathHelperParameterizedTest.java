package TDD1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class MathHelperParameterizedTest {

    private enum Operation {
        SUM, MULT, MAXABS
    }

    private Double val1; // pierwszyargument testowej metody
    private Double val2; // -- drugi--
    private Double val3; // wymik wartosc oczekiwana
    private Operation op;

    public MathHelperParameterizedTest(Double val1, Double val2, Double val3, Operation op) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.op = op;
    }

    //tametoda przygotowuje konkretne dane ktore bedaaplikowaneasercjj
    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        Object[][] params = new Object[][] {
                {-2.0, 2.0, 0.0, Operation.SUM},
                {4.5, 2.3, 6.8, Operation.SUM},
                {-4.0, 2.0, -2.0, Operation.SUM},
                {0.0, 2.3, 2.3, Operation.SUM},
                {0.0, 2.3, 0.0, Operation.MULT},
                {-3.0, -4.0, 12.0, Operation.MULT},
                {-12.0, 20.0, 20.0, Operation.MAXABS},
                {-33.0, 22.0, -33.0, Operation.MAXABS}
        };
        return Arrays.asList(params);

    }

    @Test
    public void testSum() {
        assumeTrue(op == Operation.SUM);
        assertEquals(val3, MathHelper.sum(val1,val2));
    }

    @Test
    public void testMult() {
        assumeTrue(op == Operation.MULT);
        assertEquals(val3,MathHelper.mult(val1,val2));
    }

    @Test
    public void testmaxAbs() {
        assumeTrue(op == Operation.MAXABS);
        assertEquals(val3,MathHelper.maxAbs(val1,val2));
    }
}
