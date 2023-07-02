package ua.hillel.hw20.builder;

public class CarBuilder {
    private Chassis chassis;
    private Wheels wheels;
    private Body body;
    private Color color;
    private Glass glass;
    private Headlights headlights;

    public CarBuilder() {
    }

    public CarBuilder(Chassis chassis, Wheels wheels, Body body, Color color, Glass glass, Headlights headlights) {
        this.chassis = chassis;
        this.wheels = wheels;
        this.body = body;
        this.color = color;
        this.glass = glass;
        this.headlights = headlights;
    }

    public CarBuilder setChassis(Chassis chassis) {
        this.chassis = chassis;
        return this;
    }

    public CarBuilder setWheels(Wheels wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setBody(Body body) {
        this.body = body;
        return this;
    }


    public CarBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public CarBuilder setGlass(Glass glass) {
        this.glass = glass;
        return this;
    }

    public CarBuilder setHeadlights(Headlights headlights) {
        this.headlights = headlights;
        return this;
    }
    public Car build(){
        return new Car(chassis,wheels,body,color,glass,headlights);
    }

}
