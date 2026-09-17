
class Calculator{

    int a;
    int b;

    //Default Constructor
    Calculator (){
        this.a = 0;
        this.b = 0;
        System.out.println("Default Constructor called.");
    }

    //Parameterised Constructor
    Calculator (int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Parameterised Constructor called.");
    }

    //Method Overloading

    void add(){
        System.out.println("a+b="+(a+b));
    }

    void add(int x, int y){
        System.out.println("a+b+x+y="+(a+b+x+y));
    }

}

public class exp10 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add();
        c.add(1, 2);

        Calculator c1 = new Calculator(1, 2);
        c1.add();
        c1.add(1, 2);

    }
}
