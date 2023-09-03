package Program;

class C1{
    public int a = 1;
    protected  int b = 2;
    private int c = 3;
    int d = 4;
    void displayInClass(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class SubClass extends C1{
    void displayInSubClass(){
        System.out.println(a);
        System.out.println(b);
//        System.out.println(c);
        System.out.println(d);
    }
}

class world{}
public class AccessModifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        c.displayInClass();

        SubClass s = new SubClass();
        s.displayInSubClass();
    }

}
