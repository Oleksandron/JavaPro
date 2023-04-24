package ua.hillel.hw8.pak5;

public class Cat extends AbstractMember {
    @Override
    public void members() {
        super.members();
        System.out.println("Cat.");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Cat.");
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("Cat.");
    }
}
