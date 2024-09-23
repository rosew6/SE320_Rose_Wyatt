package se320;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Addition addition = new Addition(SC);
        Array array = new Array(SC);

        addition.additionIntro();
        array.chooseArrNumIntro();
    }
}