package com.cbfacademy;

import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class App {
    public static void main(String[] args) {
        // try {
        // URL myURL = new
        // URL("https://github.com/cbfacademy/intro-to-java-course/tree/main/exercises/client-server-architecture#earth_africa-using-urls");
        // URLConnection myURLConnection = myURL.openConnection();
        // myURLConnection.connect();
        // String contentType = myURLConnection.getContentType();
        // System.out.println(contentType);
        // }
        // catch(MalformedURLException e) {
        // System.out.println(e.getMessage());
        // }
        // catch(IOException e) {
        // System.out.println(e.getMessage());
        // }

        try {
            URL myURL = new URL(
                    "https://github.com/cbfacademy/intro-to-java-course/tree/main/exercises/client-server-architecture#earth_africa-using-urls");
            HttpURLConnection connection = (HttpURLConnection) myURL.openConnection();
            int responseCode = connection.getResponseCode();

            System.out.println("Server returns response code" + (responseCode));

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //connection not found ERROR 
        String serverAddress = "localhost"; // Server address
        int serverPort = 4040; // Server port number

        try (Socket socket = new Socket(serverAddress, serverPort);
                OutputStream out = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(out, true)) {

            String message = "Hello, Server!"; 
            writer.println(message);
            System.out.println("Sent to server: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
