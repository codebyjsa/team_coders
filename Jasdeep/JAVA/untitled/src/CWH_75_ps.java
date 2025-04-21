class Practise13 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class CWH_75_ps {
    public static void main(String[] args) {
        Practise13 p = new Practise13();
        p.start();

    }
}
