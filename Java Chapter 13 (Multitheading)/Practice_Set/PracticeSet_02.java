/*
    Add a sleep method in welcome thread to delay its execution for 200 ms.
 */


package Practice_Set;
class th3 extends Thread{
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
class th4 extends Thread{
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

public class PracticeSet_02 {
    public static void main(String[] args) {
        th3 t3 = new th3();
        th4 t4 = new th4();
        t3.start();
        t4.start();
    }
}
