package ua.hillel.hw6;

public class Main {
    public static int findSymbolOccurance(String str, char c) {
        int count = 0;
        char[] test = str.toCharArray();
        for (int i = 0; i < test.length; i++) {
            if (test[i] == c) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        char[] out = str.toCharArray();
        String strOut = "";
        for (int i = out.length - 1; i >= 0; i--) {
            strOut += out[i];
        }
        return strOut;
    }
    public static boolean isPalindrome(String in) {
        return in.equalsIgnoreCase(stringReverse(in));
    }

    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Hello World!!!!", 'l'));
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(stringReverse("Hello World!!!!"));
        System.out.println(isPalindrome("abcdefedcba"));
    }
}
