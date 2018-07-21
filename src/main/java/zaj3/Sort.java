package zaj3;

import java.util.List;

public class Sort {

    static public void sortChars(char[] t) {
        int len = t.length;

        final int SIZE = 6;
        int[] countAlphabet = new int[SIZE];


        int countA = 0, countB = 0,countC = 0, countD = 0, countE = 0, countF = 0;

        for (int i: t) {
            switch (i) {
                case 'a' :
                    ++countA;
                    break;
                case 'b' :
                    ++countB;
                    break;
                case  'c' :
                    ++countC;
                    break;
                case 'd' :
                    ++countD;
                    break;
                case 'e' :
                    ++countE;
                    break;
                case 'f' :
                    ++countF;
                    break;
            }
        }
        for(int i = 0; i < len; ++i) {
            if(countA != 0) {
                t[i] = 'a';
                --countA;
                continue;
            }

            if(countB != 0) {
                t[i] = 'b';
                --countB;
                continue;
            }

            if(countC != 0) {
                t[i] = 'c';
                --countC;
                continue;
            }

            if(countD != 0) {
                t[i] = 'd';
                --countD;
                continue;
            }

            if(countE != 0) {
                t[i] = 'e';
                --countE;
                continue;
            }

            if(countF != 0) {
                t[i] = 'f';
                --countF;
            }
        }

    }
}
