import java.util.ArrayDeque;

public class CWH_93_Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}