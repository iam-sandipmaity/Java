package Program;
import java.util.Scanner;

public class String_01 {
    public static void main(String[] args) {
        String name = new String("Sandip Maity");
        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String : ");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
