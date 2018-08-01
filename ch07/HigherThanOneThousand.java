import java.util.Scanner;

public class HigherThanOneThousand
{
    public static void main(String[] args)
    {
        int total = getPastOneThousand();
        System.out.println("You entered a total of " + total);
    }

    public static int getPastOneThousand()
    {
        int runningTotal = 0;

        Scanner in = new Scanner(System.in);

        do
        {
            System.out.println("Please enter a number: ");
            int number = in.nextInt();
            runningTotal += number;
            System.out.println("Your total so far is " + runningTotal);
        } while (runningTotal <= 1000);



        return runningTotal;

    }
}
