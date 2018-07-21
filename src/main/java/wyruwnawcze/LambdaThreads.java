package wyruwnawcze;

import java.util.Date;

public class LambdaThreads {
    public static void main(String[] args) {
        new Thread(() -> {
            for (;;) {
                Date date = new Date();
                System.out.println(date.getTime());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
