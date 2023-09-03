/*
Overload a constructor used to initialize a rectangle of length 4 and breath 5 for using custom parameters
 */

package Practice_Set;

class Rectangle{
    private int length;
    private int breath;

    Rectangle(){
        length = 4;
        breath = 5;
        display();
    }
    Rectangle(int length, int breath){
            this.length = length;
            this.breath = breath;
            display();
    }
    public  void  display(){
        System.out.println("Length of the Rectangle is : "+length);
        System.out.println("Breath of the Rectangle is : "+breath);
    }
}

public class PracticeSet_04 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(45,78);
    }
}
