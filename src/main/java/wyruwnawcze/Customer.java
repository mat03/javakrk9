package wyruwnawcze;

import java.util.Random;

public class Customer implements Runnable{
    private Account account;
    private final static Random rand = new Random();

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; ++i) {
            account.increment();

            try {
                Thread.sleep(100 + 100 * rand.nextInt(4));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
