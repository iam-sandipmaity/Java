package Program;

interface SampleInterface{
    void meth1();
    void meth2();
}
interface ChildInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements ChildInterface{
    public void meth1() {
        System.out.println("Method1");
    }
    public void meth2() {
        System.out.println("Method2");
    }
    public void meth3() {
        System.out.println("Method3");
    }
    public void meth4() {
        System.out.println("Method4");
    }

}
public class InheritanceInInterface {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
