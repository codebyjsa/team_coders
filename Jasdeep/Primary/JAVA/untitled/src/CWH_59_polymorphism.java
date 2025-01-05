interface Camera1{
    void takesnap();
    void recordVideo();

}
interface Wifi1{
    String[] getnetworks();
    void connectToNetwork(String network);
}

class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class mySmartPhone1 extends MyCellPhone1 implements Wifi1, Camera1{
    public void takesnap(){
        System.out.println("Taking Snap");
    }

    public void recordVideo(){
        System.out.println("Taking Snap");
    }

    public String[] getnetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry","Prashant", "Anjali56"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}

public class CWH_59_polymorphism {
    public static void main(String[] args){
        Camera1 cam1 = new mySmartPhone1();
        cam1.recordVideo();
    }
}
