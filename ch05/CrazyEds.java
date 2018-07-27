import java.util.Scanner;

public class CrazyEds
{
    public static void main(String[] args)
    {
        int oneInchCost = 2;
        int twoInchCost = 4;
        int threeInchCost = 6;

        int oneInchShip = 2;
        int twoInchShip = 2;
        int threeInchShip = 4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What size of cheese would you like to order?");
        int cheeseSize = scanner.nextInt();

        System.out.println("How many yards do you want to order?");
        int yards = scanner.nextInt();

        if (cheeseSize == 1 && yards > 50)
        {
            int sumOne = (yards * oneInchCost) + 5;
            System.out.println("Your total price, including delivery is: $" + sumOne);

        }

        else if (cheeseSize == 1 && yards <= 50)
        {
            int sumTwo = (yards * oneInchCost) + (yards * oneInchShip) + 5;
            System.out.println("Your total price, including delivery is: $" + sumTwo);
        }

        else if (cheeseSize == 2 && yards > 75)
        {
            int sumThree = (yards * twoInchCost) + 5;
            System.out.println("Your total price, including delivery is: $" + sumThree);
        }

        else if (cheeseSize == 2 && yards <= 75)
        {
            int sumFour = (yards * twoInchCost) + (yards * twoInchShip) + 5;
            System.out.println("Your total price, including delivery is: $" + sumFour);
        }

        else if (cheeseSize == 3 && yards > 25)
        {
            int sumFive = (yards * threeInchCost) + 5;
            System.out.println("Your total price, including delivery is: $" + sumFive);
        }

        else if (cheeseSize == 3 && yards <= 25)
        {
            int sumSix = (yards * threeInchCost) + (yards * threeInchShip);
            System.out.println("Your total price, including delivery is: $" +sumSix);
        }

        if (cheeseSize > 3)
        {
            System.out.println("We cannot process this order.");
        }
    }
}
