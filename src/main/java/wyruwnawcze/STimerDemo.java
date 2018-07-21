package wyruwnawcze;

public class STimerDemo {
    public static void main(String[] args) {

        new Thread(new STimer(1)).start();
    }
}
