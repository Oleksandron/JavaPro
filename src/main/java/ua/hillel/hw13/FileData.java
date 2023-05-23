package ua.hillel.hw13;

import java.io.File;

public class FileData {
    File file = new File("C:/FileData/file.txt");
    String  name = file.getName();
    String path = file.getPath();
    long size =  file.length();
}
