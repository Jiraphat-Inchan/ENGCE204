package Lab;

import java.util.Scanner;

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputUsername = scanner.nextLine();

        User userObject = new User(inputUsername);

        System.out.println(userObject.getUsername());

        scanner.close();
    }
}
