package hw.last;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
             
            Scanner scanner = new Scanner(System.in);
            System.out.print("weight in kg: ");
            double weight = scanner.nextDouble();
            System.out.print("height in meters: ");
            double height = scanner.nextDouble();
            
            String data = weight + ", " + height;
            out.println(data);
            
            String response = in.readLine();
            System.out.println("Server response: " + response);
        } catch (IOException e) {
            System.out.println("exception in client");
        }
    }
}