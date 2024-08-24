package JavaLatestFeatures;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Caleneder_Date {
    public static void main(String[] args) {

        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(sf.format(calendar.getTime()));
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.AM_PM));

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.MAY));




    }
}
