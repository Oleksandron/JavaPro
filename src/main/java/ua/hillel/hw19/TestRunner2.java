package ua.hillel.hw19;

public class TestRunner2 {
    void start (Human human) {
        System.out.println("The class of " + human +
                " is " + human.getClass().getName());
    }

    public static void main(String[] args) {
        TestRunner2 ts2 = new TestRunner2();
        ts2.start(new Human("Alex",22));

    }
}
