package zaj4;

public class FunctionHelper {
    /*
    zwraca index elementu w vals jesli ten element jest miejscemzerowym funcki
     */

    @FunctionalInterface
    public interface FunctionTemplate {
        public double f(double x); // scheat na postaci lambda: h->h
    }


    public static  int zero(double[] vals,FunctionTemplate h) {
        // wersja iteracyjna
        int i = 0;
        int j = vals.length - 1;

        while (i <= j) {
            int s = (i+j)/2;
            double va = vals[s];
            if(h.f(va) == 0) {
                return s;
            }

            if(va > 0) {
                j = s -1;
            } else {
                i = s + 1;
            }
        }
        return -1;

    }
}
