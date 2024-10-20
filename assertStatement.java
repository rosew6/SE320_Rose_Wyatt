package se320;

import java.util.Scanner;

public class assertStatement {
    
    public static void main(String[] args) {
        int number = getInput();
        assert number >= 0 && number <= 10 : "The entered number is out of range";
        System.out.println("You have entered: " + number); 
    }

    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Please enter a number between 0 and 10: "); // Prompt user
            number = scanner.nextInt(); 
            if (number >= 0 && number <= 10) {
                break; 
            }
            System.out.println("Please enter a valid number");
        }
        scanner.close(); 
        return number;
    }

}