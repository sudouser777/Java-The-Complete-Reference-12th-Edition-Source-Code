// Use arguments indexes to simplify the 
// creation of a custom time and date format. 

import java.util.Calendar;
import java.util.Formatter;

class FormatDemo6 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        fmt.format("Today is day %te of %<tB, %<tY", cal);
        System.out.println(fmt);
        fmt.close();
    }
}
