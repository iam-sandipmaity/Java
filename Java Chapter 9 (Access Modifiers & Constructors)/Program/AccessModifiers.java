package Program;

import static java.lang.System.exit;
class MyEmployee{
    private int id;
    private String name;

    public void setId(int i) {
        this.id = i;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee Sandip = new MyEmployee();

//        Sandip.id = 101;                  //Throws an error due to private access modifier
//        Sandip.name = "Sandip Maity";     //Throws an error due to private access modifier

        Sandip.setName("Sandip Maity");
        Sandip.setId(123);
        System.out.println(Sandip.getName());
        System.out.println(Sandip.getId());
    }
}
