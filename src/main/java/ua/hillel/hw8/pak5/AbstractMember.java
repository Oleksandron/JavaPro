package ua.hillel.hw8.pak5;

public class AbstractMember implements Obstacle {
    public void members(){
        System.out.print("I am ");
    }

    public void run() {
        System.out.print("Running ");
    }

    public void jump() {
        System.out.print("Jumping ");
    }
    public void obstacles() {
        System.out.println("Wall ready ");
    }
    public void overcome(){
        System.out.println("Obstacle  overcome");
    }
    }

