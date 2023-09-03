/*
Create a class circle with a method to initialize its radius , calculate area , perimeter etc
 */

package Practice_Set;


import java.util.Scanner;

class Circle{
    float radius;
    public void setRadius(float r){
        radius = r;
    }
    public void getArea(float radius){
        float area = (4*3.17f*radius);
        System.out.println("Area of the square is : "+area);
    }
    public void getPerimeter(float radius){
        float perimeter = (2*3.17f*radius);
        System.out.println("Perimeter of the square is : "+perimeter);
    }
    public void getDetails() {
        getArea(radius);
        getPerimeter(radius);
    }
}

public class PracticeSet_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        float r = sc.nextFloat();

        Circle c1 = new Circle();
        c1.setRadius(r);
        c1.getDetails();
    }
}
