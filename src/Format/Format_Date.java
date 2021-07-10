package Format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_Date {
    public static void main(String[] args) {
        String patter = "dd-MM-yyyy";

        String patter2 = "EEEE, HH:mm:ss a, dd-MMMM-yyyy";
        SimpleDateFormat  formatData = new SimpleDateFormat(patter2);
        System.out.println(formatData.format(new Date()));

        String date = "12-12-2020";
        try {
            SimpleDateFormat format = new SimpleDateFormat(patter);
            Date date1 = format.parse(date);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
