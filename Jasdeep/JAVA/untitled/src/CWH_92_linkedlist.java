import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;


public class CWH_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
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
