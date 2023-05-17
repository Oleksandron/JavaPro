package ua.hillel.hw12.phonebook;

import java.util.*;

public class PhoneDirectory extends Record {
    HashMap<String, String> phonDir = new HashMap<>();

    public PhoneDirectory(String name, String phone) {
        super(name, phone);
    }

    public static Map<String, List<String>> phoneDirectoryAdd(Map<String, List<String>> phonDir, String name, String phone) {
        phonDir.put(name, Collections.singletonList(phone));
        return phonDir;
    }

    public static String find(Map<String, List<String>> phonDir, String seek) {
        String out = null;
        for (Map.Entry<String, List<String>> i : phonDir.entrySet()) {
            if (seek.equalsIgnoreCase(i.getKey())) {
                out = i.getKey() + " " + i.getValue();
                break;
            }
        }
        return out;
    }

    public static ArrayList<String> findAll(Map<String, List<String>> phonDir, String seek) {
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, List<String>> i : phonDir.entrySet()) {
            if (seek.equalsIgnoreCase(i.getKey())) {
                list.add(i.getKey() + " " + i.getValue());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Map<String, List <String>> phonBook = new HashMap<>();
        phoneDirectoryAdd(phonBook, "Mark", "123456789");
        phoneDirectoryAdd(phonBook, "Jonn", "123456789");
        phoneDirectoryAdd(phonBook, "Ann", "123456789");
        phoneDirectoryAdd(phonBook, "Piter", "123456789");
        phoneDirectoryAdd(phonBook, "Mila", "123456789");
        System.out.println(find(phonBook,"Mark"));
        System.out.println(phonBook);
        phoneDirectoryAdd(phonBook, "Mark", "987654321");
        phoneDirectoryAdd(phonBook, "Jonn", "987654321");
        phoneDirectoryAdd(phonBook, "Ann", "987654321");
        phoneDirectoryAdd(phonBook, "Piter", "987654321");
        phoneDirectoryAdd(phonBook, "Mila", "987654321");
        System.out.println(findAll(phonBook,"Ann"));
        System.out.println(phonBook);
    }

}
