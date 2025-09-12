import java.util.Scanner;

public class CalendarProgram {

    // Array for month names
    static String[] months = { "", "January", "February", "March", "April", "May", "June",
                                  "July", "August", "September", "October", "November", "December" };

    // Array for days in each month
    static int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Check leap year
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Zeller’s Congruence to find first day of month
    static int getFirstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        return d0; // 0=Sunday, 1=Monday, etc.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
            return;
        }

        // Adjust days for leap year
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        } else {
            daysInMonth[2] = 28;
        }

        int firstDay = getFirstDay(month, year);

        // Print calendar
        System.out.println("\n   " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces before first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%4d", day);
            if (((day + firstDay) % 7 == 0) || day == daysInMonth[month])
                System.out.println();
        }
    }
}
