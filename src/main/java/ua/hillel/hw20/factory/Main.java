package ua.hillel.hw20.factory;

public class Main {
    static FurnitureFactory furnitureFactory(String furniture) {
        if (furniture.equalsIgnoreCase("Table")) {
            return new TableFactory();
        } else if (furniture.equalsIgnoreCase("Chair")) {
            return new ChairFactory();
        } else if (furniture.equalsIgnoreCase("Wardrobe")) {
            return new WardrobeFactory();
        } else return new SofaFactory();
    }

    public static void main(String[] args) {
        furnitureFactory("Table");
        furnitureFactory("Wardrobe");
        furnitureFactory("Sofa");
        furnitureFactory("Chair");
    }
}
