package Program;

class Base1{
    Base1(){
        System.out.println("I am The Base Constructor");
    }
    Base1(int a){
        System.out.println("I am The Overloaded constructor with value of A as: "+a);
    }
}
class  Derived1 extends Base1{
    Derived1(){
        System.out.println("I am the Derived constructor...");
    }
    Derived1(int a, int b){
        super(a);
        System.out.println("I am The Overloaded derived constructor with value of B as: "+b);
    }
}
class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        System.out.println("I am The Child Of Derived class....");
    }
    ChildOfDerived1(int a, int b, int c){
        super(a,b);
        System.out.println("I am The Overloaded Child Of Derived class constructor with value of C as: "+c);
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
//        Base1 b1 = new Base1();
//        Derived1 d1 = new Derived1();
        ChildOfDerived1 cd1 = new ChildOfDerived1(1,2,3);
    }
}
