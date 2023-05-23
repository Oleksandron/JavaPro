package ua.hillel.hw13;

import java.io.File;
import java.util.*;

public class FileNavigator extends FileData {

    Map<String, List<String>> files = new HashMap<>();

    public void add(String file, String path) {
        if (file.equals(files.containsKey(path))) {
            System.out.println("Шлях-ключ і шлях до файлу не співпадають");
        } else if (files.containsKey(path)) {
            List<String> temp = new ArrayList<>();
            temp = files.get(path);
            temp = List.of(file);
            files.put(path, temp);
        } else files.put(path, List.of(file));
    }

    public List<String> find(String path) {
        List<String> temp = new ArrayList<>();
        temp = files.get(path);
        return temp;
    }

    public List<String> filterBySize(long size) {
        List<String> temp = new ArrayList<>();
        temp = files.get(path);
        List<String> out = new ArrayList<>();
        for (String str : temp) {
            if (temp.size() <= size) out = temp;
        }
        return out;
    }

    public void remove(String path) {
        files.remove(path);
    }

    public Map<String, List<String>> sortBySize(Map<String, List<String>> files) {
        Map<String, List<String>> out = new HashMap<>();
        for (Map.Entry<String, List<String>> i : files.entrySet()) {
            List<String> temp = new ArrayList<>();
            temp = i.getValue();
            Collections.sort(temp);
            out.put(i.getKey(), temp);
        }
        return out;
    }
}
