package TDD1;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ListHelperTest {
    private static List<Integer> list = new ArrayList<>();
    private static List<Integer> reslt = new ArrayList<>();

    @Before
    public void addArrayElement() {
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(100);
    }

    @After
    public void clearArraysElement() {
        list.clear();
        reslt.clear();
    }

    @Test
    public void testRemove() {
        reslt = ListHelper.removeAndReverse(list,1);

        AssertionsForInterfaceTypes.assertThat(reslt).contains(2,4,100);
        AssertionsForInterfaceTypes.assertThat(reslt).doesNotContain(1);
    }

    @Test
    public void testReverse() {
        reslt = ListHelper.removeAndReverse(list, 2);

        AssertionsForInterfaceTypes.assertThat(reslt.get(0)).isEqualTo(100);
        AssertionsForInterfaceTypes.assertThat(reslt.get(1)).isEqualTo(4);
    }

    @Test
    public void testCorrectReturnSize() {
        reslt = ListHelper.removeAndReverse(list, 1);

        AssertionsForInterfaceTypes.assertThat(reslt).hasSize(3);
    }
}
