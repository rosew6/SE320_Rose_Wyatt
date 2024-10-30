package se320;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Internationalization {
    public static void main(String[] args) {
        double number = 12345.678;
        NumberFormat Us = NumberFormat.getInstance(Locale.US);
        NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        String UK = uk.format(number);
        String US = us.format(number);
        System.out.println("UK: " + UK);
        System.out.println("U.S. : " + US);
        String numberString = "12,345.678";
        try {
            Number parsedNumber = Us.parse(numberString);
            System.out.println("Parsed number: " + parsedNumber);
        } catch (ParseException e) {
            System.out.println("Error printing" );
        }
    }
}
