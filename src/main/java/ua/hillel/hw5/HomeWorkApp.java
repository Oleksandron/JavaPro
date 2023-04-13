package ua.hillel.hw5;

public class HomeWorkApp {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        System.out.println((a + b) > 0 ? "Сума позитивна" : "Сума негативна");
    }

    public static void printColor(int value) {
        if (value <= 0) {System.out.println("Червоний");}
        else if (value <= 100) {System.out.println("Жовтий");}
        else {System.out.println("Зелений");}

    }

    public static void compareNumbers(int a, int b) {
        System.out.println(a < b ? "a < b" : "a >= b");
    }

    public static void compareSum(int a, int b) {
        System.out.println((a + b) > 9 && (a + b) < 21);
    }

    public static void compareNumber(int d) {
        System.out.println(d < 0 ? "від’ємне" : "додатнє ");
    }

    public static void numberIsTrueOrFalse(int f) {
        System.out.println(f < 0);
    }

    public static void systemOut(String s, int h) {
        System.out.println(s.repeat(h));
    }

    public static void isYear(int year) {
        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(7, 9);
        printColor(177);
        compareNumbers(7, 5);
        compareSum(15, 7);
        compareNumber(0);
        numberIsTrueOrFalse(-1);
        systemOut("Hello", 7);
        isYear(2000);
    }
}
