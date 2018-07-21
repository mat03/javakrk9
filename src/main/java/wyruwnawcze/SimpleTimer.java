package wyruwnawcze;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleTimer extends Thread {

    public  SimpleTimer(String name) {
        super(name);
    }

    @Override
    public void run() {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        String sDate =  df.format(date);

        System.out.println(sDate);

    }
}
