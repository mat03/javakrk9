package wyruwnawcze;

/**
 * GC usuwa obiekt gdy stwiedzi ze nie ma juz na niego referencji
 * W momencie usuwania obiektu wywolywana jest zawsze metoda finilaze
 *
 * Programista nie ma możliwosci wymuszania usuwania obiekt
 */
public class GCDemo {
    private static class Box extends Object {
        private String value;

        public Box(String value) {
            this.value = value;
        }

        @Override
        protected void finalize() {
            System.out.println(String.format("Box with values %s in remove", this.value));
        }

    }
    private static void f() {
        Box box = new Box("Box1");
       // box = null;
    }

    public static void main(String[] args) {
        f();
        System.gc();
        System.out.println("main is working...");
    }
}
