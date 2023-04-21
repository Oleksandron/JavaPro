package ua.hillel.hw7;

public class ArraySizeException extends RuntimeException {

    public ArraySizeException() {
        System.out.println("Arrays size is incorrect");
    }

    public ArraySizeException(String message) {
        super(message);
    }
}
