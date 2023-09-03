package Program;

public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a++); //post increment operator (Use the Value First then Increment Value)
        System.out.println(a++); //pre increment operator  (increment Value First Then Use The Value)
        System.out.println(a--); //post decrement operator (Use the Value First then Decrement Value)
        System.out.println(--a); //pre decrement operator  (Decrement Value First Then Use The Value)

        char ch = 'A';
        System.out.println(++ch);

    }
}
