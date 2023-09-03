/*
Use a Constructor for Create a class cylinder and use getters and setters to set its radius and height.
 */

package Practice_Set;

import java.util.Scanner;

class Cylinders{
    Scanner sc = new Scanner(System.in);
    private float height;
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius() {
        System.out.print("Please Enter radius : ");
        this.radius = sc.nextFloat();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight() {
        System.out.print("Please Enter height : ");
        this.height = sc.nextFloat();
    }
    public void display(){
        System.out.println("The Height Of the Cylinder Is : "+getHeight());
        System.out.println("The Radius Of the Cylinder Is : "+getRadius());
    }
    Cylinders(){
        setHeight();
        setRadius();
        display();
    }
}

public class PracticeSet_03 {
    public static void main(String[] args) {
        Cylinders C = new Cylinders();
    }
}
