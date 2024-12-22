public class CWH_35_ps_methods {
    static void mult(int n){
        for (int i=0; i<=10; i++){
            System.out.println(i+" x "+n+" = "+i*n);
        }
    }

    static void pattern(int pat){
        for (int i=pat; i>0; i--){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.format("\n");
        }
    }

    public static void main(String[] args) {
//        mult(2);
        pattern(5);

    }
}
