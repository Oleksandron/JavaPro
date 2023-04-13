package ua.hillel.hw4;

public class Main {
    public static void main(String[] args) {
        Dog Tuzik = new Dog("Tuzik",4,"black");
        Tuzik.run(155);
        Tuzik.swim(7);
        Cat Murzik = new Cat("Murzik",5,"brown");
        Murzik.run(71);
        Murzik.swim();
        Cat Thomas  = new Cat("Thomas",7,"gray");
        System.out.println(Thomas);
        Animal mouse = new Animal("Jerry",1,"gray");
    }
}
