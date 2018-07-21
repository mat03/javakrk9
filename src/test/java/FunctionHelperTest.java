import org.junit.Test;
import zaj4.FunctionHelper;

import static junit.framework.TestCase.assertEquals;

public class FunctionHelperTest {

    @Test
    public void testZero() {
        double[] vals = {-2,-1,0,1,2,3};

        int index = FunctionHelper.zero(vals, h -> h - 2);

        assertEquals(index, 4);

        index = FunctionHelper.zero(vals, h -> 1);
        assertEquals(index, -1);
    }
}
