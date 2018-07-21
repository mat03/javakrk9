package wyruwnawcze;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = args.length;
        Arrays.sort(args);

        for (int i = 0; i < size; ++i) {
            System.out.print(args[i] + "\t");
        }
        System.out.print("\n");

    }
}
