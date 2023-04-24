package ua.hillel.hw8.pak0;

import ua.hillel.hw8.pak0.AbstractShape;

public class Square extends AbstractShape {
    private double height;
    private double width;

    public double squareFigures() {
        return height * width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
