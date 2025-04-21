class Phone{
    public void greet(){
        System.out.println("Greetings");
    }
    public void name (){
        System.out.println("My name is JAVA");
    }
}

class SmartPhone extends Phone {
    public void swagat (){
        System.out.println("Aapka swagat hain");
    }
    public void name (){
        System.out.println("My name is Java in Class two");
    }
}

public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//        obj.name();

        Phone obj = new SmartPhone(); //Vice-versa is not allowed

        obj.greet();
        obj.name();
    }
}
