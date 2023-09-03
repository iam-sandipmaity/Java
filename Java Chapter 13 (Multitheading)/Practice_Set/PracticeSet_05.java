/*
    How do we get reference to the Current thread in Java?
 */


/*
    How do you get state of a grim thread in java?
 */


package Practice_Set;
class th8 extends Thread{
    public void run(){
        System.out.println("Good Morning");
    }
}
class th9 extends Thread{
    public void run(){
        System.out.println("Thank you");
    }
}

public class PracticeSet_05 {
    public static void main(String[] args) {
        th8 t8 = new th8();
        th9 t9 = new th9();
        System.out.println(Thread.currentThread().getState());
        t8.start();
        t9.start();
        System.out.println(Thread.currentThread().getState());
    }
}
