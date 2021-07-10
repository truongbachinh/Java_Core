package Format;

import java.text.NumberFormat;
import java.util.Locale;

import static java.math.RoundingMode.HALF_UP;

public class Format_Money {
    public static void main(String[] args) {
        double l =  123456789.234;
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        numberFormat.setRoundingMode(HALF_UP);
        System.out.println(numberFormat.format(l));

        NumberFormat numberFormat1 = NumberFormat.getInstance(locale);
        System.out.println(numberFormat1.format(l));

    }
}

