package program;


class th1 extends Thread{
    public void run(){
        int i = 0;
        while(i<20){
            System.out.println("Thank You...1");
            i++;
        }
    }
}
class th2 extends Thread{
    public void run(){
        int i = 0;
        while(i<20){
            System.out.println("Thank You...2");
            i++;
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args){
        th1 t1 = new th1();
        th2 t2 = new th2();

        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
