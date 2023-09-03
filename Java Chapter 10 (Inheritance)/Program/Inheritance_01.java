/*
Create a class animal and derive another class Dog from it.
 */


package Program;

class Animal{
    public void canSpeak(){
        System.out.println("They can't Speak....");
    }
    public void eat(){
        System.out.println("They eat any wild life....");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dogs are always barks.....");
    }
    // we can make more methods and properties as we want...........
}

public class Inheritance_01 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog = new Dog();
        dog.canSpeak();          // derived from Animal class
        dog.eat();               // derived from Animal Class
        dog.sound();             // it is the original method of Dog Class or Derived class
    }
}
