package q1;

//************************************************************ 
// Guess.java // // Play a game where the user guesses a number from 1 to 10 
//
//************************************************************ 
import java.util.Scanner; 
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        //Number the user tries to guess
        int numToGuess; 
        //The user's guess
        int guess;
        
        int random;
        
        //randomly generate the number to guess 
        Random generator = new Random();
        random = generator.nextInt(10) + 1;
        
        Scanner scan = new Scanner(System.in); 
        //print message asking user to enter a guess 
        System.out.print("Guess a number between 1 and 10: ");
        
       //read in guess
        guess = scan.nextInt();
        
        //keep going as long as the guess is wrong 
        while (guess != random ) {
            
          //print message saying guess is wrong 
            System.out.println("Wrong number! ");
            
            if(guess > random){
                System.out.println("Guess lower: ");
            }
            else{
                System.out.println("Guess higher: ");
            }
 
            guess = scan.nextInt();
            
            
        } 
        //print message saying guess is right 
        System.out.println("Correct! ");
    } 
}