package Program;

public class TypesOfPrintStatement {
    public static void main(String[] args) {
        int a = 6;
        float b = 5.3F;
        char ch = 'S';
        System.out.println("a = "+a + ", b = "+ b+", ch = "+ ch );
        System.out.print("a = "+a + ", b = "+ b+", ch = "+ ch +"\n");
        System.out.printf("a = %d , b = %15.3f , ch = %c \n",a,b,ch);
        System.out.format("a = %d , b = %.3f , ch = %c \n",a,b,ch);
    }

}
