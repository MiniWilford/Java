// Magic 8 Ball Program, simple logic test
import java.util.random.*; //random for more 'true' randomness
import java.util.Scanner; //scanner for input from user

public class MagicEightBall { 
    public static void main(String[] args) {
        //Welcome!
        System.out.println("Welcome to Magic 8 Ball!\n");

        // Ask user for what they want to ask for the 8 ball then use a Switch statement to determine 1-8 response. 
        // Side-note: Possibly add a while(true) statement / if statement, possible for() could be faster for build time.
        
        boolean running = true; // true if program is running, false if user exits program.
        while(running) {
            //Ask user if they wish to continue
            System.out.println("Would you like to play 8-ball? [Y]es / [N]o" + "\n");

            // Get user input to continue game
            Scanner response = new Scanner(System.in);
            System.out.println("You have responded to " + response);

            //if-else statements for user input and checking if valid
        }
    }
}