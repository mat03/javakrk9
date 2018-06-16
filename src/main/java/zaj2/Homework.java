package zaj2;

import java.util.HashMap;
import java.util.Map;

public class Homework {
    public static Map<Double, Integer> countNumbers(Double []T) {
        Map<Double,Integer> countResult = new HashMap<>();

        for (Double getData: T) {
            int count = countResult.containsKey(getData) ? countResult.get(getData) : 0;
            countResult.put(getData, count +1 );
        }

        return countResult;
    }
}
