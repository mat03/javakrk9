import org.junit.Test;
import zaj4.InformationMinMax;
import zaj4.MinMax;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MinMaxTest {
    @Test
    public void testInformation() throws Exception {
        List<Double> tab = new ArrayList<>();

        tab.add(1.1);
        tab.add(5.5);
        tab.add(0.0);
        tab.add(10.1);

        InformationMinMax<Double> inf = MinMax.information(tab);
        assertEquals(inf.getMin(),0.0);
        assertEquals(inf.getMax(),10.1);
    }
}
