package Program;

public class MethodsInJava_01 {
    //Methods
    static int logic(int x, int y){
        int z;
        if(x > y){
            z = x + y;
        }
        else {
            z = x - y;
        }
        return z;
    }


    public static void main(String[] args) {
    // example 1
        int c1 = logic(51,8);
        System.out.println(c1);
    // example 2
        int a1 = 5;
        int b1 = 9;
        int c2 = logic(a1,b1);
        System.out.println(c2);


    // example 3
        // Method invocation using object creation (if the method is non-static)

//        MethodsInJava_01 obj = new MethodsInJava_01();
//        int a2 = 6;
//        int b2 = 2;
//        int c3 = obj.logic(a2,b2);
//        System.out.println(c3);
    }
}
