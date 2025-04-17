interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface Horn{
    int a = 45;
    void applyHorn();
    void applyhornmhn();
}

class Avonycle implements Bicycle, Horn{

    public void applyBrake(int decrement){
        System.out.println("Applying brakes");
    }

    public void speedUp(int increment){
        System.out.println("Applying speedup");
    }

    public void applyHorn(){
        System.out.println("Po Po PO");
    }
    public void applyhornmhn(){
        System.out.println("Main hoon na");
    }
}

public class CWH_54_Interfaces {
    public static void main(String[] args) {
     Avonycle cycle = new Avonycle();
        cycle.applyBrake(1);
//        System.out.println(cycle.a);
        cycle.applyHorn();
    }
}
