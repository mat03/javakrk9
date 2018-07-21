package TDD2;

import TDD1.InvalidArgumentException;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class StringCommons {
    public static String changePairs(String word) {
        int size = word.length();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (i + 1 < size) {
                stringBuilder.append(word.charAt(i + 1));
            }

            stringBuilder.append(word.charAt(i));
            i++;
        }
        return stringBuilder.toString();
    }

    public static boolean isPalidrom(String text) {
        //throw new UnsupportedOperationException();

        int beg = 0;
        int end = text.length() - 1;

        while (beg < end) {
            if(text.charAt(beg) != text.charAt(end)) {
                return false;
            }

            beg++;
            end--;
        }

        return true;
    }

    public static String wordsCon(String[] array) {
        if(array.length == 0) {
            return "";
        }

        TreeSet<String> treeSet = new TreeSet<>();

        for (String word:array) {
            treeSet.add(word);
        }

        Iterator iterator;
        iterator = treeSet.iterator();

        StringBuilder result = new StringBuilder();

        while (iterator.hasNext()) {
            result.append(iterator.next());
            result.append("_");
        }

        result.deleteCharAt(result.length() - 1);

        return result.toString();


    }

    public static Double minPositive(List<Double> list1) {
        Double min = Double.MAX_VALUE;
        boolean findPositive = false;

        for (Double digit: list1) {
            if(digit > 0.0) {
                findPositive = true;
                if(min > digit) {
                    min = digit;
                }
            }
        }

        if(findPositive == false) {
            return -1.0;
        }
        return min;

    }

    public static Double sum(List<Double> list, int beg, int end) throws InvalidArgumentException {
        int size = list.size();

        if(size == 0) {
            throw new InvalidArgumentException("empty list");
        }

        if(beg > end) {
            throw new InvalidArgumentException("incorect index");
        }

        if((beg > size) || (end > size)) {
            throw new InvalidArgumentException("index to big");
        }

        Double sum = 0.0;
        for (int i = beg; i < end; i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
