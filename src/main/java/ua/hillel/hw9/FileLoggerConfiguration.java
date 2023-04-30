package ua.hillel.hw9;

import java.io.File;
import java.io.IOException;

public class FileLoggerConfiguration {

    public static void main(String[] args) {
        try {
            File  filelog = new File("FileLogger.txt");
            if (!filelog.exists()) {
                filelog.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error " + e);
        }

    }
}

