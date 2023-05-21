package ua.hillel.hw14.coffee.order;

import java.util.*;

public class CoffeeOrderBoard extends Order {
    Map<Integer, String> cofOrBrd = new LinkedHashMap<>();

    public void addCoffeeOrderBoard(LinkedHashMap<Integer, String> order) {
        cofOrBrd.putAll(order);
    }

    public void deliver() {
        Set<Integer> keys = cofOrBrd.keySet();
        Integer[] array = new Integer[keys.size()];
        int temp = 0;
        for (Integer i : keys) {
            array[temp++] = i;
        }
        int key = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (key > array[i]) key = array[i];
        }
        System.out.println("Замовлення номер " + cofOrBrd.get(key) + " виконано");
        cofOrBrd.remove(key);
    }

    public void deliver(int num) {
        System.out.println("Замовлення номер " + cofOrBrd.get(num) + " виконано");
        cofOrBrd.remove(num);
    }

    public void draw() {
        System.out.println("===============");
        System.out.println(" Num |  Name  ");
        for (Map.Entry<Integer, String> i : cofOrBrd.entrySet()) {
            System.out.println("  " + i.getKey() + "     " + i.getValue());
        }
    }
}
