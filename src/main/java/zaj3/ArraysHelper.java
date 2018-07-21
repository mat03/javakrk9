package zaj3;

import java.util.List;


public class ArraysHelper {
    public  static <T> int counter(List<T> list, T obj) {
        int res = 0;

        for (T ele: list) {
            if(ele.equals(obj)) res++;
        }
        return res;
    }
}
