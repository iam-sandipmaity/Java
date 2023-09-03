/*Create a class Employee With Following properties and methods:

        salary (property) (int)
        getSalary(method returning int)
        name (property)(String)
        getName(method returning String)
        seName(Method Changing name)
 */


package Practice_Set;

class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class PracticeSet_01 {
    public static void main(String[] args) {
        Employee Sandip = new Employee();
        Sandip.salary = 56;
        Sandip.setName("Sandip Maity");
        System.out.println(Sandip.getName());
        System.out.println(Sandip.getSalary());

    }
}
