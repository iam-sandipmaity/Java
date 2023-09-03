/*
Create a class Sphere and use getters and setters to set its radius and height. And then calculate
surface area and volume of the Sphere.
 */

package Practice_Set;
import java.util.Scanner;
import static java.lang.Math.pow;

class Sphere{
    Scanner sc = new Scanner(System.in);
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius() {
        System.out.print("Please Enter radius : ");
        this.radius = sc.nextFloat();
    }

    public float calculateSurfaceArea(float radius){
        return (float)(4*3.14*pow(radius, 2));
    }
    public float calculateVolume(float radius){
        return (float) ((4/3)*3.14*pow(radius,3));
    }
    public void display(){
        System.out.println("The Radius Of the Sphere Is : "+getRadius());
        System.out.println("The Surface Area Of the Sphere Is : "+calculateSurfaceArea(radius));
        System.out.println("The Volume Of the Sphere Is : "+calculateVolume(radius));
    }
    public void printAll(){
        setRadius();
        display();
    }
}
public class PracticeSet_05 {
    public static void main(String[] args) {
        Sphere my = new Sphere();
        my.printAll();
    }
}
