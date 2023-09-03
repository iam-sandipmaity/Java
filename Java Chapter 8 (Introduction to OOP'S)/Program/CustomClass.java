
package Program;

class Employee{
    int id;
    float salary = 35.45f;  // If For any Object Salary doesn't set then this default value will display instead of null
    String name;
    char favChar;
    public void printDisplay(){
        System.out.println("My id Is : "+id);
        System.out.println("My name Is : "+name);
        System.out.println("My Salary Is : "+salary);
        System.out.println("My favChar Is : "+favChar);
        System.out.println("My favChar Is : "+getFavChar());
        System.out.println();
    }

    public char getFavChar(){
        return favChar;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This Is A Custom Class.");
        Employee Sandip = new Employee(); //Instantiating a new Employee Object
        Employee Rahul = new Employee(); //Instantiating a new Employee Object

        //Setting Attributes for Sandip
        Sandip.id = 102;
        Sandip.name = "Sandip Maity";
        Sandip.salary = 65.3f;
        Sandip.favChar = 'S';
        //Setting Attributes for Rahul
        Rahul.id = 103;
        Rahul.name = "Rahul Maity";
        Rahul.favChar = 'R';
        //Printing the attributes
        Sandip.printDisplay();
        Rahul.printDisplay();
//        System.out.println(Sandip.id);
//        System.out.println(Sandip.name);
    }
}