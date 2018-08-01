public class MultiplicationTable
{
    public static void main(String[] args)
    {
        System.out.print("\t\t");
        for (int column = 1; column <= 5; column++)
        {
            System.out.print(column + "\t");
        }

        System.out.println();

        System.out.print("\t");
        for (int column = 1; column <= 5; column++)
        {
            System.out.print("----");
        }

        System.out.println();

        for (int row = 1; row <= 5; row++)
        {
            System.out.print(row + "\t|\t");

            for (int column = 1; column <= 5; column++)
            {
                System.out.print(row * column + "\t");
            }

            System.out.println();
        }

    }
}
