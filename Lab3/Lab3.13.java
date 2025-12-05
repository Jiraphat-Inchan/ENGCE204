package Lab;

import java.util.Scanner;

class LicenseManager {
    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    private LicenseManager() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated.");
    }

    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
        } else if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
        } else {
            maxLicenses = max;
            System.out.println("Max licenses set to " + maxLicenses);
        }
    }

    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available");
            return false;
        }
    }

    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus() {
        int availableLicenses = maxLicenses - usedLicenses;
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + availableLicenses);
    }
}

public class Lab3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            if (!scanner.hasNextLine()) {
                break;
            }
            
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0];

            switch (command) {
                case "SET":
                    if (parts.length > 1) {
                        try {
                            int newMax = Integer.parseInt(parts[1]);
                            LicenseManager.setMax(newMax);
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Invalid number format for SET command.");
                        }
                    } else {
                        System.out.println("Error: SET command requires a value.");
                    }
                    break;
                case "CHECKOUT":
                    LicenseManager.checkOut();
                    break;
                case "CHECKIN":
                    LicenseManager.checkIn();
                    break;
                case "STATUS":
                    LicenseManager.displayStatus();
                    break;
                default:
                    System.out.println("Unknown command: " + command);
            }
        }
        
        scanner.close();
    }
}
