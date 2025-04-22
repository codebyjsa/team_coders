class Circle {
    public int radius;
    Circle(int r){
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{

    public  int height;
    Cylinder1(int r, int h){
        super(r);
        this.height=h;
    }
    public double area(){
        return Math.PI*this.radius*this.radius*height;
    }
}

public class CWH_52_ps {
    public static void main(String[] args) {
        //Problem 1
        Cylinder1 obj = new Cylinder1(12, 6);
        System.out.println(obj.area());
    }
}
