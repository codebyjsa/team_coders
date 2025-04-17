interface sampleInterface{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements ChildSampleInterface {
    public void meth1() {
        System.out.println("meth 1");
    }

    public void meth2() {
        System.out.println("meth 2");
    }

    public void meth3() {
        System.out.println("meth 3");
    }

    public void meth4() {
        System.out.println("meth 4");
    }
}

public class CWH_58_inheritance_interfaces {
    public static void main(String[] args) {

    }
}
