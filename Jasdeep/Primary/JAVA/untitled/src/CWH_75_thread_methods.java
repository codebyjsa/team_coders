class MyNewThr1 extends Thread{
    public void run(){
        int i =34;
        while (true){
            System.out.println("Thank you"+this.getName());
        }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
        int i =34;
        while (true){
            System.out.println("Thank you"+this.getName());
        }
    }
}

public class CWH_75_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr1 t2 = new MyNewThr1();
        t1.start();
        try{
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}
