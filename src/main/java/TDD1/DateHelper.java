package TDD1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateHelper {

    private DateHelper(){
    }

    public static boolean correctDateCheck(int date) {
        final String regExp = "([0-9]\\d{3}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01]))";

        String strDate = String.valueOf(date);

        if(strDate.length() != 8) {
            return false;
        }

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(strDate);

        while (matcher.find()) {
            return true;
        }

        return false;
    }
}
