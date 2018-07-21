package zaj3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortPersons {
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

    public static String getString(List<?> list) {
        StringBuilder res = new StringBuilder();

        list.forEach(el ->{res.append(el).append("\n");});

        return res.toString();
    }

    public double sumary(List<? extends Number> numbers) {
        double result = 0;

        for(Number el : numbers) {
            result += el.doubleValue();
        }

        //return numbers.stream().mapToDouble(Number::doubleValue).sum();

        return result;
    }

    public static void main(String[] args) throws Exception {
        List<Person> persons = new LinkedList<>();

        persons.add(new Person(3L,"za@bgma.com"));
        persons.add(new Person(2L,"bb@bgma.com"));
        persons.add(new Person(1L,"cc@bgma.com"));
        persons.add(new Person(9L,"dd@bgma.com"));
        persons.add(new Person(11L,"ee@bgma.com"));

        //Collections.sort(persons);
        Person minimum = min(persons);
        Person maximum = max(persons);

        System.out.println(minimum);
        System.out.println(maximum);

        List<String> list = new ArrayList<>();

        list.add("zaaa");
        list.add("bbbb");
        list.add("vccc");

        Collections.sort(list, (x,y) -> { return x.compareTo(y);});

        System.out.println(list);
    }
}
