class Base1{
    public  int x;

    public Base1() {
        System.out.println("I am a constructor");
    }
    public Base1(int a) {
        System.out.println("I am a constructor"+a);
    }

}

class derived extends Base1 {
    public int Y;

    public derived() {
        super(1);
        System.out.println("I am a derived constructor");
    }
}

public class CWH_46_constructors_in_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        derived d= new derived();

    }
}
