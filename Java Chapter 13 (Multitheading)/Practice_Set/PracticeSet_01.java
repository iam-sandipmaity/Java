/*
    Write a Program to print "good morning" and "welcome" continuously on the screen
    in java using Threads
 */

package Practice_Set;

class th1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good Morning");
        }
    }
}
class th2 extends Thread{
    public void run(){
        while (true) {
            System.out.println("welcome");
        }
    }
}

public class PracticeSet_01 {
    public static void main(String[] args) {
        th1 t1 = new th1();
        th2 t2 = new th2();
        t1.start();
        t2.start();
    }
}
