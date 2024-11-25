package HW5.Package;

public class Day {
    int year;
    int month;
    int day;

    public Day(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public int daysInMonth() {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 0;
        }
    }

    public int totalDays() {
        int totalDays = 0;

        for (int y = 0; y < year; y++) {
            totalDays += 365; 
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                totalDays += 1; 
            }
        }

        for (int m = 1; m < month; m++) {
            Day tempDay = new Day(year, m, 1);
            totalDays += tempDay.daysInMonth();
        }

        totalDays += day;

        return totalDays;
    }

    public static int daysBetween(Day day1, Day day2) {
        return Math.abs(day1.totalDays() - day2.totalDays());
    }
}