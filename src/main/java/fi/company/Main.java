
package fi.company;
import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1) rock, 2) paper, 3) scissors?");
        int choice = Integer.parseInt(s.nextLine());
        int computerChoice = .... // random stuff
        if(choice == 1 && computerChoice == 2) {
            System.out.println("computer won");
        } ...
    }
}