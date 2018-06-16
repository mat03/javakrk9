package zaj2;

import java.util.*;

public class CollectionsDemo {
    private static class Box {
        private String name;
        private Integer val;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getVal() {
            return val;
        }

        public void setVal(Integer val) {
            this.val = val;
        }

        public Box(String name, Integer val) {
            this.name = name;
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Box box = (Box) o;
            return Objects.equals(name, box.name) &&
                    Objects.equals(val, box.val);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, val);
        }
    }

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

    public static int solution(int[] A) {
        Set<Integer> count = new HashSet<>();

        for(int i = 0; i < A.length; ++i)
            count.add(A[i]);

        return count.size();
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

        HashSet<String> wordSet = new HashSet<>();
        wordSet.add("abc");
        wordSet.add("abc");


        Set<Box> set = new HashSet<>();

        int[]a = {1,23,5};

        set.add(new Box("box1",11));
        set.add(new Box("box1",11));
        System.out.println(set.size());
        Arrays.sort(args);

        Map<String, Integer> map = new HashMap<>();

        map.put("mama", 3);
        map.put("tata", 2);
        map.put("mama", 9);

        //W casie O(1) mamy dostęp doparyo zadanym kluczu


    }
}
