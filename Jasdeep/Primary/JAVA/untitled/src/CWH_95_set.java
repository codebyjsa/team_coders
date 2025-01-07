import java.util.HashSet;

public class CWH_95_set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(4);
        myHashSet.add(56);
        myHashSet.add(622);
        myHashSet.add(66);
        System.out.println(myHashSet);
    }
}
