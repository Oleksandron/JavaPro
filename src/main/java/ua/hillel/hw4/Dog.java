package ua.hillel.hw4;

public class Dog extends Animal {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void run(int barrier) {
        super.run();
        if (barrier <= 500) System.out.println("Dog run " + barrier + " m!");
    }
    public void swim(int barrier){
        super.swim();
        if (barrier <= 10) System.out.println("Dog swim " + barrier + " m!");
    }
}
