package Program;

public class MethodsInJava_02 {
    static void greet(){
        System.out.println("Good Morning");
    }
    static void change(int a){
        a = 92;
    }
    static void change1(int [] arr){
        arr[0]=387;
    }
    public static void main(String[] args) {
        greet();

        // Case-1: Changing the integer

        int x = 63;
        change(x);
        System.out.println("The value of x after running change is : "+x);

        // Case-1: Changing the Array

        int [] marks = {56,12,67,35};
        change1(marks);
        System.out.println("The value of x after running change is : "+marks[0]);


    }
}
