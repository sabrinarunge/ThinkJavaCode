import java.util.Scanner;

public class PetNames
{
    public static void main(String[] args)
    {
        receivePetNames();

    }

    public static void receivePetNames()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many pets do you have? ");
        int numberOfPets = in.nextInt();
        in.nextLine();

        String[] petNames = new String[numberOfPets];

        for (int i = 0; i < numberOfPets; i++)
        {
            System.out.println("What is the name of your pet?");
            petNames[i] = in.next();
        }

        for (String value : petNames)
        {
            System.out.println(value);
        }
    }
}
