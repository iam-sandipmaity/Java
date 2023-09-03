package Program;

public class Associativity {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 4;

        int d = a*b/c*a+c;
        int e = a+b-c*a*c/b;
        System.out.println(d);
        System.out.println(e);
    }
}
