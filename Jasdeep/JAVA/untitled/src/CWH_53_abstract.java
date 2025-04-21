abstract class Parent {
    public Parent(){
        System.out.println("I am base constructor");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning!");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}

public class CWH_53_abstract {
    public static void main(String[] args) {
//        Parent p = new Parent(); Will not work
        Child c= new Child();
    }
}
