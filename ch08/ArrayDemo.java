public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] someNumbers = new int[3];
        someNumbers[0]= 1;
        someNumbers[1]= 5;
        someNumbers[2]= 9;

        int[] someMoreNumbers = new int[5];
        someMoreNumbers[0]= 5;
        someMoreNumbers[1]= 2;
        someMoreNumbers[2]= 9;
        someMoreNumbers[3]= 8;
        someMoreNumbers[4]= 0;

        double[] evenMoreNumbers = new double[4];
        evenMoreNumbers[0]= 34.2;
        evenMoreNumbers[1]= 18.0;
        evenMoreNumbers[2]= 12.5;
        evenMoreNumbers[3]= 13.1;

        int[] tenNumbers = new int[10];
        tenNumbers[0]= 4;
        tenNumbers[3]= 2;
        tenNumbers[9]= 4;

        String[] someValues = new String[10];
        someValues[0]= "Hi";
        someValues[3]= "Hello";
        someValues[9]= "Bye";


        printArray(someMoreNumbers);
        int total = arrayTotal(someNumbers);
        System.out.println("The total is: " + total);

        int highestNum = arrayMax(someNumbers);
        System.out.println("The highest number is: " + highestNum);

        int indexOfMax = arrayMaxIndex(someMoreNumbers);
        System.out.println("The index of the maximum number is: " + indexOfMax);

        double averageArray = arrayAverage(evenMoreNumbers);
        System.out.println("The average of the values is: " + averageArray);

        printArray(tenNumbers);
        printArray(someValues);


    }

    public static void printArray(int[] numbers)
    {
        for (int number : numbers)
        {
            System.out.println(number);
        }
    }

    public static int arrayTotal(int[] numbers)
    {
        int sum = 0;

        for (int number : numbers)
        {
            sum = sum + number;
        }

        return sum;
    }

    public static int arrayMax(int[] numbers)
    {
        int highestNumber = 0;

        for (int number : numbers)
        {
            if (number > highestNumber)
            {
                highestNumber = number;
            }

        }

        return highestNumber;
    }

    public static int arrayMaxIndex(int[] numbers)
    {
        int highestNumber = 0;
        int maxIndex = 0;

        int currentIndex = 0;

        for (int number : numbers)
        {
            if (number > highestNumber)
            {
                highestNumber = number;
                maxIndex = currentIndex;
            }

            currentIndex++;
        }

        return maxIndex;
    }

    public static double arrayAverage(double[] numbers)
    {
        double sum = 0;
        double average = 0;

        for (double number : numbers)
        {
            sum += number;
        }

        for (double number : numbers)
        {
            average = sum / numbers.length;
        }

        return average;
    }

    public static void printArray(String[] values)
    {
        for (String value : values)
        {
            System.out.println(value);
        }
    }
}
