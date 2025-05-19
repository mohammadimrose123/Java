package Assignment;

import java.util.Scanner;

public class alaram_clock {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Display menu
        System.out.println("Alarm Clock Menu:");
        System.out.println("1. Set Alarm Time");
        System.out.println("2. Turn Alarm On");
        System.out.println("3. Turn Alarm Off");
        System.out.println("4. Snooze");
        System.out.println("Enter your choice (1-4): ");
        int choice = in.nextInt();

        // plz choose the time
        switch (choice) {
            case 1:
                System.out.println("Enter hours (0-23): ");
                int hours = in.nextInt();
                System.out.println("Enter minutes (0-59): ");
                int minutes = in.nextInt();
                if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
                    System.out.printf("Alarm set for %02d:%02d\n", hours, minutes);
                } else {
                    System.out.println("Invalid time entered.");
                }
                break;
            case 2:
                System.out.println("Alarm is ON");
                break;
            case 3:
                System.out.println("Alarm is OFF");
                break;
            case 4:
                System.out.println("Snooze activated for 5 minutes");
                break;
            default:
                System.out.println("Invalid choice. Please select 1-4.");
        }

        in.close();
    }
}
