class base{
    int x;
    public void printMe(){
        System.out.println("I am a constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derive extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_45_inheritance {
    public static void main(String[] args) {
        Derive b= new Derive();
        b.setX(4);
        System.out.println(b.getX());
    }
}
