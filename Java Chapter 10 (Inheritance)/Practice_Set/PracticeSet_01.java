

/*
Q1. Create a class circle and use inheritance to create another class cylinder from it.
 */
package Practice_Set;

class Circle{
    public float radius;
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void display(){
        System.out.println("The Radius of the circle is : "+radius);
    }
}
class Cylinder extends Circle{
    public float height;
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void display() {
        System.out.println("The radius of the cylinder is : "+radius);
        System.out.println("The height of the cylinder is : "+height);
    }
}

public class PracticeSet_01 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5.9f);
        c1.display();
        Cylinder c2 = new Cylinder();
        c2.setRadius(9.3f);
        c2.setHeight(15.3f);
        c2.display();
    }
}
