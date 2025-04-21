import java.util.*;

public class CWH_91_arraylist_java {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(2);
        l1.add(6);
        l1.add(4);
        l1.add(5);
        l1.add(0, 6);
        l1.add(0, 7);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}
