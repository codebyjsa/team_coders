class MyThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000) {
            System.out.println("My cooking thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000) {
            System.out.println("My thread 2 is running for chatting with hew");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class CWH_70_threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
