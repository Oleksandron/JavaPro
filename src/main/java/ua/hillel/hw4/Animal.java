package ua.hillel.hw4;

public class Animal {
    public String name;
    public int age;
    public String color;

    public void run(){
        System.out.println("I am run!");
    }
    public void swim(){
        System.out.println("I am swim!");
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
