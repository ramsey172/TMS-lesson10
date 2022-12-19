package Ex2;

public class StringMethods2 {
    public static void printTheShortestWord(String str) {
        String[] strArr = str.split(" ");
        int minLength = 9999;
        String shortestWord = "";
        for (String string : strArr) {
            if (string.length() <= minLength) {
                minLength = string.length();
                shortestWord = string;
            }
        }
        System.out.println(shortestWord);
    }

    public static void printTheLongestWord(String str) {
        String[] strArr = str.split(" ");
        int maxLength = 0;
        String longestWord = "";
        for (String string : strArr) {
            if (string.length() >= maxLength) {
                maxLength = string.length();
                longestWord = string;
            }
        }
        System.out.println(longestWord);
    }
}
