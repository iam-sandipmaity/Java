package program;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("I am a Thread...");
            i++;
        }
    }
}
class MyTh extends Thread {
    public MyTh(Runnable r,String name){
        super(r,name);
    }
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("I am a runnable Th...");
            i++;
        }
    }
}

public class ConstructorOfThreadClass {
    public static void main(String[] args) {
        MyThread mth = new MyThread("SANDIP");
        mth.start();
        System.out.println("The Id Of the Thread is "+mth.getId());
        System.out.println("The Name Of the Thread is "+mth.getName());
        Runnable run = null;
        MyTh mth1 = new MyTh(null,"SANDIP");
        mth1.start();
        System.out.println("The Id Of the Thread is "+mth1.getId());
        System.out.println("The Name Of the Thread is "+mth1.getName());
    }
}
