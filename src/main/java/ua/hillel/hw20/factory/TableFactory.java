package ua.hillel.hw20.factory;

public class TableFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
