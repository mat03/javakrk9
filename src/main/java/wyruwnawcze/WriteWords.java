package wyruwnawcze;

import java.util.Random;

public class WriteWords extends Thread{
    private final static String[] words =
            new String[] {"asocjacja", "niesporczak", "topologia", "piwo", "palindrom"};
    private  final static Random random = new Random();

    public WriteWords() {
    }

    @Override
    public void run() {
        while (true) {
            int wordIdx = random.nextInt(words.length);

            System.out.println(words[wordIdx]);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        new WriteWords().start();
    }
}
