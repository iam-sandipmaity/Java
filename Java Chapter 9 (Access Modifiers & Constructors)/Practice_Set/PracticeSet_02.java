/*
Create a class cylinder and use getters and setters to set its radius and height. And then calculate
surface area and volume of the cylinder.
 */


package Practice_Set;

import java.util.Scanner;

import static java.lang.Math.pow;

class MyCylinder{
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
    public float calculateSurfaceArea(float height, float radius){
        return (float)((2*3.14*radius*height)+(2*3.14*pow(radius, 2)));
    }
    public float calculateVolume(float height, float radius){
        return (float) (3.14f*pow(radius,2)*height);
    }
    public void display(){
        System.out.println("The Height Of the Cylinder Is : "+getHeight());
        System.out.println("The Radius Of the Cylinder Is : "+getRadius());
        System.out.println("The Surface Area Of the Cylinder Is : "+calculateSurfaceArea(height, radius));
        System.out.println("The Volume Of the Cylinder Is : "+calculateVolume(height, radius));
    }
    public void printAll(){
        setHeight();
        setRadius();
        display();
    }
}

public class PracticeSet_02 {
    public static void main(String[] args) {
        MyCylinder my = new MyCylinder();
        my.printAll();
    }
}
