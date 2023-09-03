/*
    Create a class TelePhone with ring(), lift() and disconnect() methods as abstract methods create
    another class SmartTelePhone and demonstrate polymorphism.
 */


package Practice_Set;

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}

class SmartTelePhone extends TelePhone{

    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lifting...");
    }

    @Override
    void disconnect() {
        System.out.println("disconnecting...");
    }

    void playMusic(){
        System.out.println("playing Music...");
    }
    void openGps(){
        System.out.println("Opening GPS...");
    }
    void openCamera(){
        System.out.println("Opening Camera...");
    }
}
public class PracticeSet_04 {
    public static void main(String[] args) {
        TelePhone nokia = new SmartTelePhone();

        nokia.ring();
        nokia.lift();
        nokia.disconnect();


        //these methods can't invoke as they are not the part of TelePhone() methods...
//        nokia.playMusic();
//        nokia.openCamera();
//        nokia.openGps();
    }
}
