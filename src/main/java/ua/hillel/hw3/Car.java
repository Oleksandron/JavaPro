package ua.hillel.hw3;

public class Car {
    private void startElectricity(){
        System.out.println("Start Electricity Ok");
    }
    private void startCommand(){
        System.out.println("Start Command Ok");
    }
    private void startFuelSystem(){
        System.out.println("Start Fuel System Ok");
    }
    public void start(){
        startElectricity();
        startCommand();
        startElectricity();
    }

    public static void main(String[] args) {
        Car my = new Car();
        my.start();
    }
}
