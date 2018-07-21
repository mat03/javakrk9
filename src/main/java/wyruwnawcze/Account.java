package wyruwnawcze;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Account {
    private int account = 0;
    private final static Logger logger = Logger.getLogger(Account.class.getName());

// sekcja krytyczna gdy dwa watki maja dostep do tej samej danej
   // synchronized public void increment() { //cala funkcja synchronizowana
    public void increment() {
        synchronized (this) {
            logger.log(Level.WARNING, "thread started changing account");
            int temp = account;
            ++temp;
            account = temp;
        }
        logger.log(Level.INFO, "account has been changed");
    }


    public int getAccount() {
        return account;
    }
}
