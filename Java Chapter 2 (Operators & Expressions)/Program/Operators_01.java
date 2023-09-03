package Program;

public class Operators_01 {
    public static  void main(String[] args){
        int a = 10;
        int b = 6 ;

        //Arithmetic Operator (+,-,/,*,%)
        int c1 = a + b;
        int c2 = a - b;
        int c3 = a * b;
        int c4 = a / b;
        int c5 = a % b;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        // Assignment Operator  (=,+=,-=,*=,/=)
        int d = 3;
        d += 2;
        System.out.println(d);

        // Comparison Operators (==,>=,<=)
        int e = 6 , f = 3 , g = 6;
        System.out.println(e==g);
        // Always be Sure that "<=" is right but "=<" is Wrong
        System.out.println(e <= f);
        // Always be Sure that ">=" is right but "=>" is Wrong
        System.out.println(e >= f);

        // Logical Operator (&& , || , !)
        int h = 6, i = 3 , j = 2;
        System.out.println( (h<i) && (i<i) );
        System.out.println( (h>i) || (i<i) );
        System.out.println(!( (h<i) && (i<i) ));

    }
}
