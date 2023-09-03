package Program;

abstract class Parent{
    Parent (){
        System.out.println("I am The Constructor of the Parent Class...");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract  void greet1();
    abstract  void greet2();
}

class Child_1 extends Parent{
    @Override
    public void greet1() {
        System.out.println("Good Morning...");
    }
    public void greet2() {
        System.out.println("Good Afternoon...");
    }
    public void he(){
        System.out.println("Hello How are You?");
    }
}
abstract class Child_2 extends Parent{
    public void thank() {
        System.out.println("Thank You...");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Child_1 c = new Child_1();
        c.greet1();
        c.greet2();
        c.he();
        c.sayHello();
    }
}
