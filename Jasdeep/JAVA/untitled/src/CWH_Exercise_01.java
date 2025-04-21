import java.util.Scanner;

public class CWH_Exercise_01 {
    public static void main(String[] args){
        int max = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100 for the following subjects.");

        System.out.print("Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Subject 3: ");
        int sub3 = sc.nextInt();
        System.out.print("Subject 4: ");
        int sub4 = sc.nextInt();
        System.out.print("Subject 5: ");
        int sub5 = sc.nextInt();

        int total = sub1+sub2+sub3+sub4+sub5;
        int percentage = (total*100)/max;

        System.out.println("The percentage of the student is: "+percentage+"%");
    }
}
