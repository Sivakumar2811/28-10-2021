package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeDate_print_check_given_timedate {
    public static void main(String[] args) throws ParseException {
        String d,t;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date is format dd/mm/yyyy :");
        d=sc.next();

        System.out.print("Enter the time is format hh:mm :");
        t=sc.next();

        Date cdate = new Date();
        Date ctime = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat tf = new SimpleDateFormat("h:m:s");
        Date gdate = new SimpleDateFormat("dd/MM/yyyy").parse(d);
        Date gtime = new SimpleDateFormat("h:m").parse(t);

        System.out.print("Current Date :");
        System.out.println(df.format(gdate));
        System.out.print("Current Time :");
        System.out.println(tf.format(ctime));


        if (gdate.compareTo(cdate)>0)
        {
            System.out.println("Greater than current Date");
        }
        else if (gdate.compareTo(cdate)<0)
        {
            System.out.println("Less than current Date");
        }
        else
        {
            if (gtime.compareTo(ctime)>0)
            {
                System.out.println("Greater than current time");
            }
            else if (gtime.compareTo(ctime)<0)
            {
                System.out.println("Less than current time");
            }
            else
            {
                System.out.println("Given date & time are same has current date & time");
            }
        }
    }
}
