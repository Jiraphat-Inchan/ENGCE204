package Lab;
 
import java.util.Scanner;

class User {
    private String password;

    public User(String initialPassword) {
        this.password = initialPassword;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialPassword = scanner.nextLine();

        User user = new User(initialPassword);

        String newPassword = scanner.nextLine();

        user.setPassword(newPassword);

        System.out.println(user.getPassword());

        scanner.close();
    }
}
