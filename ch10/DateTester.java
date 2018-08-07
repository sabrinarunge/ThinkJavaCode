public class DateTester
{
    public static void main(String[] args)
    {
        Date currentDate = new Date(7, 8, 2018);

        System.out.print(currentDate.getDay() + " ");
        System.out.print(currentDate.getMonth() + " ");
        System.out.println(currentDate.getYear());
        System.out.println(currentDate.getFormattedDate());
    }
}
