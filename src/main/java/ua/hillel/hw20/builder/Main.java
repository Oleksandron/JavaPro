package ua.hillel.hw20.builder;

public class Main {
    public static void main(String[] args) {
        Car bmw = Car.builder()
                .setChassis(Chassis.FERRUM)
                .setWheels(Wheels.R17)
                .setBody(Body.HATCHBACK)
                .setColor(Color.BLACK)
                .setGlass(Glass.TEMPERED)
                .setHeadlights(Headlights.OVAL)
                .build();
        Car opel = Car.builder()
                .setChassis(Chassis.FERRUM)
                .setWheels(Wheels.R15)
                .setBody(Body.SEDAN)
                .setColor(Color.RED)
                .setGlass(Glass.ANNEALED)
                .setHeadlights(Headlights.CIRCLE)
                .build();
        Car tesla = Car.builder()
                .setChassis(Chassis.ALUMINUM)
                .setWheels(Wheels.R18)
                .setBody(Body.COUPE)
                .setColor(Color.BLUE)
                .setGlass(Glass.TEMPERED)
                .setHeadlights(Headlights.RECTANGLE)
                .build();
    }
}
