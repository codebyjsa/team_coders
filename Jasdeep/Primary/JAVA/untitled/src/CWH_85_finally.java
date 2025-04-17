public class CWH_85_finally {
    public static int greet(){
        try{
            int a =5;
            int b= 2;
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("This is the end of the program");
        }
        return 0;
    }
    public static void main(String[] args) {
        greet();
        int a = 1;
        int b=3;
        while(true){
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for value of b= "+ b);
            }
            b--;
        }
    }
}
