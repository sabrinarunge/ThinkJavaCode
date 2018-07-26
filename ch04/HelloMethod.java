public class HelloMethod
{
    public static void main(String[] args)
    {
        String firstName = "Fred";
        String secondName = "Wilma";
        String lastName = "Flintstone";

        printHelloWorld(firstName, lastName);
        printHelloWorld(secondName, lastName);
        printOhNo();
    }

    public static void printHelloWorld (String fName, String lName)

    {
        System.out.println("Hello World " + fName + " " + lName);
    }

    public static void printOhNo()
    {
        System.out.println("Oh noooooooo!");
    }

}
