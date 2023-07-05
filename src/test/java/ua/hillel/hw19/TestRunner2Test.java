package ua.hillel.hw19;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestRunner2Test {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll start");
    }

    @Test
    void start1() {
        Human human = new Human("Bill", 55);
        System.out.println("Method1 ok");
    }

    @Test
    void start2() {
        Assert.assertNotNull(new Human("Piter", 33));
        System.out.println("Method2 ok");
    }

    @Test
    void main() {
        System.out.println("Method main ok");
    }

    @AfterAll
    static void tear() {
        System.out.println("@AfterAll executed");
    }
}