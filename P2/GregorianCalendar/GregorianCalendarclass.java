import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarclass

{
public static void main(String [] args)

{
GregorianCalendar cal = new GregorianCalendar();
GregorianCalendar mybirthday = new GregorianCalendar(1996, Calendar.DECEMBER, 4);
cal.add(Calendar.DAY_OF_MONTH, 100);

int dayOFMonth = cal.get(Calendar.DAY_OF_MONTH);
int month = cal.get(Calendar.MONTH);
int year = cal.get(Calendar.YEAR);
int weekday = mybirthday.get(Calendar.DAY_OF_WEEK);
//System.out.print("100 days from today: ");
System.out.println("100 days from today: " + month + "/" + dayOFMonth + "/" + cal.get(Calendar.YEAR));
System.out.println("The week of my birthday: " + weekday);

mybirthday.add(Calendar.DAY_OF_MONTH, 10000);

int dayOFMonth1 = mybirthday.get(Calendar.DAY_OF_MONTH);
int month1 = mybirthday.get(Calendar.MONTH);
int year1 = mybirthday.get(Calendar.YEAR);
int weekday1 = mybirthday.get(Calendar.DAY_OF_WEEK);

System.out.println("10k days after my birth: " + month1 + "/" + dayOFMonth1 + "/" + year1);
}



}