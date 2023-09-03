package Program;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording 4k Video...");
    }
}
interface Wifi{
    String[] getNetwork();
    void connectNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling... "+phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting... "+phoneNumber);
    }
}
class SmartPhone extends CellPhone implements Camera,Wifi{
    public void takeSnap(){
        System.out.println("Taking snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
    }
    public void record4kVideo(){
        System.out.println("Recording 4k Video and taking snap...");
    }
    @Override
    public void connectNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting network list");
        String[] networkList = {"Sandip","Rohan","Sujit","Rahman"};
        return networkList;
    }
}
public class DefaultInterface {
    public static void main(String[] args) {
        SmartPhone vivo = new SmartPhone();
        vivo.takeSnap();
        vivo.recordVideo();
        vivo.record4kVideo();
        vivo.callNumber(199);
        vivo.pickCall(1991);
        vivo.connectNetwork("White House");
        String[] str = vivo.getNetwork();
        for (String item : str) {
            System.out.println(item);
        }
    }
}
