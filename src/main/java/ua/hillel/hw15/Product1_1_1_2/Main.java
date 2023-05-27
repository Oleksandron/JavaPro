package ua.hillel.hw15.Product1_1_1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        product.add(new Product("Book", 202.0));
        product.add(new Product("Journal", 108.0));
        product.add(new Product("Newspaper", 5.0));
        product.add(new Product("Book", 257.0));
        product.add(new Product("Journal", 75.0));
        product.add(new Product("Newspaper", 7.0));
        product.add(new Product("Book", 500.0));
        product.add(new Product("Journal", 99.0));
        product.add(new Product("Book", 3.0));
        product.add(new Product("Book", 342.0));
        product.add(new Product("Book", 187.0));
        product.add(new Product("Journal", 55.0));
        product.add(new Product("Book", 256.0));
        product.add(new Product("Book", 433.0));
        product.add(new Product("Book", 4.0));
        product.add(new Product("Book", 742.0));
        product.add(new Product("Book", 337.0));
        product.add(new Product("Journal", 55.0));
        product.add(new Product("Book", 256.0));
        product.add(new Product("Book", 133.0));
        System.out.println(product);
        product.stream()
                .filter(p -> p.getType().equalsIgnoreCase("Book"))
                .filter(p -> p.getPrice() > 250.0)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
