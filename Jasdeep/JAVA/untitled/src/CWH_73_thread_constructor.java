class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i =34;
        while (i<34){
            System.out.println("I am a thread");
            i++;
        }

    }
}

public class CWH_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Harry");
        t.start();
        System.out.println("The id of the thread is "+t.getId());
        System.out.println("The id of the thread is "+t.getName());
    }
}
