public class MathUtil
{
    public static void main(String[] args)
    {
        double total = getTotal(12, 12);
        System.out.println(total);

        double volume = getCargoVolume(10.5, 12.5, 15.5, true);
        System.out.println(volume);

        double absValue = absoluteSum(-12, 12);
        System.out.println(absValue);

        double absoluteValue = absoluteSum(21, -10, -5);
        System.out.println(absoluteValue);
    }

    public static double getTotal (int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static double getCargoVolume (double height, double length, double depth, boolean heavyDuty)
    {
        double thickness = 0;
        if (heavyDuty == true)
        {
            thickness = .5;
        }

        else if (heavyDuty == false)
        {
            thickness = .25;
        }

        double interiorVolume = (height - (thickness * 2)) * (length - (thickness * 2)) * (depth - (thickness * 2));
        return interiorVolume;
    }

    public static int absoluteSum (int numberOne, int numberTwo)
    {
        int absoluteValue = (Math.abs(numberOne) + Math.abs(numberTwo));
        return absoluteValue;
    }

    public static int absoluteSum (int numberOne, int numberTwo, int numberThree)
    {
        int absoluteValue = (Math.abs(numberOne) + Math.abs(numberTwo) + Math.abs(numberThree));
        return absoluteValue;
    }
}
