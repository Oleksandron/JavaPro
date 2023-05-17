package ua.hillel.hw12;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static int countOccurance(List<String> list, String str) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i))) {
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (T i : arr) {
            list.add(i);
        }
        return list;
    }

    public static Set<Integer> findUnique(List<Integer> list) {
        HashSet set = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        return set;
    }

//    public static void calcOccurance(List<String> str) {
//        Map<String,Integer> test = new HashMap<>();
//        int count = 1;
//        for (int i = 0; i < str.size(); i++) {
//
//        }
//    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            list.add(i, "Apple");
        }
        String str1 = "Hello";
        String str2 = "Apple";
        System.out.println(countOccurance(list, str1));
        System.out.println(countOccurance(list, str2));
        String[] arr1 = new String[]{"1", "2", "3", "4", "5", "6", "7"};
        Integer[] arr2 = new Integer[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};
        System.out.println(toList(arr1));
        System.out.println(toList(arr2));
        List<Integer> digits = new ArrayList<>(List.of(arr2));
        System.out.println(findUnique(digits));
    }
}
