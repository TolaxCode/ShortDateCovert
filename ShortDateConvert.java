import java.util.Scanner;

public class ShortDateConvert {
    public static void main(String[] args) {
        // Step 1: Ask the user to enter a short date
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        // Step 2: Extract year, month, and day
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8, 10));

        // Step 3: Convert month number to month name using loop and conditions
        String monthName = getMonthName(month);

        // Step 4: Display the full date representation
        System.out.printf("%s %d, %d%n", monthName, day, year);
        scanner.close();
    }

    private static String getMonthName(int month) {
        // Array to map month numbers to month names
        String[] monthNames = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        // Check if the month number is within valid range using loop and conditions
        for (int i = 1; i <= 12; i++) {
            if (month == i) {
                return monthNames[i - 1]; // Adjusting for 0-based indexing
            }
        }
        return "Invalid Month";
    }
}

