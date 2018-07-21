package wyruwnawcze;

import java.util.logging.Logger;

public class STimer implements Runnable{
    //private final static Logger logger = new Logger(Information.class.getName());

    private int seconds = 1;
    private int minuts = 0;
    private  int hours = 0;

    private int id;


    public STimer(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            ++this.seconds;

            if ((this.seconds % 60) == 0) {
                ++this.minuts;
                this.seconds = 0;
            }

            if (this.minuts > 59) {
                this.minuts = 0;
                ++this.hours;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(String.format("%dh %dm %ds", this.hours, this.minuts, this.seconds));
        }
    }
}
