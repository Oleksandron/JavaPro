package ua.hillel.hw19;

public class Calculator {
    @BeforeSuite
    public void before_suite() {
        System.out.println("First method");
    }

    @Test(priority = 9, a = 55, b = 77)
    public static int sum(int a, int b) {
        return a + b;
    }

    @Test(priority = 1, a = 333, b = 222)
    public static int division(int a, int b) {
        return a - b;
    }

    @Test(priority = 5, a = 44, b = 88)
    public static int multiply(int a, int b) {
        return a * b;
    }

    @Test(priority = 2, a = 2000, b = 50)
    public static int divide(int a, int b) {
        return a / b;
    }

    @AfterSuite
    public void after_suite() {
        System.out.println("Last method");
    }

    public static void main(String[] args) {
        System.out.println(sum(99, 11));
        System.out.println(division(99, 11));
        System.out.println(multiply(99, 11));
        System.out.println(divide(99, 11));
    }
}
