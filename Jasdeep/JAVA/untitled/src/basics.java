import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+"+"+b+"="+(a+b));

    }
}
