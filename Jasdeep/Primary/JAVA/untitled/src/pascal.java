import java.util.*;

public class pascal{

    // public static int factorial (int i){
    //     int res=1;
    //     if (i==0) {
    //         return 1;
    //     }
    //     for (int j = 1; j <= i; j++) {
    //         res*=j;
    //     }
    //     return res;
    // }
    // public static int ncr (int n, int r){
    //     return factorial(n)/(factorial(r)*factorial(n-r));
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // System.out.println("\n1");
        // for (int i = 1; i <= N; i++) {
        //     System.out.print(1+" ");
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(ncr(i, j)+" ");
        //     }
        //     System.out.println();
        // }

        List<Integer> a = new ArrayList<>();
        System.out.println(1);
        if (N>1) {
            System.out.println(1+" "+1);
            for (int i = 3; i < N; i++) {
                for (int j = i; j >= i-1; j--) {
                    
                }
            }
        }
        

    }
}