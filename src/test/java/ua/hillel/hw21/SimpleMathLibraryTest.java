package ua.hillel.hw21;


import org.junit.jupiter.api.Test;

public class SimpleMathLibraryTest {
    public double a = 1.0;
    public double b = 1.0;

    @Test
    void add() {
        double res = 2.0;
        if (res == SimpleMathLibrary.add(a, b)) {
            System.out.println("Ok");
        } else System.out.println("Not Ok");
    }

    @Test
    void minus() {
        double res = 0.0;
        if (res == SimpleMathLibrary.minus(a, b)) {
            System.out.println("Ok");
        } else System.out.println("Not Ok");
    }
}