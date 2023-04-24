package ua.hillel.hw8.pak0;

public class Main {
    static double squares = 0;

    public static double squareCircles(Circle[] circles) {
        for (int i = 0; i < circles.length; i++) {
            squares += circles[i].squareFigures();
        }
        return squares;
    }

    public static double squareSquare(Square[] square) {
        for (int i = 0; i < square.length; i++) {
            squares += square[i].squareFigures();
        }
        return squares;
    }

    public static double squareTriangle(Triangle[] triangles) {
        for (int i = 0; i < triangles.length; i++) {
            squares += triangles[i].squareFigures();
        }
        return squares;
    }

    public static void main(String[] args) {
        Circle[] circle = new Circle[5];
        for (int i = 0; i < circle.length; i++) {
            circle[i] = new Circle();
            circle[i].setRadius(Math.random() * 100 + 15);
        }
        Square[] square = new Square[5];
        for (int i = 0; i < square.length; i++) {
            square[i] = new Square();
            square[i].setHeight(Math.random() * 100 + 15);
            square[i].setWidth(Math.random() * 100 + 15);
        }
        Triangle[] triangle = new Triangle[5];
        for (int i = 0; i < square.length; i++) {
            triangle[i] = new Triangle();
            triangle[i].setaSide(Math.random() * 100 + 15);
            triangle[i].setbSide(Math.random() * 100 + 15);
            triangle[i].setcSide(Math.random() * 100 + 15);
        }
        System.out.println(squareCircles(circle));
        System.out.println(squareSquare(square));
        System.out.println(squareTriangle(triangle));
    }
}
