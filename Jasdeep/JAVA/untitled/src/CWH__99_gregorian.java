import java.util.Calendar;
import java.util.TimeZone;

public class CWH__99_gregorian {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(TimeZone.getAvailableIDs()[0]);
    }
}
