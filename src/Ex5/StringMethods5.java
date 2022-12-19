package Ex5;

public class StringMethods5 {
    public static void printDoubleLetterWord(String str){
        char[] charArr = str.toCharArray();
        char[] resultCharArr = new char[charArr.length*2];
        for(int n=0, j=0;n<charArr.length;n++,j++){
            resultCharArr[j] = charArr[n];
            resultCharArr[++j] = charArr[n];
        }
        System.out.println(String.valueOf(resultCharArr));
    }
}
