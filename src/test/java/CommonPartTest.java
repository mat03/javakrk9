import org.junit.Test;
import zaj3.Pairs;
import zaj4.CommonPart;

import static junit.framework.TestCase.assertEquals;
import static zaj4.CommonPart.common;

public class CommonPartTest {
    @Test
    public void testCommon() {
        Integer[] tab1 = {1,2,3,4,5,6};
        Integer[] tab2 = {2,4,6,8,10};
        Object[] tab3 =  CommonPart.common(tab1, tab2);
        //assertEquals(tab2[0].intValue(), 2);
        assertEquals(tab3[0],2);
        assertEquals(tab3[1],4);
        assertEquals(tab3[2],6);
        assertEquals(tab3.length,3);

        Pairs<Integer,Integer>[] tab4 = new Pairs[]{new Pairs<>(1,4),new Pairs<>(4,5)};
        Pairs<Integer,Integer>[] tab5 = new Pairs[]{new Pairs<>(444,4),new Pairs<>(4,5)};

        Object[] tab6 = CommonPart.common(tab4,tab5);

        //assertEquals((Pairs)tab6[0],4);



    }
}
