package dodatkowe;

public class Accumul {
    public static String accum(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int len = chars.length;

        if(len == 0) return sb.toString();

        for(int i = 0; i < len; ++i) {
            char ch = chars[i];

            for(int j = 0; j < i + 1; ++j) {
                if(j == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            }
            sb.append('-');
        }

        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
