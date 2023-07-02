package ua.hillel.hw20.factory;

public class SofaFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Sofa();
    }
}
