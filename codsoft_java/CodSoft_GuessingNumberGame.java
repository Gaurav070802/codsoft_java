

import java.util.Scanner;

class GuessingNumberGame {
    public static void numberGame() {
        Scanner sc = new Scanner(System.in);
        String playAgain = "";
        do {
            int randomNumber = 1 + (int) (100 * Math.random());
            int tryCount = 0;
            int trails = 6;
            int i, userguess;
            System.out.println("You can choose a Number between (1-100). " + " You have multiple rounds to Win!!! "
                    + " Limit of each trial in a round is 6.");
            for (i = 0; i < trails; i++) {
                System.out.print("Guess The Number : ");
                userguess = sc.nextInt();
                tryCount++;
                if (randomNumber == userguess) {
                    System.out.println("Correct!!! You guessed it absolutely right!!! ");
                    System.out.println(" It took you " + tryCount + " tries");
                    break;
                } else if (randomNumber > userguess && i != trails - 1) {
                    System.out.println("Nope! The Number Is Higher Than " + userguess + " Guess Again...");
                } else if (randomNumber < userguess && i != trails - 1) {
                    System.out.println("Nope! The Number Is Lower Than " + userguess + " Guess Again...");
                }
            }
            if (i == trails) {
                System.out.println("You Have Exhausted 6 trails");
                System.out.println("The Random number was : " + randomNumber);
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("y"));
    }

    public static void main(String[] args) {
        numberGame();
    }
}
