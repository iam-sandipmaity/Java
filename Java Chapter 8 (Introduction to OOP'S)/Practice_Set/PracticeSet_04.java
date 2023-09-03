/*
Create a class rectangle with a method to initialize its length and width , calculate area , perimeter etc
 */

package Practice_Set;

import java.util.Scanner;

class calRectangle{
    int length,width;
    public void setLengthWidth(int a,int b){
        length = a;
        width = b;
    }
    public void getArea(int length, int width){
        int area = length*width;
        System.out.println("Area of the square is : "+area);
    }
    public void getPerimeter(int length, int width){
        int perimeter = 2*(length+width);
        System.out.println("Perimeter of the square is : "+perimeter);
    }
    public void getDetails(){
        getArea(length,width);
        getPerimeter(length,width);
    }

}

public class PracticeSet_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter width of the rectangle : ");
        int w = sc.nextInt();

        calRectangle box = new calRectangle();
        box.setLengthWidth(l,w);
        box.getDetails();
    }
}
