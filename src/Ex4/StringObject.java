package Ex4;

public class StringObject {
    private String str;
    private String[] words;
    private int wordCount;

    public StringObject(String str) {
        this.str = str;
        this.words = str.split(" ");
        this.wordCount = words.length;
    }

    public String[] getWords() {
        return words;
    }



    public boolean isPalindrome(int wordPosition) {
        char[] charArr = words[wordPosition-1].toCharArray();
        for (int j = 0, k = charArr.length - 1; j <= k; j++, k--) {
            if(charArr[j] != charArr[k]){
                return false;
            }
        }
        return true;
    }

    public boolean hasWord(int wordPosition) {
        return wordPosition - 1 < wordCount && wordPosition > 0;
    }
}
