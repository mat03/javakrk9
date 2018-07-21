package wyruwnawcze;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    private static int countEmails(String text) {
        final String regExp = "[a-z]+@[a-z]+([.][a-z]+)*";

        Pattern pattern = Pattern.compile(regExp);

        Matcher matcher = pattern.matcher(text);

        int count = 0;

        while (matcher.find()) {
            ++count;
        }

        return count;
    }

    public static void main(String[] args) {
        String[] parts = "abc#xyz_wwww#1234".split("[#_]");

        System.out.println(Arrays.toString(parts));

        String text = "aaajjaj \n kasia@gmai.com  ldlld  ,,d  mateusz@onet.kl df@";

        System.out.println(countEmails(text));
    }
}
