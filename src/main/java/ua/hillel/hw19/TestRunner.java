package ua.hillel.hw19;

import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Class<?> cl = Calculator.class;
        Method methodBeforeSuite;
        {
            try {
                methodBeforeSuite = cl.getDeclaredMethod("sum", int.class, int.class);
                Test test = methodBeforeSuite.getAnnotation(Test.class);
                calc.before_suite();
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        Method m1;
        {
            try {
                m1 = cl.getDeclaredMethod("sum", int.class, int.class);
                Test test = m1.getAnnotation(Test.class);
                System.out.println(calc.sum(test.a(), test.b()));
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        Method m2;
        {
            try {
                m2 = cl.getDeclaredMethod("division", int.class, int.class);
                Test test = m2.getAnnotation(Test.class);
                System.out.println(calc.division(test.a(), test.b()));
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        Method m3;
        {
            try {
                m3 = cl.getDeclaredMethod("multiply", int.class, int.class);
                Test test = m3.getAnnotation(Test.class);
                System.out.println(calc.multiply(test.a(), test.b()));
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        Method m4;
        {
            try {
                m4 = cl.getDeclaredMethod("divide", int.class, int.class);
                Test test = m4.getAnnotation(Test.class);
                System.out.println(calc.divide(test.a(), test.b()));
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        Method methodAfterSuite;
        {
            try {
                methodAfterSuite = cl.getDeclaredMethod("sum", int.class, int.class);
                Test test = methodAfterSuite.getAnnotation(Test.class);
                calc.after_suite();
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
