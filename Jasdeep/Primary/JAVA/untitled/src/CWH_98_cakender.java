import java.util.Calendar;

public class CWH_98_cakender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
