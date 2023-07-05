package ua.hillel.hw19;

public class TestRunner1 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int division(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(sum(99, 11));
        System.out.println(division(99, 11));
        System.out.println(multiply(99, 11));
        System.out.println(divide(99, 11));
    }

}
