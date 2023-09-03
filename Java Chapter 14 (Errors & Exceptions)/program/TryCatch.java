package program;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Start of the program");
//        int a = 6000;
//        int b = 0;   // if the user put here '0' then it will be a run time error.
//        int c = a/b;
//        System.out.println("The Result is : "+c);

        int a = 6000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The Result is : "+c);
        }
        catch (Exception e){
            System.out.println("We failed to devide. Reason : ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
