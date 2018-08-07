public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public String getFormattedDate()
    {
        String formattedDate = "" + year;
        formattedDate += "-";
        if (month <= 9)
        {
            formattedDate += "0";
        }
        formattedDate += month;
        formattedDate += "-";
        if (day <= 9)
        {
            formattedDate += "0";
        }
        formattedDate += day;

        return formattedDate;
    }
}
