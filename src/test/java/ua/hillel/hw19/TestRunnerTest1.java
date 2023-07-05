package ua.hillel.hw19;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestRunnerTest1 {

    int a = 99;
    int b = 11;

    @Before
    void before() {
        System.out.println("Before all tests");
    }

    @Test
    void sum() {
        int res = 110;
        Assert.assertEquals(res, TestRunner1.sum(a, b));
    }

    @Test
    void division() {
        int res = 88;
        Assert.assertEquals(res, TestRunner1.division(a, b));
    }

    @Test
    void multiply() {
        int res = 1089;
        Assert.assertEquals(res, TestRunner1.multiply(a, b));
    }

    @Test
    void divide() {
        int res = 9;
        Assert.assertEquals(res, TestRunner1.divide(a, b));
    }
    @After
    void after(){
        System.out.println("After all tests");
    }
}