package zaj1;

public class BinarySearch {
    // zakladamy ze elementysa sortowane nie malejaco
    public static boolean search(int[] T, int x){
        int begin = 0;
        int end = T.length - 1;

        while (begin <= end) {
            int central = (begin + end) / 2;
            if(T[central] == x) return true;

            if(x < T[central]) {
                begin = central + 1;
            } else {
                end = central - 1;
            }
        }
        return false;
    }
}
