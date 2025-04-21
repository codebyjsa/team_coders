import java.util.Random;
import java.util.Scanner;

public class CWH_Exercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int comp_hand = rm.nextInt(3)+1;
        System.out.println("Enter which you want to use against computer. \n1.Paper \n2. Stone \n3. Scissor");
        int hand = sc.nextInt();

        System.out.println("Your hand shows: "+hand+"\nComputer's hand shows: "+comp_hand);
        if (hand==comp_hand){
            System.out.println("You won!");
        }else {
            System.out.println("You lose!");
        }
}
}
