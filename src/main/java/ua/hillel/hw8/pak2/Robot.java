package ua.hillel.hw8.pak2;

public class Robot extends AbstractMember {
    @Override
    public void members() {
        super.members();
        System.out.println("Robot.");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Robot.");
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("Robot.");
    }
}
