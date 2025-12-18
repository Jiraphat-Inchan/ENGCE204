import java.util.Scanner;

class Subscription {
    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        this.planName = planName;
        if (durationDays < 0) {
            this.durationDays = 0;
        } else {
            this.durationDays = durationDays;
        }
    }

    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + maxDuration);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int newDays = this.durationDays + days;
        if (newDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.planName, newDays);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            Subscription.setMaxDuration(sc.nextInt());
        }

        if (sc.hasNext()) {
            String name = sc.next();
            int initialDays = sc.nextInt();
            Subscription sub = new Subscription(name, initialDays);

            if (sc.hasNextInt()) {
                int ext1 = sc.nextInt();
                sub = sub.extend(ext1);
            }

            if (sc.hasNextInt()) {
                int ext2 = sc.nextInt();
                sub = sub.extend(ext2);
            }

            sub.displayInfo();
        }

        sc.close();
    }
}
