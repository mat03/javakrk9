package zaj4;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.security.InvalidAlgorithmParameterException;

public class PascalTrangle {
    private final static int HEIGHT = 20;
    private static int[][] T  = null; //new int[HEIGHT][HEIGHT];

    private PascalTrangle() {

    }

    private static void fill() {
        T = new int[HEIGHT][HEIGHT];

        T[0][0] = T[1][0] = T[1][1] = 1;

        for(int i = 2; i < HEIGHT; ++i) {
            T[i][0] = T[i][i] = 1;
            for(int j = 1; j < i; ++j) {
                T[i][j] = T[i - 1][j - 1] + T[i - 1][j];
            }
        }

    }

    /**
     *
     * @param n
     * @param k
     * @return
     * @throws InvalidAlgorithmParameterException
     */

    //metoda która zwraca symbol newtona (n k) jakas wartosc komórki tr. pascala
    public static int newtonNK(int n, int k) throws InvalidAlgorithmParameterException {
        if(n < 1 || n > HEIGHT || k < 1 || k > HEIGHT) {
            throw new InvalidAlgorithmParameterException("wrong argument");
        }

        if(T == null) {
            fill();
        }

        return T[n][k];
    }

    public static String print() {
        if(T == null) {
            fill();
        }

        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < HEIGHT; ++i) {
            for(int j = 0; j <= i; ++j) {
                ret.append(T[i][j]);
                ret.append(" ");
            }
            ret.append("\n");
        }

        return ret.toString();
        //throw  new NotImplementedException();
    }

    public static int fib(int number) {
        int ret = 0;

        return ret;
    }
}