package wyruwnawcze;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumerGenerator extends Thread {
    private Set<Integer> set;
    private int n;

    public RandomNumerGenerator(Set<Integer> set, int n) {
        this.set = set;
        this.n = n;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (set.size() < this.n) {
            int num = random.nextInt(20) + 1;

            this.set.add(num);
        }
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Thread rg = new RandomNumerGenerator(set,10);

        rg.start();

        try {
            rg.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(set.toString());
    }
}
