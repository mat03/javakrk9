import org.junit.Test;
import zaj2.Color;
import zaj2.ColorPoint3d;
import zaj2.Homework;
import zaj2.PointsHelper;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class HomeworkTest {
    @Test
    public void testCountNumbers() {
        Double[] tab = {-0.01, 2.3, -0.01, 7.8, 2.3, 2.3};

        Map<Double,Integer> res = Homework.countNumbers(tab);

        assertTrue(((res.get(-0.01) == 2)) ? true : false);
        assertTrue(((res.get(2.3) == 3)) ? true : false);
        assertTrue(((res.get(7.8) == 1)) ? true : false);

    }

    @Test
    public void testPointsHelper() {
        ColorPoint3d[] tab1 = {
                new ColorPoint3d(1.0,2.0,3.0, Color.RED),
                new ColorPoint3d(1.1,2.2,3.3,Color.BLUE),
                new ColorPoint3d(1.2,2.3,3.4,Color.RED)
        };

        ColorPoint3d[] tab2 = {
                new ColorPoint3d(1.0,2.0,3.0, Color.RED),
                new ColorPoint3d(1.1,2.2,3.3,Color.BLUE),
                new ColorPoint3d(1.2,2.3,3.4,Color.RED),
                new ColorPoint3d(1.0,2.0,3.0,Color.RED)
        };

        ColorPoint3d[] tab3 = {
                new ColorPoint3d(1.0,1.0,1.0,Color.RED)
        };

        assertTrue(PointsHelper.uniquePoints(tab1));
        assertFalse(PointsHelper.uniquePoints(tab2));
        assertTrue(PointsHelper.uniquePoints(tab3));
    }

    @Test
    public void testConvert() {
        ColorPoint3d[] tab1 = {
                new ColorPoint3d(9.9,8.0,9.0,Color.RED),
                new ColorPoint3d(100.0,33.4,55.5,Color.RED),
                new ColorPoint3d(1.0,2.0,3.0, Color.RED),
                new ColorPoint3d(1.1,2.2,3.3,Color.BLUE),
                new ColorPoint3d(1.2,2.3,3.4,Color.RED)
        };

        Set<ColorPoint3d> convertedSet = PointsHelper.convert(tab1);
        Iterator<ColorPoint3d> iterator = convertedSet.iterator();

        ColorPoint3d toCompare = iterator.next();
        assertTrue(toCompare.equals(new ColorPoint3d(1.0,2.0,3.0,Color.RED)));

        toCompare = iterator.next();
        assertTrue(toCompare.equals(new ColorPoint3d(1.1,2.2,3.3,Color.BLUE)));
    }
}
