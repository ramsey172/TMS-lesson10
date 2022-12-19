import Ex1.StringMethods;
import Ex2.StringMethods2;
import Ex3.StringMethods3;
import Ex4.StringObject;
import Ex5.StringMethods5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ex1
        String str = "1234-abc-5678-def-9g0h";
        StringMethods.printTwoNumberBlocks(str);
        StringMethods.printWithThreeLettersBlockReplace(str);
        StringMethods.printLettersOnly(str);
        StringMethods.printContainsABC(str);
        StringMethods.printStartsWith555(str);
        StringMethods.printEndsWith1a2b(str);

        //Ex2
        String str2 = "sdf 12345 12346 12";
        StringMethods2.printTheShortestWord(str2);
        StringMethods2.printTheLongestWord(str2);

        //Ex3
        String str3 = "ab fffff ab f 1234 jkjk";
        StringMethods3.printMinimumCharactersMatchWord(str3);

        //Ex4
        String str4 = "asdf aasdf asdfggfdsa 12321 12";
        StringObject stringObject = new StringObject(str4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дана строка: "+str4);
        System.out.println("Введите номер слова, которое проверяем, является ли палиндромом");
        int wordNum = scanner.nextInt();
        while(!stringObject.hasWord(wordNum)){
            System.out.println("Слова под таким номером нет, повторите попытку:");
            wordNum = scanner.nextInt();
        }
        if(stringObject.isPalindrome(wordNum)){
            System.out.println("Слово под номером "+wordNum+"("+stringObject.getWords()[wordNum-1]+") является палиндромом");
        }else{
            System.out.println("Слово под номером "+wordNum+"("+stringObject.getWords()[wordNum-1]+") не палиндром");
        }

        //Ex5
        String str5 = "Test";
        StringMethods5.printDoubleLetterWord(str5);



    }


}