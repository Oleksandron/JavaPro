package ua.hillel.hw20.factory;

public class WardrobeFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Wardrobe() ;
    }
}
