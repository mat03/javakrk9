package wyruwnawcze;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InfinityLoop extends Thread{
    private String nam;
    public InfinityLoop(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 1;
        int rez = 0;
        Random random = new Random();
        Random randSleep = new Random();

        while(true) {
            int num = random.nextInt(10000) + 1;

            if ((i % 2) == 0) {
                if ((num % 2) == 0) {
                    rez = num;
                } else {
                    rez = num + 1;
                }
            } else {
                if ((num % 2) == 1) {
                    rez = num;
                } else {
                    rez = num + 1;
                }
            }
            ++i;

            try {
                Thread.sleep((randSleep.nextInt(10) + 1) * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(super.getName() + rez);
        }
    }

    public static void main(String[] args) {
        final int MAX_THREAD_NUM = 1000;

        List<InfinityLoop> infinityLoops = new ArrayList<>();

        for(int i = 0; i < MAX_THREAD_NUM; ++i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("T");
            stringBuilder.append(i);
            stringBuilder.append(' ');

            infinityLoops.add(new InfinityLoop(stringBuilder.toString()));

            infinityLoops.get(i).start();
        }

    }
}
