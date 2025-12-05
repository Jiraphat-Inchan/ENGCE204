package Lab;

import java.util.Scanner;

public class Lab3_15 {

    public static class User {
        private String username;
        private int failedAttempts;
        private boolean isLocked;

        private static int maxAttempts = 3;

        public User(String username) {
            this.username = username;
            this.failedAttempts = 0;
            this.isLocked = false;
        }

        public static void setPolicy(int max) {
            if (max > 0) {
                maxAttempts = max;
                System.out.println("Policy updated.");
            } else {
                System.out.println("Invalid policy.");
            }
        }

        public String getUsername() {
            return username;
        }

        public boolean isLocked() {
            return isLocked;
        }

        public int getFailedAttempts() {
            return failedAttempts;
        }

        public void login(String password) {
            if (isLocked) {
                System.out.println("Account is locked.");
                return;
            }

            final String CORRECT_PASSWORD = "pass123";

            if (password.equals(CORRECT_PASSWORD)) {
                failedAttempts = 0;
                System.out.println("Login successful.");
            }
            else {
                failedAttempts++;

                if (failedAttempts >= maxAttempts) {
                    isLocked = true;
                    System.out.println("Login failed. Account locked.");
                } else {
                    int attemptsLeft = maxAttempts - failedAttempts;
                    System.out.println("Login failed. " + attemptsLeft + " attempts left.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        User user = new User(username);

        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String commandLine = scanner.nextLine();
            
            String[] parts = commandLine.split(" ", 2);
            String command = parts[0];

            if (command.equals("SET")) {
                if (parts.length > 1 && parts[1].startsWith("POLICY")) {
                    try {
                        String policyValueString = parts[1].substring("POLICY ".length()).trim();
                        int newMaxAttempts = Integer.parseInt(policyValueString);
                        User.setPolicy(newMaxAttempts);
                    } catch (NumberFormatException e) {
                        // Handle case where policy value is not a number, if necessary
                    }
                }
            } else if (command.equals("LOGIN")) {
                if (parts.length > 1) {
                    String password = parts[1];
                    user.login(password);
                }
            }
        }

        scanner.close();
    }
}
