package TDD1;

import java.util.*;

public class ListHelper {
    public static List<Integer> removeAndReverse(List<Integer> list, Integer val) {
        List<Integer> result = new ArrayList<>();
        ListIterator<Integer> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            Integer readValue = listIterator.previous();
            if(!readValue.equals(val)) {
                result.add(readValue);
            }
        }
        return result;
    }
}
