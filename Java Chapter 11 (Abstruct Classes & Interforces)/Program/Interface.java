package Program;

interface Bicycle{
    void applyBreak();
    void speedUp();
}
interface HornBicycle{
    void blowHornType1();
    void blowHornType2();
}

class HeroCycle implements Bicycle,HornBicycle{
    @Override
    public void applyBreak() {
        System.out.println("Applying Break...");
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up to the cycle...");
    }

    @Override
    public void blowHornType1() {
        System.out.println("Pee Pee Pee Pee.....");
    }

    @Override
    public void blowHornType2() {
        System.out.println("Poo Poo Poo Poo.....");
    }
    public void nameOfBicycle(){
        System.out.println("I am a Hero Bicycle...");
    }
}

public class Interface {
    public static void main(String[] args) {
        HeroCycle hero = new HeroCycle();
        hero.nameOfBicycle();
        hero.speedUp();
        hero.applyBreak();
        hero.blowHornType1();
        hero.blowHornType2();
    }
}
