
/*
    Demonstrate getPriority() and setPriority() methods in java threads.
 */

package Practice_Set;

class th5 extends Thread{
    public void run(){
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class th6 extends Thread{
    public void run(){
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("welcome");
        }
    }
}


public class PracticeSet_03 {
    public static void main(String[] args) {
        th5 t5 = new th5();
        th6 t6 = new th6();

        t5.setPriority(6);
        t5.setPriority(9);

        System.out.println(t5.getPriority());
        System.out.println(t6.getPriority());

    }
}
