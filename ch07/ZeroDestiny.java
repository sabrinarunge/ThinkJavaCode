import java.util.Scanner;

public class ZeroDestiny
{
    public static void main(String[] args)
    {
        int nonZeroTimes = youMustEnterZero();
        System.out.println("You entered a number other than zero " + nonZeroTimes + " times");
    }

    public static int youMustEnterZero()
    {
        Scanner in = new Scanner(System.in);

        int numberEntered;
        int nonZeroCount = 0;

        do
        {
            System.out.println("Please enter a number:");
            numberEntered = in.nextInt();

            if (numberEntered != 0)
            {
                nonZeroCount++;
                System.out.println("You entered a number other than 0");
            }
        } while (numberEntered != 0);

        return nonZeroCount;
    }
}

