public class LoopPractice
{
    public static void main(String[] args)
    {
        System.out.println("Start While Loop");
        whileOneToTen();
        System.out.println("End While Loop");
        System.out.println("Start Do While Loop");
        doWhileOneToTen();
        System.out.println("End Do While Loop");
        System.out.println("Start For Loop");
        forOneToTen();
        System.out.println("End For Loop");
        System.out.println("Start Second While Loop");
        whileTenToOne();
        System.out.println("End Second While Loop");
        System.out.println("Start Second Do While Loop");
        doWhileTenToOne();
        System.out.println("End Second Do While Loop");
        System.out.println("Start Second For Loop");
        forTenToOne();
        System.out.println("End Second For Loop");
        System.out.println("Start Third While Loop");
        whileByTens();
        System.out.println("End Third While Loop");
        System.out.println("Start Third Do While Loop");
        doWhileByTens();
        System.out.println("End Third Do While Loop");
        System.out.println("Start Third For Loop");
        forByTens();
        System.out.println("End Third For Loop");

    }

    public static void forOneToTen()
    {
        for (int k = 1; k <= 10; k++)
        {
            System.out.println(k);
        }

    }

    public static void whileOneToTen()
    {
        int i = 0;
        while (i < 10)
        {
            i++;
            System.out.println(i);
        }
    }

    public static void doWhileOneToTen()
    {
        int j = 1;
        do
        {
            System.out.println(j);
            j++;
        } while (j <= 10);


    }

    public static void forTenToOne()
    {
        for (int k = 10; k > 0; k--)
        {
            System.out.println(k);
        }
    }

    public static void whileTenToOne()
    {
        int i = 11;
        while (i > 1)
        {
            i--;
            System.out.println(i);
        }

    }

    public static void doWhileTenToOne()
    {
        int j = 10;
        do
        {
            System.out.println(j);
            j--;
        } while (j > 0);
    }

    public static void forByTens()
    {
        for (int k = 0; k <= 100; k += 10)
        {
            System.out.println(k);
        }
    }

    public static void whileByTens()
    {
        int i = -10;
        while (i < 100)
        {
            i += 10;
            System.out.println(i);
        }
    }

    public static void doWhileByTens()
    {
        int j = 0;
        do
        {
            System.out.println(j);
            j += 10;
        } while (j <= 100);

    }
}
