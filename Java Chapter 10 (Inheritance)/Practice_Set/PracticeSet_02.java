
/*
Q2. Create a int height; and use inheritance to create another class Rectangle. Try to Keep it as close to recall world scenario as possible..
 */

package Practice_Set;
class Cuboid{
    int height;
    Cuboid(int height) {
        this.height = height;
    }
}
class  Rectangle extends Cuboid{
    int breath;
    Rectangle(int height,int breath){
        super(height);
        this.height = height;
        this.breath = breath;
    }
}

public class PracticeSet_02 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(4,9);
        System.out.println(rec.height +"   "+ rec.breath);
        Cuboid cub = new Cuboid(23);
        System.out.println(cub.height);
    }
}
