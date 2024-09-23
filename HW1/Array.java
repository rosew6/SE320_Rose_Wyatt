package se320;

import java.util.Random;
import java.util.Scanner;

public class Array {
    private int[] array;
    private int numMax = 100;
    private int index = 0;
    private Scanner SC;

    public Array(Scanner SC) {
        this.SC = SC;
        array = new int[numMax];
        Random random = new Random();
        for (int i = 0; i < numMax; i++) {
            array[i] = random.nextInt(numMax); 
        }
    }
    
    public void chooseArrNumIntro() {
        System.out.println("\n---part 2 of HW1---");
        chooseIndexNum();
    }

    public void chooseIndexNum() {
        while (true) {
            try {
                System.out.print("Enter the index of the array (0-99): ");
                index = SC.nextInt();
                System.out.println(" index #" + index + " is: " + array[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("out of bounds");
            }
        }
    }
}