package ua.hillel.hw20.builder;

public class Car{
    private String chassis;
    private String wheels;
    private String body;
    private String color;
    private String glass;
    private String headlights;

    public Car(String chassis, String wheels, String body, String color, String glass, String headlights) {
        this.chassis = chassis;
        this.wheels = wheels;
        this.body = body;
        this.color = color;
        this.glass = glass;
        this.headlights = headlights;
    }

    public Car(Chassis chassis, Wheels wheels, Body body, Color color, Glass glass, Headlights headlights) {
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public void setHeadlights(String headlights) {
        this.headlights = headlights;
    }

    public String getChassis() {
        return chassis;
    }
    public String getWheels() {
        return wheels;
    }

    public String getBody() {
        return body;
    }
    public String getColor() {
        return color;
    }

    public String getGlass() {
        return glass;
    }

    public String getHeadlights() {
        return headlights;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassis='" + chassis + '\'' +
                ", wheels='" + wheels + '\'' +
                ", body='" + body + '\'' +
                ", color='" + color + '\'' +
                ", glass='" + glass + '\'' +
                ", headlights='" + headlights + '\'' +
                '}';
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }
}
