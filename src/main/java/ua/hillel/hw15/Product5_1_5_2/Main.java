package ua.hillel.hw15.Product5_1_5_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();
        product.add(new Product("Journal", 108.0, year));
        product.add(new Product("Newspaper", 5., year));
        product.add(new Product("Book", 257.0, year));
        product.add(new Product("Journal", 75.0, year));
        product.add(new Product("Newspaper", 7.0, year));
        product.add(new Product("Book", 500.0, year));
        product.add(new Product("Journal", 99.0, year));
        product.add(new Product("Book", 3.0, year));
        product.add(new Product("Book", 342.0, year));
        product.add(new Product("Book", 187.0, year));
        product.add(new Product("Journal", 55.0, year));
        product.add(new Product("Book", 256.0, year));
        product.add(new Product("Book", 33.0, year));
        product.add(new Product("Book", 4.0, year));
        product.add(new Product("Book", 742.0, year));
        product.add(new Product("Book", 337.0, year));
        product.add(new Product("Journal", 55.0, year));
        product.add(new Product("Book", 256.0, year));
        product.add(new Product("Book", 133.0, year));
        System.out.println(product);
        product.stream()
                .filter(p -> p.getDate() == 2023)
                .filter(p -> p.getType().equalsIgnoreCase("Book"))
                .filter(p -> p.getPrice() < 76)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
