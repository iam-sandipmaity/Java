/*
Q3. Create methods for area and volume in class circle and use inheritance to create another class cylinder from it.
 */


package Practice_Set;

import static java.lang.StrictMath.pow;

class Circle1{
    public float radius;
    Circle1(float r){
        this.radius = r;
//        display();
    }
    public float area(){
        return (float) Math.PI*this.radius*this.radius;
    }

    public void display(){
        System.out.println("The Radius of the circle is : "+radius);
        System.out.println("The Area of the circle is : "+area());
    }
}
class Cylinder1 extends Circle1{
    public float height;
    Cylinder1(float r,float h){
        super(r);
        this.height = h;
        display();
    }

    public float area() {
        return (float) ((float)Math.PI*pow(this.radius,2)*this.height);
    }

    @Override
    public void display() {
        System.out.println("The radius of the cylinder is : "+radius);
        System.out.println("The height of the cylinder is : "+height);
        System.out.println("The area of the cylinder is : "+area());
    }
}
public class PracticeSet_03 {
    public static void main(String[] args) {
        Circle1 cir = new Circle1(5.2f);
        cir.display();
        Cylinder1 cy = new Cylinder1(2.3f,9.3f);
    }
}
