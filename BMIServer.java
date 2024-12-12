package hw.last;

import java.net.*;
import java.io.*;

public class BMIServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for connections...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            System.out.println("Error in server: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) {
        new Thread(() -> {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
                String data = in.readLine();
                String[] parts = data.split(",");
                double weight = Double.parseDouble(parts[0]);
                double height = Double.parseDouble(parts[1]);
                
                double bmi = calculateBMI(weight, height);
                String category = getBMICategory(bmi);
                
                String result = String.format("BMI: %.2f, Category: %s", bmi, category);
                out.println(result);
            } catch (IOException e) {
                System.out.println("Error handling client: " + e.getMessage());
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    System.out.println("Error closing client socket: " + e.getMessage());
                }
            }
        }).start();
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    private static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
