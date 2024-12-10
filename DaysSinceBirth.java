package HW5.Package;

import java.util.Scanner;
import java.time.LocalDate;

public class DaysSinceBirth {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int birthYear = SC.nextInt();
        System.out.print("Enterbirth month: ");
        int birthMonth = SC.nextInt();
        System.out.print("Enter birth day: ");
        int birthDay = SC.nextInt();
        
        Day birthDate = new Day(birthYear, birthMonth, birthDay);
        LocalDate today = LocalDate.now();
        Day currentDate = new Day(today.getYear(), today.getMonthValue(), today.getDayOfMonth());
        int daysElapsed = Day.daysBetween(birthDate, currentDate);

        System.out.println("days sicne birth: " + daysElapsed);

        SC.close();
    }
}
