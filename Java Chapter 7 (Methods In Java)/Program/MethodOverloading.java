package Program;
// Method Overloading
public class MethodOverloading {
    static void methodOverloading(){
        System.out.println("Good Morning bro!");
    }
    static void methodOverloading(int a){
        System.out.println("Good Morning "+a+" bro!");
    }
    static void methodOverloading(int a,int b){
        System.out.println("Good Morning "+a+" bro!");
        System.out.println("Good Morning "+b+" bro!");
    }
    public static void main(String[] args) {
        // Method Overloading
        methodOverloading();
        methodOverloading(100);
        methodOverloading(300,500);
    }
}
