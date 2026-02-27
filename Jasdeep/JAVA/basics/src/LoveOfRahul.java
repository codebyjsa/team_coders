import java.util.Scanner;

public class LoveOfRahul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        boolean flag = false;

        for (int i = 1; i < a; i++) {
            if (a % i == 0 && i % 2 != 0) {
                System.out.println(i);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No odd factor found");
        }
    }
}