package Program;

interface Camera1{
    void takeSnap();
    void recordVideo();
}
interface MediaPlayer{
    void playMedia();
    void pauseMedia();
    void closeMedia();
}
interface Wifi1{
    String[] getNetwork();
    void connectNetwork(String network);
}

class CellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling... "+phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting... "+phoneNumber);
    }
}

class MySmartPhone extends CellPhone implements Camera1,Wifi1,MediaPlayer{

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
    }

    @Override
    public void playMedia() {
        System.out.println("Playing Media...");
    }

    @Override
    public void pauseMedia() {
        System.out.println("Pausing Media...");
    }

    @Override
    public void closeMedia() {
        System.out.println("Closing Media...");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Available networks Are : ");
        String[] networkList = {"Sandip","Manas","Rupam","Pradip"};
        return networkList;
    }

    @Override
    public void connectNetwork(String network) {
        System.out.println("Connecting to "+network+" ...");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Camera1 cam = new MySmartPhone();
        MediaPlayer mplay = new MySmartPhone();
        Wifi1 wi = new MySmartPhone();
        CellPhone1 nokia = new CellPhone1();
        MySmartPhone oppo = new MySmartPhone();

        System.out.println("\n\n\nFor Camera...\n");
        cam.takeSnap();
        cam.recordVideo();
//        cam.getNetwork();  // --> not allowed as getNetwork() is not a method of Camera() interface, so we can't access it.

        System.out.println("\n\n\nFor MediaPlayer...\n");
        mplay.playMedia();
        mplay.pauseMedia();
        mplay.closeMedia();


        System.out.println("\n\n\nFor Wifi...\n");
        wi.connectNetwork("White House");
        String[] network = wi.getNetwork();
        for (String net: network) {
            System.out.println("* "+net);
        }


        System.out.println("\n\n\nFor CellPhone...\n");
        nokia.callNumber(199);
        nokia.pickCall(1991);

        System.out.println("\n\n\nFor Smart Phone...\n");
        oppo.takeSnap();
        oppo.recordVideo();
        oppo.playMedia();
        oppo.pauseMedia();
        oppo.closeMedia();
        oppo.connectNetwork("Black House");
        oppo.connectNetwork("White House");
        String[] network1 = oppo.getNetwork();
        for (String net: network1) {
            System.out.println("* "+net);
        }
        oppo.callNumber(100);
        oppo.pickCall(101);
    }
}
