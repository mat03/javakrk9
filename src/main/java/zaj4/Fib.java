package zaj4;

public class Fib {
    final private static int MAX_FIB_NUMBER = 100;
    private static int[] T = null;

    private Fib() {

    }

    private static void fill() {
        T = new int[MAX_FIB_NUMBER];

        T[0] = 0;
        T[1] = 1;

        for (int i = 2; i < MAX_FIB_NUMBER; ++i) {
            T[i] = T[i - 1] + T[i - 2];
        }
    }

    public static int getFib(int n) {
        if(n < 0 || n > MAX_FIB_NUMBER) return -1;

        if(T == null) {
            fill();
        }
        
        return T[n];
    }

}
