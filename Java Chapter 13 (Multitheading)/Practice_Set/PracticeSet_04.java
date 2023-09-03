/*
    How do you get state of a grim thread in java?
 */


package Practice_Set;
class th7 extends Thread{
    public void run(){
            System.out.println("Good Morning");
        }
}

public class PracticeSet_04 {
    public static void main(String[] args) {
        th7 t7 = new th7();
        System.out.println(t7.getState());
        t7.start();
        System.out.println(t7.getState());
    }
}
