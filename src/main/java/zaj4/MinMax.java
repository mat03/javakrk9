package zaj4;

import java.util.List;

public class MinMax {
    public static <T extends Comparable> T min(List<T> list) throws Exception {
        if(list == null || list.size() == 0) throw new Exception("invalid argument");

        T min = list.get(0);

        for (T i:list) {
            if(i.compareTo(min) < 0) {
                min = i;
            }
        }

        return min;
    }

    public static <T extends Comparable> T max(List<T> list) throws Exception {
        if(list == null || list.size() == 0) throw new Exception("invalid argument");

        T min = list.get(0);

        for (T i:list) {
            if(i.compareTo(min) > 0) {
                min = i;
            }
        }

        return min;
    }

    public  static <T extends Comparable> InformationMinMax information (List<T> list) throws Exception {
        InformationMinMax<T> inf = new InformationMinMax <T>(min(list), max(list));
        return inf;
    }
}
