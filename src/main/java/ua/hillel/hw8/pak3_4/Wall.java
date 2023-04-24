package ua.hillel.hw8.pak3_4;

public class Wall implements Obstacle{
    @Override
    public void obstacles() {
        System.out.println("Wall ready ");
    }
    public void overcome(){
        System.out.println("Obstacle  overcome");
    }
}
