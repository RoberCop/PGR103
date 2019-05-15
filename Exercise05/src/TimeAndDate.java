import java.util.Scanner;

public class TimeAndDate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int input = sc.nextInt();
        
        Time timeObj = convertSeconds(5999);
        System.out.println(timeObj.hours + ":" + timeObj.minutes + ":" + timeObj.seconds);
    
        System.out.println("Using printDate:");
        Date dateObj = new Date(5, 5, 2020);
        printDate(dateObj);
        
        Date date1Obj = new Date(20, 1, 21);
        Date date2Obj = new Date(5, 9, 1550);
        
        System.out.println("Days difference between date 1 and date 2:");
        System.out.println(dayDiff(date1Obj, date2Obj));
    }
    
    private static Time convertSeconds(int seconds)
    {
        Time t = new Time();
        
        t.hours = seconds / 3600;
        seconds %= 3600;
        
        t.minutes = seconds / 60;
        seconds %= 60;
        
        t.seconds = seconds;
    
        return t;
    }
    
    private static void printDate(Date d)
    {
        System.out.println(d.day + ":" + d.month + ":" + d.year);
    }
    
    private static int dayDiff(Date d1, Date d2)
    {
        return Math.abs(daysSince0(d1) - daysSince0(d2));
    }
    
    private static int daysSince0(Date d)
    {
        int days = d.year * 365 + d.day - 1;
        int lastYear = d.year - 1;
        
        if (d.year > 0)
        {
            days += (lastYear / 4) - (lastYear / 100) + (lastYear / 400) + 1;
        }
        
        for (int i = 1; i < d.month; i++)
        {
            days += (i < 8) ?
                (i % 2 != 0) ? 31 : (i == 2) ? 28 : 30
              : (i % 2 == 0) ? 31 : 30;
        }
    
        if ((d.month > 2) && (d.year % 4 == 0) && (d.year % 100 != 0 || d.year % 400 == 0)) days++;
        
        return days;
    }
}

class Time
{
    int hours;
    int minutes;
    int seconds;
}

class Date
{
    int day;
    int month;
    int year;
    
    Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
}
