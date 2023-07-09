package ua.hillel.hw21;

import org.junit.jupiter.api.Test;

public class ProjectTestRunnerTest {

    @Test
    void testNameString() {
        ProjectTestRunner.testNameString(String.class);
    }

    @Test
    void testNameClass() {
        ProjectTestRunner.testNameClass(Integer.class);
    }

    @Test
    void testNamesString() {
        ProjectTestRunner.testNamesString(Integer.class,String.class);
    }

    @Test
    void testNamesClass() {
        ProjectTestRunner.testNamesString(Double.class,Float.class);
    }

    @Test
    void locationPakage() {
        ProjectTestRunner.locationPakage(Object.class);
    }
}