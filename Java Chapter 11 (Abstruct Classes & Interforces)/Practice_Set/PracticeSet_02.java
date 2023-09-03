/*
Use  abstract class Pen with methods write() and refill() as abstract method to Create a
Concrete class fountain pen with additional method changeNib().
 */


package Practice_Set;
abstract class Pen1{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen1{
    void changeNib(){
        System.out.println("Changing nib...");
    }
    @Override
    void write() {
        System.out.println("Writing...");
    }

    @Override
    void refill() {
        System.out.println("Refilling...");
    }
}
public class PracticeSet_02 {
    public static void main(String[] args) {
        FountainPen Elcos = new FountainPen();
        Elcos.write();
        Elcos.refill();
        Elcos.changeNib();
    }
}
