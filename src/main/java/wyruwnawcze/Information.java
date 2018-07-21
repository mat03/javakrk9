package wyruwnawcze;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Information implements Runnable {
    private Long id;
    private int n;
    private final static Logger logger = Logger.getLogger(Information.class.getName());
    private final static Random random = new Random();

    public Information(Long id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; ++i) {
            logger.log(Level.INFO, String.format("Teraz działa watek %d", this.id));

            try {
                Thread.sleep(200 + random.nextInt(501));
            } catch (Exception e) {

            }
        }
    }
}
