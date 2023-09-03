// Create a class square with a method to initialize its side , calculate area , perimeter etc

package Practice_Set;

import java.util.Scanner;

class CalSquare{
    int side;
    public void setSide(int a){
        side = a;
    }
    public void getArea(int side){
        int area = side*side;
        System.out.println("Area of the square is : "+area);
    }
    public void getPerimeter(int side){
        int perimeter = 4*side;
        System.out.println("Perimeter of the square is : "+perimeter);
    }
    public void getDetails(){
        getArea(side);
        getPerimeter(side);
    }
}

public class PracticeSet_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the Square : ");
        int n = sc.nextInt();

        CalSquare box = new CalSquare();

        box.setSide(n);
        box.getDetails();
    }
}
