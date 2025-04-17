import java.util.Scanner;

public class CWH_ps_16 {
    public static void main(String[] args) {
////        Question 2
//        System.out.println("Enter subject marks out of 100");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Subject 1: ");
//        int a = sc.nextInt();
//
//        System.out.print("Subject 2: ");
//        int b = sc.nextInt();
//
//        System.out.print("Subject 3: ");
//        int c = sc.nextInt();
//
//        if (a < 33 || b < 33 || c < 33) {
//            System.out.println("Student is fail!");
//        } else {
//            if (((a + b + c) * 100) / 300 < 40) {
//                System.out.println("Student is fail!");
//            } else {
//                System.out.println("Student is passed!");
//            }
//        }

//        Question 4
        System.out.print("Enter your tax in LPA: ");
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float tax = a;

        if (a<2.5){
            System.out.println("No tax!");
        } else if (a>=2.5 && a<5.0) {
            tax= (float) (a+(a*0.05));
        } else if (a>=5.0 && a<10.0) {
            tax= (float) (a+(a*0.2));
        } else if (a>=10.0) {
            tax= (float) (a+(a*0.3));
        }else {
            System.out.println("Tumahri to puri jeb khali hogi babua!");
        }

        System.out.format("%.2f", tax," LPA");
    }
}
