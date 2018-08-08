public class TimeTester
{
    public static void main(String[] args)
    {
        Time currentTime = new Time(9,45);
        Time secondTime = new Time(14, 30);
        System.out.println(currentTime.getMilitaryTime());
        System.out.println(secondTime.getMilitaryTime());
        System.out.println(currentTime.getTime());
        System.out.println(secondTime.getTime());
    }
}
