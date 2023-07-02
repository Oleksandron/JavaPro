package ua.hillel.hw20.factory;

public class Chair implements Furniture {
    @Override
    public void furnitureСreate() {
        System.out.println("Furniture created! Chair created");
    }
}
