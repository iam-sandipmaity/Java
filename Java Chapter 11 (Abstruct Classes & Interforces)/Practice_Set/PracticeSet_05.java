/*
    Create a class Monkey with jump() and bite() methods. Create a class human which inherits this
    Monkey class and implements BasicAnimal interface with eat() and sleep() methods. Then demonstrate
    the polymorphism using monkey class from it.
 */


package Practice_Set;
class Monkey1{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}

interface  BasicAnimal1{
    void eat();
    void sleep();
}
class Human1 extends Monkey1 implements BasicAnimal1{
    public void speak(){
        System.out.println("Speaking...");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class PracticeSet_05 {
    public static void main(String[] args) {
        Monkey sandip = new Human();


        sandip.jump();
        sandip.bite();


        //these methods will throw error
//        sandip.eat();   // Can't use eat() method because the reference is Monkey which does not have eat() method
//        sandip.speak(); // Can't use speak() method because the reference is Monkey which does not have speak() method
//        sandip.sleep(); // Can't use sleep() method because the reference is Monkey which does not have sleep() method
    }
}
