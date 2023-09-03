package program;

class MyRunnableThread1 implements Runnable{
    public void run(){
        for(int i = 0; i < 1000 ; i++){
            System.out.println("I am a Runnable Thread *****1****");
        }
    }
}
class MyRunnableThread2 implements Runnable{
    public void run(){
        for(int i = 0; i < 1000 ; i++){
            System.out.println("I am a Runnable Thread *****2****");
        }
    }
}

public class MultithreadingByRunnableInterface {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();
        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }
}
