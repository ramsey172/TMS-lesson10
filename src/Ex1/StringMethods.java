package Ex1;

public class StringMethods {
    public static void printTwoNumberBlocks(String str) {
        String[] arr = str.split("-");
        System.out.println(arr[0] + "\n" + arr[2]);
    }

    public static void printWithThreeLettersBlockReplace(String str) {
        String[] arr = str.split("-");
        String toPrint = str.replace(arr[1], "***").replace(arr[3], "***");
        System.out.println(toPrint);
    }

    public static void printLettersOnly(String str) {
        String[] arr = str.split("-");
        String toPrint = arr[1] + "/" + arr[3] + "/" + arr[4].charAt(1) + "/" + arr[4].charAt(3);
        System.out.println(toPrint);
    }

    public static void printContainsABC(String str) {
        System.out.println(str.toLowerCase().contains("abc") || str.toUpperCase().contains("ABC"));
    }

    public static void printStartsWith555(String str) {
        System.out.println(str.startsWith("555"));
    }

    public static void printEndsWith1a2b(String str) {
        System.out.println(str.endsWith("1a2b"));
    }
}


