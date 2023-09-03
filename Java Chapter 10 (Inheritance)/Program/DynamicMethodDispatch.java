package Program;

class Phone{
    public void showTime(){
        System.out.println("The time is 9 am.");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
    public void music(){
        System.out.println("Playing Music...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone ph = new Phone();
        SmartPhone sph = new SmartPhone();
        Phone obj = new SmartPhone();

        // This will throw an error...but we can use it by typecasting it...
//        SmartPhone obj1 = new Phone();

        //This will invoke derived class(smartphone) function not base class(phone).
        obj.on();

        obj.showTime();

        // This function can't invoke as this is not available in the base class... but we can use it by typecasting it...
//        obj.music();
    }
}
