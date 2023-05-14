package ua.hillel.hw11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList toList(Box[] arr) {
        ArrayList out = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            out.add(arr[i]);
        }
        return out;
    }


    public static void main(String[] args) {

    }
}
