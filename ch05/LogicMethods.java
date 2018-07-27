public class LogicMethods
{
    public static void main(String[] args)
    {
        int num = 102;
        printIsLarge(num);
        printIsLargeOrSmall(num);
        printLargest(2, 4);
    }

    public static void printIsLarge(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large");
        }

    }

    public static void printIsLargeOrSmall(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large");
        }

        else if (number < 10)
        {
            System.out.println("The number is small");
        }
    }

    public static void printLargest(int number1, int number2)
    {
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        if (number1 > number2)
        {
            System.out.println("The largest number is: " + number1);
        }

        else if (number1 < number2)
        {
            System.out.println("The largest number is: " + number2);
        }

        else if (number1 == number2)
        {
            System.out.println("The numbers are equal");
        }
    }
}
