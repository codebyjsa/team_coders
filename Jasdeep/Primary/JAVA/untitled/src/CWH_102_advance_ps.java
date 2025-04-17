import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CWH_102_advance_ps {
    public static void main(String[] args) {
//        Q1
//        ArrayList ar = new ArrayList<>();
//        for (int i=1; i<=10; i++){
//            ar.add("Student "+i);
//        }
//        for (Object a: ar){
//            System.out.println(a);
//        }

//        Q2
//        Date d= new Date();
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

//        Q3
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.DAY_OF_MONTH));

//        Q4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String mydate = dt.format(df);
        System.out.println(mydate);


//        Q5
//        HashSet<Integer> s= new HashSet<>();
//        for (int i=1; i<=10; i++){
//            s.add(i);
//        }
//        System.out.println(s);
    }
}
