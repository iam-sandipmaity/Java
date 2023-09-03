package Program;

class Base{
    private int x;
    Base (){
        System.out.println("I am the base class.");
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
 class Derived extends Base{
    private int y;
    Derived() {
        System.out.println("I am The Derived class...");
    }
     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }
 }

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        b.setX(50);
        System.out.println(b.getX());
        d.setX(23);
        System.out.println(d.getX());
        d.setY(3);
        System.out.println(d.getY());
    }
}
