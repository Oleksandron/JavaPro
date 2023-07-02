package ua.hillel.hw20.strategy;

public class Count {
    Square countSquare;

    public void setSquare(Square square) {
        this.countSquare = square;
    }
    public void cSquare(){
        countSquare.square();
    }
}
