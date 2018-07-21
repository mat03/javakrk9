package wyruwnawcze;

public class InforationDemo {
    public static void main(String[] args) {
        final int NUMBER_THREADS = 20;
        for (int i = 0; i <= NUMBER_THREADS; ++i) {
            //Information inf = new Information(new Long(i), i * 2);

            //Thread th = new Thread(inf);
            //th.start();

            new Thread(new Information(new Long(i), i * 2)).start();
        }
    }
}
