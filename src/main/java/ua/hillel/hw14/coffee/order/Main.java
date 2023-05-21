package ua.hillel.hw14.coffee.order;


public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard two = new CoffeeOrderBoard();
        two.cofOrBrd.put(1,"Jonn");
        two.cofOrBrd.put(2,"Mark");
        two.cofOrBrd.put(3,"Ann");
        two.cofOrBrd.put(4,"Helena");
        two.cofOrBrd.put(5,"Tom");
        two.draw();
        two.deliver();
        two.deliver(3);
        two.draw();
    }
}
