import java.util.Scanner;

public class CWH_25_ps4 {
    public static void main(String[] args) {
//        Question 1
//        for (int i=4; i>0; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        Question 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (i%2==0){
                sum+=i;
            }else{
                continue;
            }
        }
        System.out.println(sum);
    }
}
