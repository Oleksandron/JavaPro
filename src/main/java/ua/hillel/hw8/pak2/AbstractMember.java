package ua.hillel.hw8.pak2;


public class AbstractMember implements Member {
    public void members(){
        System.out.print("I am ");
    }

    @Override
    public void run() {
        System.out.print("Running ");
    }

    @Override
    public void jump() {
        System.out.print("Jumping ");
    }
}
