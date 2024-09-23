package se320;

import java.util.Scanner;

public class Addition {
    private int num1 = 0;
    private int num2 = 0;
    private Scanner SC;

    public Addition(Scanner SC) {
        this.SC = SC;
    }
    
    public void additionIntro() {
        System.out.println("---part 1 of HW1---");
        getNums();
    }
    
    public void getNums() {
        while (num1 == 0) {
            try {
                System.out.print("Enter your first number: ");
                num1 = SC.nextInt();
            } catch (Exception e) {
                System.out.println("please enter valid number (int)");
                SC.next();
            }
        }
        while (num2 == 0) {
            try {
                System.out.print("Enter your second number: ");
                num2 = SC.nextInt();
            } catch (Exception e) {
                System.out.println("please enter valid number (int)");
                SC.next();
            } 
        }
        int total = num1 + num2;
        System.out.println("Total of entered numbers is: " + total);
    }
}
