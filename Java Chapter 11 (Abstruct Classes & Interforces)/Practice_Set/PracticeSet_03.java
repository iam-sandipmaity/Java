/*
    Create a class Monkey with jump() and bite() methods. Create a class human which inherits this
    Monkey class and implements BasicAnimal interface with eat() and sleep() methods.
 */


package Practice_Set;

class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}

interface  BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
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
public class PracticeSet_03 {
    public static void main(String[] args) {
        Human sandip = new Human();
        sandip.jump();
        sandip.bite();
        sandip.eat();
        sandip.speak();
        sandip.sleep();
    }
}
