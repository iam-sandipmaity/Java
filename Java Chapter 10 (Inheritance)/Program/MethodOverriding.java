package Program;

class A{
    public int a;
    public int Sandip(){
        return a;
    }
    public void meth1(){
        System.out.println("I am method 1 from A");
    }
}

class B extends A{
    @Override // this is used to confirm whether it is overridden or not....
    public void meth1(){
        System.out.println("I am method 1 from B");
    }
    public void meth2(){
        System.out.println("I am method 2 from B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();
        B b = new B();
        b.meth1();
    }
}
