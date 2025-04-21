import java.util.Scanner;

public class CWH_86_ps {
    public static void main(String[] args) {
//        Problem 1
//        int a = 7 (Syntax error)
        int age = 78;
        int year_born = 2000-78; //Logical error
//        System.out.println(6/0);

//        Problem 2
//        try {
//            int a=666/0;
//
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("haha");
//        }
//        catch (ArithmeticException e){
//            System.out.println("hehe");
//        }

//        Problem 3
        boolean flag = true;
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 6;
        marks[2] = 45;
        Scanner sc = new Scanner(System.in);
        int i=0;
        while (flag && i<5){
            try {
                int index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index!");
                i++;
            }
        }
    }
}
