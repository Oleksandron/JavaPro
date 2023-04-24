package ua.hillel.hw8.pak5;

public class Human extends AbstractMember {
    public Human() {
        System.out.println("Create Human");
    }

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
