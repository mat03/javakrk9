package zaj1;

import java.util.*;

import static java.util.Collections.*;

public class IntroduceTask {

    private static void f(int T[][]) {

        for(int i = 0; i < T.length; i++) {
            for(int j = 0; j <i; j++) {
                //if(i ==j) continue;
                int v = T[i][j];
                T[i][j] = T[j][i];
                T[j][i] = v;
            }
        }

    }

    private static void printArr(int T[][]) {
        for (int i = 0; i < T.length; ++i) {
            for(int j = 0; j < T[0].length; ++j) {
                System.out.print(T[i][j]);
            }
            System.out.print("\n");
        }
    }

    private static int fibRec(int n) {
        if(n <= 2) return 1;

        return fibRec(n -1) + fibRec(n - 2);
    }

    public static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static boolean  gameAlg(String str) {
        int upDown = 0, leftRight = 0;
        for (int i = 0; i < str.length(); ++i){
            char var = str.charAt(i);

            switch (var) {
                case 'D':
                    ++upDown;
                    break;
                case 'G':
                    --upDown;
                    break;
                case 'L':
                    ++leftRight;
                    break;
                case 'P':
                    --leftRight;
                    break;
            }
        }

        return (upDown == 0 && leftRight == 0);
    }

    static public int solution(int N) {
        if (N <= 1) return 0;

        while (N % 2 == 0) {
            N /= 2;
        }

        int max =  0;

        for (int i = 0; N > 0; N /= 2) {
            if (N % 2 == 0) {
                ++i;
            } else {
                if (i > max) max = i;
                i = 0;
            }
        }
        return max;
    }
// 0
    static public Integer specialMax(Integer []T) {
        Integer max = Integer.MIN_VALUE, sum = 0;

        for (Integer i: T) {
            if (i > max) max = i;
            sum += i;
        }

        if ( max > (sum - max)) return max;
        return null;
    }
//0 bis
    static public List<Integer> specialMaxNew(List<Integer> T) {
        Integer max = Integer.MIN_VALUE, sum = 0;
        List<Integer> ret = new ArrayList<>();

        for (int i: T) {
            if (i > max) max = i;
            sum += i;
        }

        if ( max > (sum - max)) ret.add(max) ;
        return ret;

    }
//1
    static public int getIndex(int[] T) {
        for(int i = 0; i < T.length; ++i) {
            if(i == T[i]) return i;
        }
        return -1;
    }
//2
    static public int maxDivider(int dig) {
        if(dig <= 3) return -1;

        for(int i = dig - 1; dig > 1; --i) {
            if((dig % i) == 0) return i;
        }

        return -1;
    }

//4
    static public void  splitString(String str) {
        HashMap<String, Integer> countString = new HashMap();


        str.replace('\t', ' ');
        str.replace('\n', ' ');
        str.replace('\r', ' ');
        str.replace('\f', ' ');

        String[] split = str.split(" ");

        for (String word: split) {
            int count = countString.containsKey(word) ? countString.get(word) : 0;

            countString.put(word, count +1 );
        }

        System.out.println(countString.toString());

    }
//5
    static public int median(int[] T) {
        Arrays.sort(T);
        int len = T.length, center = len / 2 , med = 0;

        if(len % 2 == 0) {
            med = (T[center - 1] + T[center]) / 2;
        } else {
            med = T[center];
        }

        return med;
    }
//6 zrobione na zajeciach

//7
    static public boolean palindrome(int dig) {
        Integer in = new Integer(dig);
        String binary = Integer.toBinaryString(in);

        int len = binary.length(), center = len / 2;

        if(len % 2 == 1){
            for(int i = 1; i <= center; ++i) {
                if(binary.charAt(center - i) != binary.charAt(center + i)) return false;
            }

        } else {
            for(int i = 0; i < center; ++i) {
                if(binary.charAt(center + i) != binary.charAt(center - i - 1)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final int n = 4;
        int [][]T = new int[n][n];

        Random rand = new Random();
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                //T[i][j] = rand.nextInt(200) + 1;
                T[i][j] = j;
            }
        }

        int T2[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        printArr(T2);
        System.out.println("\n");
        f(T2);
        printArr(T2);

        String s1="GGDD";

        boolean ret = gameAlg(s1);

        if(ret) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        String string = "a b c a c f";
        splitString(string);


    }
}
