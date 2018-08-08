public class Time
{
    private int hour;
    private int minute;

    public Time(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public String getMilitaryTime()
    {
       String militaryTime = "";
       militaryTime += hour;
       militaryTime += ":";
       if (minute <= 9)
       {
           militaryTime += "0";
       }
       militaryTime += minute;

       return militaryTime;
    }

    public String getTime()
    {
        String regularTime = "";
        if (hour > 12)
        {
            hour -= 12;
            regularTime += hour;
            regularTime += ":";
            regularTime += minute;
            regularTime += " PM";
        }

        else if (hour == 12)
        {
            regularTime += hour;
            regularTime += ":";
            regularTime += minute;
            regularTime += " PM";
        }

        else if (hour < 12)
        {
            regularTime += hour;
            regularTime += ":";
            regularTime += minute;
            regularTime += " AM";
        }


        return regularTime;
    }

    public Time(int hour, int minute, boolean pm)
    {
        if (pm)
        {
            this.hour = hour + 12;
        }

        else
        {
            this.hour = hour;
        }

        this.minute = minute;
    }
}
