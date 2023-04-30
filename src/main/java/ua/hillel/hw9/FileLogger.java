package ua.hillel.hw9;

import java.io.*;
import java.util.Date;
import java.util.logging.Logger;

public class FileLogger {
    private static final Logger logger = Logger.getLogger("ua.hillel.hw9.FileLogger");

    private void debug(String message) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("FileLogger.txt")))){
            Date now = new Date();
            out.writeBytes(String.valueOf(now));
            out.writeBytes("DEBUG");
            out.writeBytes("Повідомлення: ");
            out.writeBytes(message);
            out.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private void info(String message) throws IOException {
        try ( DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("FileLogger.txt")))){
            Date now = new Date();
            out.writeBytes(String.valueOf(now));
            out.writeBytes("INFO");
            out.writeBytes("Повідомлення: ");
            out.writeBytes(message);
            out.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void maxSize(File file) throws IOException{
        try {
            file.canWrite();
            boolean b = file.length() > 1048567;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
