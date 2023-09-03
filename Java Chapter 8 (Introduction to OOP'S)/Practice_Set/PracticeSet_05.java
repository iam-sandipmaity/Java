/*
Create a class TommyVecetli for Rockstar Games capable of hitting (print hitting), running , firing etc.

 */

package Practice_Set;

class TommyVecetli{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
            System.out.println("Running from the enemy");
    }
    public void fire(){
            System.out.println("Firing on the enemy");
    }
    public void getDetails(){
        hit();
        run();
        fire();
    }
}

public class PracticeSet_05 {
    public static void main(String[] args) {
        TommyVecetli player1 = new TommyVecetli();
        player1.getDetails();
    }
}
