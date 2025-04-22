interface Camera{
    void takesnap();
    void recordVideo();

}
interface Wifi{
    String[] getnetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class mySmartPhone extends MyCellPhone implements Wifi, Camera{
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

public class CWH_57_default_methods {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String [] ar = ms.getnetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
