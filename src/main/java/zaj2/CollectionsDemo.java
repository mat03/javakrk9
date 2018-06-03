package zaj2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {

    private static String print(List list) {
        StringBuilder result = new StringBuilder();
        list.forEach(x -> result.append(x));

        return result.toString();
    }

    public static String join(List<String> words, int wordLengthMin, int wordLengthMax) {
        StringBuilder rez = new StringBuilder();

        if (wordLengthMin > wordLengthMax) return rez.toString();

        for (String str: words) {
            if(str.length() >= wordLengthMin && str.length() <= wordLengthMax) {
                rez.append(str);
                rez.append(' ');
            }
        }

        rez.setLength(rez.length() - 1);

        return rez.toString();
    }


    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        /*
        i:  0   1   2   3   ..  9
            s1  s2              s10

         */

        words.add("s1");
        words.add("s11");

        List<Double> number = new LinkedList<>();
        number.add(32.1);
        number.add(99.9);
    }
}
