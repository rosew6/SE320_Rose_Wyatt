package se320;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Hashsets {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\wyatt\\eclipse-workspace\\SE320_HW3\\src\\se320\\txt.txt"; 
        TreeSet<String> wordsSet = new TreeSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    wordsSet.add(word);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        System.out.println("words in ascending order:");
        for (String word : wordsSet) {
            System.out.println(word);
        }
    }
}
