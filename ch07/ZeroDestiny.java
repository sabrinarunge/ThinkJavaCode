import java.util.Scanner;

public class ZeroDestiny
{
    public static void main(String[] args)
    {
        int nonZeroCount = youMustEnterZero();
        System.out.println("You entered a number other than zero " + nonZeroCount + " times.");

    }

    public static int youMustEnterZero()
    {
        Scanner in = new Scanner(System.in);

        int numberEntered;
        int count = 0;

        do
        {
            System.out.println("Please enter a number:");
            numberEntered = in.nextInt();

            if (numberEntered != 0)
            {
                count++;
            }
        } while (numberEntered != 0);


        return count;
    }
}

