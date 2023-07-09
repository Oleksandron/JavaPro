package ua.hillel.hw21;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SimpleMathLibraryTest.class, ProjectTestRunnerTest.class})
public class TestRunnerTest {

    public static void main(String[] args) {
        Result res1 = JUnitCore.runClasses(SimpleMathLibraryTest.class);
        for (Failure failure: res1.getFailures() ) {
            System.out.println(failure.toString());
        }
        System.out.println(res1.wasSuccessful());
        Result res2 = JUnitCore.runClasses(ProjectTestRunnerTest.class);
        for (Failure failure: res2.getFailures() ) {
            System.out.println(failure.toString());
        }
        System.out.println(res2.wasSuccessful());
    }
}
