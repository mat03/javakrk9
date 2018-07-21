package wyruwnawcze;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeNumbers implements Runnable {
    private static final List<Integer> list = new ArrayList<>();
    private static final Random random = new Random();

    private int n;

    public PrimeNumbers(int n) {
        this.n = n;
        findPrimeNumbers();
    }

    private boolean isPrimeNumber(int number) {
        for(int i = 2; i < number; ++i) {
            if((number % i) == 0) {
                return false;
            }
        }
        return true;
    }

    private void findPrimeNumbers() {
        for(int i = 2; this.list.size() < this.n; i++) {
            if(isPrimeNumber(i)) {
                this.list.add(i);
            }
        }
    }

    @Override
    public void run() {
     for (int i = 0; i < this.list.size(); ++i) {
         try {
             Thread.sleep(200 * (this.random.nextInt(5) + 1));
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println(this.list.get(i));
     }

    }

    public static void main(String[] args) {
        new Thread(new PrimeNumbers(10000)).start();
    }
}
