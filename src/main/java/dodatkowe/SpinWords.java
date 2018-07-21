package dodatkowe;

public class SpinWords {
    public String spinWords(String sentence) {
        if((sentence == null) || (sentence.length() == 0)) {
            return new String();
        }

        String[] splitWords = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < splitWords.length; i++) {
            String word = splitWords[i];

            if(word.length() >= 5) {
                sb.append(word);
                sb.reverse();
                splitWords[i] = sb.toString();
                sb.setLength(0);
            }
        }

        sb.setLength(0);

        for (int i = 0; i < splitWords.length; i++) {
            sb.append(splitWords[i]);
            sb.append(' ');
        }
        sb.setLength(sb.length() - 1);

        return sb.toString();

    }
}
