import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String mydate = dt.format(df);
        System.out.println(mydate);
    }
}
