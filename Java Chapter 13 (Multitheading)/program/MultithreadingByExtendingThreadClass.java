package program;

class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i < 10000){
            System.out.println("My Thread ******1****** is Running....");
            System.out.println("I am happy!...");
            i++;
        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 10000){
        System.out.println("My Thread ******2****** is Running....");
        System.out.println("I am happy!...");
        i++;
        }
    }
}

public class MultithreadingByExtendingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();


        t1.start();
        t2.start();
    }
}
