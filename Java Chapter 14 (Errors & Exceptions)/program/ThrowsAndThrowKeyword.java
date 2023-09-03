package program;

import static java.lang.Math.pow;


// throws - send an alert to the other programmer that  there could be an Any type Exception and you need to face it by "try catch" block....
// throw - throw keyword use to throw an Exception(built-in,custom,Arithmetic,etc.)

class NegativeException extends Exception{
    public String toString(){
        return "Radius can't be negative!";
    }
    public String getMessage(){
        return "Radius can't be negative!";
    }
}

public class ThrowsAndThrowKeyword {
    public static float area(int r) throws NegativeException{
        if(r<0){
            throw new NegativeException();
        }
        float result = (float) ((float)Math.PI*pow(r,2));
        return result;
    }

    public static float divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            float c1 = divide(5, 0);
            System.out.println(c1);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        try{
            float c2 = area(-2);
            System.out.println(c2);
        }
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println("Exception");
        }
    }
}
