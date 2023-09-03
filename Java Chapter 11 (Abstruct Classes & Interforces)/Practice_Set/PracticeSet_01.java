/*
Create an abstract class Pen with methods write() and refill() as abstract method
 */


package Practice_Set;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

public class PracticeSet_01 {
    public static void main(String[] args) {
        Pen p = new Pen() {
            @Override
            void write() {
                System.out.println("Writing...");
            }

            @Override
            void refill() {
                System.out.println("Refilling...");
            }
        };

        p.write();
        p.refill();
    }
}
