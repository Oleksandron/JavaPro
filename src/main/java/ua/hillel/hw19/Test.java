package ua.hillel.hw19;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    int priority();
    int a() default 99;
    int b() default 11;
}