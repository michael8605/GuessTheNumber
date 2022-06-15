import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args){

        boolean play = true;

        while(play){
            String greeting = "Hello! What is you name?";
            System.out.println(greeting);

            Scanner getName = new Scanner(System.in);
            String name = getName.nextLine();
            String rules = "Well, " +name+ " I am thinking of a number between 1 and 20. \n Take a guess.";
            System.out.println(rules);
            Scanner getGuess = new Scanner(System.in);
            int guess = Integer.parseInt(getGuess.nextLine());

            Random rand = new Random();
            int number= rand.nextInt(20)+1;
            System.out.println(number);

            int tries =1;

            while (tries<=6){
                if(guess == number){
                    System.out.println(" Good job, "+ name +"! You guessed my number in " + tries + " guesses!");
                    break;
                } else if (guess <number) {
                    System.out.println("Your guess is too low. Try Again");
                    tries++;
                    Scanner getGuesses = new Scanner(System.in);
                    guess = Integer.parseInt(getGuesses.nextLine());
                } else if (guess > number) {
                    System.out.println("Your guess is too high. Try Again");
                    tries++;
                    Scanner getGuesses = new Scanner(System.in);
                    guess = Integer.parseInt(getGuesses.nextLine());
                }

            }
            System.out.println("Would you like to play again?(y or n)");
            Scanner getReset = new Scanner(System.in);
            String reset = getReset.nextLine();

            if ( reset.equals("y")){
                play = true;
            } else {
                play = false;
                System.out.println("See you next time");
            }
        }

    }
}
