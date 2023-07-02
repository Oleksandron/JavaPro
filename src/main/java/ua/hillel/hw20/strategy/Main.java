package ua.hillel.hw20.strategy;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        count.setSquare(new Triangle());
        count.cSquare();
        count.setSquare(new Сircle());
        count.cSquare();
        count.setSquare(new Rectangle());
        count.cSquare();

    }
}
