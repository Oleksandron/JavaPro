package ua.hillel.hw15.Product4_1_4_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Date;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        Date date = new Date();
        long ms = date.getTime();
        product.add(new Product("Journal", 108.0, ms));
        product.add(new Product("Newspaper", 5., ms));
        product.add(new Product("Book", 257.0, ms));
        product.add(new Product("Journal", 75.0, ms));
        product.add(new Product("Newspaper", 7.0, ms));
        product.add(new Product("Book", 500.0, ms));
        product.add(new Product("Journal", 99.0, ms));
        product.add(new Product("Book", 3.0, ms));
        product.add(new Product("Book", 342.0, ms));
        product.add(new Product("Book", 187.0, ms));
        product.add(new Product("Journal", 55.0, ms));
        product.add(new Product("Book", 256.0, ms));
        product.add(new Product("Book", 433.0, ms));
        product.add(new Product("Book", 4.0, ms));
        product.add(new Product("Book", 742.0, ms));
        product.add(new Product("Book", 337.0, ms));
        product.add(new Product("Journal", 55.0, ms));
        product.add(new Product("Book", 256.0, ms));
        product.add(new Product("Book", 133.0, ms));
        System.out.println(product);
        product.stream()
                .sorted(Comparator.comparing(Product::getDate).reversed()).limit(3)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
