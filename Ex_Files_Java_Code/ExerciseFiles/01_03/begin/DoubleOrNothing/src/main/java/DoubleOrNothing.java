import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

    public void playGame() {
        int points = 10;
        Random r = new Random();
        boolean continuePlaying = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (continuePlaying) {
            
                System.out.println("You have " + points + " points.");
                System.out.println("Press [Y] if you'd like to double it, or [N] to keep your current points"); 

                String userInput = scanner.nextLine();
                switch (userInput.toUpperCase()) {
                    case "Y":
                        System.out.println("You chose to double");
                        if (r.nextBoolean()) {
                            points *= 2;
                            System.out.println("YOU DOUBLED! You now have " + points + " points");
                        } else {
                            System.out.println("You LOST everything!");
                            System.out.println("You had " + points + " points. You have finished the game!");
                            continuePlaying = false;
                        }
                        break;

                    case "N":
                        System.out.println("You chose to keep your current points.");               
                        System.out.println("Your total points is " + points + " points. You have finished the game!");
                        continuePlaying = false;
                        break;
                    default: 
                        System.out.println("Wrong option, please enter [Y] or [N]");
                        break;

                }
            }       
            
        }
        
    }
}