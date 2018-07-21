package zaj4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonPart {
    public static <T extends Object> T[] common(T[] first, T[] second) {
        HashSet<T> count = new HashSet<>();
        List<T> list = new ArrayList<>();

        for(int i = 0; i < first.length; ++i) {
            count.add(first[i]);
        }

        for (int i = 0; i < second.length; ++i) {
            if(count.contains(second[i])) {
                list.add(second[i]);
            }
        }

        T[] array = (T[]) new Object[list.size()];

        for (int i = 0; i < list.size(); ++i) {
            array[i] = list.get(i);
        }

        return  array;
    }
}
