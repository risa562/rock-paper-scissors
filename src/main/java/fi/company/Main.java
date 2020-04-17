
package fi.company;
import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        // initializing integers
        int playerScore = 0;
        int computerScore = 0;
        int playerChoice = 0;
        int computerChoice = 0;

        //initializing string array for easier printing
        String[] available = {"rock", "paper", "scissors"};

        System.out.println("Rock Paper Scissors v1.03");

        //main game loop works until someone gets three points (best out of five)
        while (playerScore < 3 && computerScore < 3) {
            System.out.println("1) rock, 2) paper, 3) scissors?");

            //parseint is inside the 'try' block for exception handling purposes
            try {
            playerChoice = Integer.parseInt(s.nextLine());
            computerChoice = (int) (Math.random() * 3 + 1);
                System.out.println(available[playerChoice - 1] + " vs " + available[computerChoice - 1]);
            }
            //if player outputs values lesser or greater than 1-3
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Choose between 1-3!");
                continue;
            }
            //if player outputs something else than numbers
            catch (NumberFormatException e) {
                System.out.println("Numbers only! Choose between 1-3;");
                continue;
            }
            //if both players pick the same choice, the round ends in a draw
            if (playerChoice == computerChoice) {
                System.out.println("It´s a draw!");
                System.out.println("Current score: " + playerScore + " vs " + computerScore);

            //check if the player picked favorably against the computer by comparing their choices.
            //player is smaller by two (1 vs 3 which equals rock vs scissors) or
            //player is greater by one (2 vs 1 or 3 vs 2 which equal paper vs rock or scissors vs paper)
            } else if (playerChoice == computerChoice - 2 || playerChoice == computerChoice + 1) {

            //player gains a point
                System.out.println("Player wins the round!");
                playerScore++;
                System.out.println("Current score: " + playerScore + " vs " + computerScore);

            //and now check if the player picked unfavorably against the computer
            //player is smaller by one (1 vs 2 or 2 vs 3 which equals rock vs paper or paper vs scissors) or
            //player is greater by two (1 vs 3 which equals rock vs paper)
            } else if (playerChoice == computerChoice - 1 || playerChoice == computerChoice + 2) {
                System.out.println("Computer wins the round!");

            //computer gains a point
                computerScore++;
                System.out.println("Current score: " + playerScore + " vs " + computerScore);
            }
        }
        //checking the winner
        if (playerScore == 3) {
            System.out.println("Player wins the game! Congratulations!");
        } else {
            System.out.println("Computer wins the game! Better luck next time!");
        }
    }
}