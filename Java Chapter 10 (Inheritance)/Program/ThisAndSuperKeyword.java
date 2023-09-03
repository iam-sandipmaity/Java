package Program;

class Parent{
    int a;

    Parent(int a){
        this.a = a;  //this keyword basically use for reference
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class Child extends Parent{
    Child(int b){
        super(b);   // Without this super this will throw an error as in the parent class there are no default constructor....
        System.out.println("I am a Constructor");
    }
}
public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        Parent p = new Parent(5);
        Child c = new Child(56);
        System.out.println(p.getA());
    }
}
