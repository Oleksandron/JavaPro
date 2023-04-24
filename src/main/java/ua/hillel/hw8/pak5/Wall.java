package ua.hillel.hw8.pak5;

public class Wall implements Obstacle {
    public Wall() {
        System.out.println("Create Wall");
    }

    public void obstacles() {
        System.out.println("Wall ready ");
    }
    public void overcome(){
        System.out.println("Obstacle  overcome");
    }
}
