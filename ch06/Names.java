public class Names
{
    public static void main(String[] args)
    {
        String returnValue = getMyName();
        System.out.println(returnValue);
        String myFancyName = getMyFancyName("*!*");
        System.out.println(myFancyName);

    }

    public static String getMyName()
    {
        return "Sabrina";
    }

    public static String getMyFancyName(String nameDecoration)
    {
        String fancyName = nameDecoration + "Sabrina" + nameDecoration;
        return fancyName;
    }
}
