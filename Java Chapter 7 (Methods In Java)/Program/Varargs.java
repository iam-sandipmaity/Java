package Program;

public class Varargs {

//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }
    public static int sum(int x,int ...arr){
        // Availability as int [] arr
        int result = x;

        for(int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println("The sum 0f nothing is : "+sum());

        System.out.println("The sum 0f 1 is : "+sum(1));

        System.out.println("The sum 0f 1 & 2 is : "+sum(1,2));
        System.out.println("The sum 0f 1 ,2 & 3 is : "+sum(1,2,3));
        System.out.println("The sum 0f 1 ,2 ,3 & 4 is : "+sum(1,2,3,4));

    }
}
