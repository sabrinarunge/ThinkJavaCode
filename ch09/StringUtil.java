public class StringUtil
{
    public static void main(String[] args)
    {
        String one = "Hello";
        String two = "Goodbye";
        String three = "501-555-0100";
        String four = "Finn";
        String five = "Jake";

        System.out.println(getFirstCharacter(one));
        System.out.println(getLastCharacter(two));
        System.out.println(getFirstTwoCharacters(one));
        System.out.println(getLastTwoCharacters(one));
        System.out.println(getAllButFirstThreeCharacters(two));
        printCharacters(one);
        printPhoneNumber(three);
        System.out.println(findFirstE(two));
        System.out.println(isFinn(five));
    }

    public static char getFirstCharacter(String s)
    {
        return s.charAt(0);
    }

    public static char getLastCharacter(String s)
    {
        return s.charAt(s.length() - 1);
    }

    public static String getFirstTwoCharacters (String s)
    {
        return s.substring(0, 2);
    }

    public static String getLastTwoCharacters(String s)
    {
        return s.substring(s.length() - 2);
    }

    public static String getAllButFirstThreeCharacters(String s)
    {
        return s.substring(3);
    }

    public static void printCharacters(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i) + " : " + i);
        }
    }

    public static void printPhoneNumber(String s)
    {
        System.out.println("Area Code: " + s.substring(0, 3) + " Exchange: " + s.substring(4, 7) + " Line Number: " + s.substring(8));
    }

    public static int findFirstE(String s)
    {
        return s.indexOf('e');
    }

    public static boolean isFinn(String s)
    {
        return (s.equals("Finn"));
    }

}
