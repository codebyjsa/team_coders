abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }
}

class monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}

interface basicAnimal{
    void eat();
    void sleep();
}

class Human extends monkey implements basicAnimal{
    public void speak(){
        System.out.println("Hello sir");
    }

    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}



public class CWH_60_ps {
    public static void main(String[] args) {
        fountainPen pen = new fountainPen();
        pen.changeNib();
        Human human = new Human();
        human.sleep();

        monkey m1 = new Human();
        m1.bite();
    }
}
