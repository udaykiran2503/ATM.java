import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber, guess, guessCount;
        char play='y';

        while(play == 'y'){
            randomNumber = rand.nextInt(100);
            System.out.println("Guess a number between 0 and 100");
            guess = -1;
            guessCount = 0;
            while (guess != randomNumber) {
                System.out.print("Enter your guess : ");
                guess = scanner.nextInt();
                guessCount++;
                if (guess == randomNumber) {
                    System.out.println("Congratulation, the number was :" + randomNumber);
                    System.out.println("It took you " + guessCount + " tries");
                } else if (guess > randomNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low");
                }
            }
            System.out.printf("Play again (y/n)? ");
            play = scanner.next().charAt(0);
        }
    }
}