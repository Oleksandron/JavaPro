package ua.hillel.hw8.pak2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.members();
        human.run();
        human.jump();
        System.out.println("-----------------------");
        Cat cat = new Cat();
        cat.members();
        cat.run();
        cat.jump();
        System.out.println("------------------------");
        Robot robot = new Robot();
        robot.members();
        robot.run();
        robot.jump();
    }
}
