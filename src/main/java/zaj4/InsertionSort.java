package zaj4;

public class InsertionSort {
    public static void insort(int []tab) {
        int n = tab.length;
        //dla kazdego elementu z czesci nieposortowanej
        for(int i = 1; i < n; i++) {
            //wstawiamy ity element do czesci posortowanej
            for(int j = i; j > 0; j--) {  //na poczatku j jest indeksem wstawianego elemntu ale tez jest uzywany przy przesuwaniu
                if(tab[j-1] > tab[j]) {  //tab[j] jednoczesnie wstawiany i przesuwany element
                    //zamiana elementow miejscami
                    int temp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }

    public static <T extends Comparable> void insort (T[] tab) {
        int n = tab.length;

        for(int i = 1; i <n; i++) {
            for(int j = i; j> 0; j--) {
                if(tab[j - 1].compareTo(tab[j]) > 0) {
                    T temp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = temp;

                }
            }
        }
    }

    public static <T extends Comparable> void qs (T[] tab, int b, int e) {
        int i = b, j = e;
        T v; // wartosc elementu dzielacego

        int s = (b + e) / 2;

        v = tab[s];

        while (i < j) {

            //te elementy z lewej czesci tab ktore sa "<=" od v, zostawiamy
            while (tab[i].compareTo(v) < 0) {
                i++;
            }

            //te elementy z lewej czesci tab ktore sa ">" od v, zostawiamy
            while (tab[j].compareTo(v) > 0) {
                j--;
            }

            if (i < j) {
                T temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
            } else {
                return;
            }

        }
        // upewniay sie czy mamy sortować dlej - bo nie ma sensu sortowaczakres1elementowy
        if(b < j) {
            qs(tab, b, j);
        }

        if(i < e) {
            qs(tab, i, e);
        }
    }

    public static <T extends Comparable> void quicksort (T[] tab) {

    }
}
