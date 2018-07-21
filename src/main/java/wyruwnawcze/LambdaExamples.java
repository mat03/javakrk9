package wyruwnawcze;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExamples {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("teaaaa","bbbbbb","ccctecccccc","dddddddddd");

        //chcemy wypiac pierwdze trzy litery (duze) tych słów , wynik ma byc posortowany

        //wzorzec projektowy - fluent interface
        words.
                stream().
                filter(w -> w.contains("te")).
                map(s->s.substring(0,3)).
                map(el -> el.toUpperCase()).
                sorted().
                forEach(System.out::println);


        List<Integer> vals2 = Arrays.asList(-2, 30, 15, -8, 16);

        vals2.stream().filter(n -> n < 0).map(x-> Math.abs(x)).forEach(n -> System.out.println(n));

        List<String> list = Arrays.asList("2.3","1.2","3.4");

        System.out.println(list.stream().map(x -> Double.parseDouble(x)).reduce((x, y) -> x + y).get());

        List<Integer> exam = Arrays.asList(1, -9, 9, 3,4,5,-7,3);

        System.out.println(concatAbs(exam));

        System.out.println(concatAbsSecond(exam));

        List<Integer> examp = new ArrayList<>();

        Random random = new Random();

        for(int i = 0; i < 10000000; i++) {
            examp.add(random.nextInt(10000));
        }

        test1(examp);
        test2(examp);

        System.out.println(count(list).toString());

    }

    public static String concatAbs(List<Integer> list) {
        return list.stream().
                map(i -> Math.abs(i) + "").
                reduce((s1, s2) -> s1 + " " + s2).
                get();

    }

    public static String concatAbsSecond(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        list.stream().
                map(i -> Math.abs(i) + "").
                map(s -> sb.append(s).append(" ")).forEach(a -> {});
                //reduce((s1, s2) -> sb.append(s1).append(" ").append(s2).toString()).
                //get();

        return sb.toString();

    }

    private static void test1(List<Integer> list) {
        long timeBefor = System.currentTimeMillis();
        int ret = list.stream().reduce((x, y) -> x + y).get();
        long timeAfter = System.currentTimeMillis();

        long deltaTime = timeAfter - timeBefor;
        System.out.println("nor"  + "  " + deltaTime);
    }

    private static void test2(List<Integer> list) {
        long timeBefor = System.currentTimeMillis();
        int ret = list.parallelStream().reduce((x, y) -> x + y).get();
        long timeAfter = System.currentTimeMillis();

        long deltaTime = timeAfter - timeBefor;
        System.out.println("par " + "  " + deltaTime);
    }

    private static Map<String, Long> count(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
    }

    private static Map<Double, Double> report3(List<Double> data) {
        return data.stream().collect(
                Collectors.groupingBy(
                        Double::doubleValue, Collectors.summingDouble(Double::doubleValue)
                )
        );
    }

}
