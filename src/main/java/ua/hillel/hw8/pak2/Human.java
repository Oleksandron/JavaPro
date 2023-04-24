package ua.hillel.hw8.pak2;

public class Human extends AbstractMember {

    @Override
    public void members() {
        super.members();
        System.out.println("Human.");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Human.");
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("Human.");
    }
}
