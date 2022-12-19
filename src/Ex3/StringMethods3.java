package Ex3;

public class StringMethods3 {
    public static void printMinimumCharactersMatchWord(String str) {
        String[] strArr = str.split(" ");
        int min = 9999;
        int counter = 0;
        int resIndex = 0;
        for (String word : strArr) {
            StringBuilder wordStringBuilder = new StringBuilder(word);
            for (int n = 0; n < wordStringBuilder.length(); n++) {
                char ch = word.charAt(n);
                if (word.indexOf(ch, n + 1) > -1) {
                    wordStringBuilder.deleteCharAt(n);
                    word = wordStringBuilder.toString();
                    n--;
                }
            }
            if (word.length() < min) {
                min = word.length();
                resIndex = counter;
            }
            counter++;
        }
        System.out.println(strArr[resIndex]);
    }
}
