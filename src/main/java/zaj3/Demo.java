package zaj3;

import java.util.Arrays;
import java.util.List;

public class Demo {


    public static void main(String[] args) {
        Pairs<Integer,Integer> integerExam = new Pairs<>(2,4);
        Pairs<Double,Double> doubleExam = new Pairs<>(1.2, 4.5);
        Pairs<String,String> stringExam = new Pairs<>("a","b");

        Vector3D<Integer> vector3DInt = new Vector3D<>(2,4,5);
        Vector3D<Double> vector3DDou = new Vector3D<>(4.5,5.6,12.90);

        double []nums = {9.2, -10.3, 0.001, 9.22};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
