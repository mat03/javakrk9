import org.junit.Test;
import zaj2.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CollectionsDemoTest {
    @Test
    public void testJoin() {
        List<String> a = new ArrayList<>();
        a.add("dog");
        a.add("theory");
        a.add("wolf");
        a.add("computer");
        assertEquals(CollectionsDemo.join(a, 4, 7), "theory wolf");
    }

    @Test
    public void testCollection() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for(int i = 1; i < 100; ++i) {
            arrayList.add(i * 3);
            linkedList.add(i * 2);
        }
    }

    @Test
    public void testSolution() {
        int[]a = {1,2,1,3,1,2};

        assertEquals(CollectionsDemo.solution(a), 3);
    }
}
