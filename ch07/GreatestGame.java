import java.util.Random;
import java.util.Scanner;

public class GreatestGame
{
    public static void main(String[] args)
    {
       guessingGame();
    }

    public static void guessingGame()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.next();

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Enter your guess.");
        int guess = scanner.nextInt();

        int numberOfGuesses = 0;
        int numberOfGames = 0;

        do
        {

            if (guess < randomNumber)
            {
                numberOfGuesses++;
                System.out.println("Your guess is too low. Try again");
                guess = scanner.nextInt();
            }

            else if (guess > randomNumber)
            {
                numberOfGuesses++;
                System.out.println("Your guess is too high. Try again");
                guess = scanner.nextInt();

            }

            if (guess == randomNumber)
            {
                numberOfGames++;
                numberOfGuesses++;
                System.out.println("You won! Congratulations " + name + ". " + "You guessed " + numberOfGuesses + " times. You have played " + numberOfGames + " games and your average number of guesses per game is ____. Do you want to play again? Enter another number.");
                randomNumber = random.nextInt(100) + 1;
                guess = scanner.nextInt();
                numberOfGuesses = 1;


                if (guess < randomNumber)
                {
                    System.out.println("Your guess is too low. Try again");
                    guess = scanner.nextInt();

                }

                else if (guess > randomNumber)
                {
                    System.out.println("Your guess is too high. Try again");
                    guess = scanner.nextInt();

                }
            }


        } while (guess > randomNumber || guess < randomNumber);

    }
}
