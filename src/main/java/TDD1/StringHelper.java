package TDD1;

public class StringHelper {

    //pomocnicza funkcja, ktora wstawia do tablicy t, litere n razy
    //poczawszy od indeksu i.Wartosc zwracana  to indeks komorki od ktorej bedzie wstawiany ciag kolejnych liter
    private static int insert(char []t, char letter, int i, int n) {
        for(int k = 0; k <n; k++) {
            t[i++] = letter;
        }
        return i;
    }

    //sortowanie opierajace sie na zliczaniu, ma zlozonosc czasowa  O(n), i zlozonosc pamieciowa O(1)
    public static void sortChars(char []t)  {
        int a = 0, b  = 0, c = 0, d = 0, e = 0, f = 0;
        //mozna tez zrobic tablice o stalym rozmiarze
        //i zalozyc ze pierwsza komorka to licznik a, druga licznik b itd...
        for(char letter : t) {
            switch(letter) {
                case 'a':
                    a++;
                    break;  //ten break spowoduje ze dalej nie bedziemy sprawdzac, nastapi przejscie do kolejnej iteracji
                case 'b':
                    b++;
                    break;
                case 'c':
                    c++;
                    break;
                case 'd':
                    d++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'f':
                    f++;
                    break;
            }
        }
        int i = insert(t, 'a', 0, a);
        i = insert(t, 'b', i, b);
        i = insert(t, 'c', i, c);
        i = insert(t, 'd', i, d);
        i = insert(t, 'e', i, e);
        i = insert(t, 'f', i, f);
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
