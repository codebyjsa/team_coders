public class CWH_80_try {
    public static void main(String[] args) {
        int a = 4000;
        int b =0;

        try{
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("We cant do this");
        }
    }
}
