package ua.hillel.hw4;

public class Cat extends Animal{
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void run(int barrier){
        super.run();
        if (barrier <= 200)System.out.println("Cat run " + barrier + " m!");
    }
    public void swim(){
        super.swim();
        System.out.println("Cat not swim!!!!!");
    }
}
