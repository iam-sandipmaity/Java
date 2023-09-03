package program;

public class FinallyBlock {

    // Example 1 of finally block...
    public static int greet(){
        try{
            int a = 5;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources.....This is the end of the program.");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);



        //Example 2 of finally block using while loop
        int x = 6;
        int y = 5;
        while (true){
            try {
                System.out.println(x/y);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Finally Block...");
            }
            y--;
        }


//        In Try And Catch block if we use finally at the place of catch program will run but if any Exception will there then that will also come out.
    }
}
