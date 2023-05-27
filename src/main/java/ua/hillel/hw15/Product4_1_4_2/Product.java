package ua.hillel.hw15.Product4_1_4_2;

import java.time.LocalDate;

public class Product {
    private String type;
    private double price;
    private long date;

    public Product(String type, double price, long date) {
        this.type = type;
        this.price = price;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Product{" +  "type='" + type + '\'' +  ", price=" + price +  ", date=" + date + '}';
    }
}
