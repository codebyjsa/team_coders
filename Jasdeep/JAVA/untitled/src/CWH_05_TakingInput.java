import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args){
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The sum of these numbers is: ");
        System.out.println(sum);
    }
}
