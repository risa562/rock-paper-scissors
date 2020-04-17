
package fi.company;
import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int pv = 0;
        int cv = 0;
        int playerChoice = 0;
        int computerChoice = 0;
        String[] available = {"rock", "paper", "scissors"};
        while (pv < 3 && cv < 3) {
            System.out.println("1) rock, 2) paper, 3) scissors?");
            try {
            playerChoice = Integer.parseInt(s.nextLine());
            computerChoice = (int) (Math.random() * 3 + 1);
                System.out.println(available[playerChoice - 1] + " vs " + available[computerChoice - 1]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Choose between 1-3!");
                continue;
            }
            catch (NumberFormatException e) {
                System.out.println("Numbers only! Choose between 1-3;");
                continue;
            }
            if (playerChoice == computerChoice) {
                System.out.println("It´s a draw!");
                System.out.println("Current score: " + pv + " vs " + cv);
            } else if (playerChoice == computerChoice - 2 || playerChoice == computerChoice + 1) {
                System.out.println("Player wins the round!");
                pv++;
                System.out.println("Current score: " + pv + " vs " + cv);
            } else if (playerChoice == computerChoice - 1 || playerChoice == computerChoice + 2) {
                System.out.println("Computer wins the round!");
                cv++;
                System.out.println("Current score: " + pv + " vs " + cv);
            }
        }
        if (pv == 3) {
            System.out.println("Player wins the game! Congratulations!");
        } else {
            System.out.println("Computer wins the game! Better luck next time!");
        }
    }
}