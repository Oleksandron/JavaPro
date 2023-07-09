package ua.hillel.hw22;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server run");
            while (true)
                try (Socket socket = serverSocket.accept()) {
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    {

                        String in = reader.readLine();
                        String out = "Connect to server";
                        writer.write(out);
                        writer.newLine();
                        writer.flush();
                    }
                } catch (NullPointerException ex) {
                    ex.printStackTrace();
                }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
