package program;

class th extends Thread{
    public th(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(true){
        System.out.println("Thank You..."+this.getName());
        i++;
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        th t1 = new th("Sandip1");
        th t2 = new th("Sandip2");
        th t3 = new th("Sandip3");
        th t4 = new th("Sandip4");
        th t5 = new th("Sandip5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
    }
}
