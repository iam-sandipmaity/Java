package Program;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean w = true;
        boolean x = true;
        boolean y = false;
        boolean z = false;

        // Logical AND (&&)
        System.out.println("Logical AND (&&)");
        System.out.println(w && x);
        System.out.println(w && y);
        System.out.println(w && z);
        System.out.println(x && y);
        System.out.println(x && z);
        System.out.println(y && z);

        // Logical OR (||)
        System.out.println("Logical OR (||)");
        System.out.println(w || x);
        System.out.println(w || y);
        System.out.println(w || z);
        System.out.println(x || y);
        System.out.println(x || z);
        System.out.println(y || z);

        // Logical NOT(!)
        System.out.println("Logical NOT (!)");
        System.out.println(!w);
        System.out.println(!x);
        System.out.println(!y);
        System.out.println(!z);
        System.out.println(!(x && y));
        System.out.println(!(x || y));


    }
}
