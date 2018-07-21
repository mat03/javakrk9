import org.junit.Test;

import java.security.InvalidAlgorithmParameterException;

import static junit.framework.TestCase.assertEquals;

public class PascalTrangleTest {
    @Test
    public void testNewtonNK() throws InvalidAlgorithmParameterException {
        int res = zaj4.PascalTrangle.newtonNK(4,2);

        assertEquals(6,res);
    }
}
