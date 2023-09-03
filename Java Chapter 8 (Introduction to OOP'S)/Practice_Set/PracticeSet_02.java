/*
Create a class CellPhone With  methods to print "ringing...","vibrating..." etc
 */

package Practice_Set;

class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Sandip...");
    }
    public void printDisplay(){
        ringing();
        vibrating();
        callFriend();
    }
}

public class PracticeSet_02 {
    public static void main(String[] args) {
        CellPhone iPhone = new CellPhone();

        iPhone.printDisplay();
    }
}
