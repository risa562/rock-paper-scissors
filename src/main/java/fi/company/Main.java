
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
            playerChoice = Integer.parseInt(s.nextLine());
            computerChoice = (int) (Math.random() * 3 + 1);
            System.out.println(available[playerChoice - 1] + " vs " + available[computerChoice - 1]);
            if (playerChoice == computerChoice) {
                System.out.println("It´s a draw!");
            } else if (playerChoice == computerChoice - 2 || playerChoice == computerChoice + 1) {
                System.out.println("Player wins the round!");
                pv++;
            } else if (playerChoice == computerChoice - 1 || playerChoice == computerChoice + 2) {
                System.out.println("Computer wins the round!");
                cv++;
            }
        }

    }
}