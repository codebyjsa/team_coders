import java.util.Scanner;

class abc {
    void hello(){
        System.out.println("Hello");
    }
}

class xyz {
    void sum (){
        int x = 10;
        int y = 20;
        System.out.println(x+"+"+y+"="+(x+y));
    }
}

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println(a+"+"+b+"="+(a+b));

        abc n = new abc();
        n.hello();

        xyz x = new xyz();
        x.sum();

    }
}
