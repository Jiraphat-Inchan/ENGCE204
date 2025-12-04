package Lab;

import java.util.Scanner;

class Player {
    private int score;

    public Player(int initialScore) {
        this.score = initialScore;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points; 
    }

}

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialScore = scanner.nextInt();

        int pointsToAdd = scanner.nextInt();

        Player player = new Player(initialScore);


        player.addScore(pointsToAdd);

        System.out.println(player.getScore());

        scanner.close();
    }
}
