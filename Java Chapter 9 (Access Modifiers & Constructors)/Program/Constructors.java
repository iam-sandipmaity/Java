package Program;

class Employee{
    protected int id;
    protected String name;
    public Employee(){
        id = 13;
        name = "Sandip-Maity-sa";
        printDisplay();
    }
    public Employee(int p){
        id = p;
        name = "Sandip-Maity-sa";
        printDisplay();
    }
    public Employee(String na){
        id = 13;
        name = na;
        printDisplay();
    }
    public Employee(int p , String na){
        id = p;
        name = na;
        printDisplay();
    }
    void setId(int id){ this.id = id;}
    public int getId(){return id;}
    void setName(String name){ this.name = name;}
    public String getName(){return name;}
    public void printDisplay (){
        System.out.println(getId());
        System.out.println(getName());
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employee S1 = new Employee();
        Employee S2 = new Employee(56);
        Employee S3 = new Employee("Rohan");
        Employee S4 = new Employee(89,"Rohan");
    }
}
