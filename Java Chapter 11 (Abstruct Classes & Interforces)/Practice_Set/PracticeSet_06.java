/*
Create an interface TVRemote() and use it to inherit another interface SmartTVRemote().
 */


package Practice_Set;
interface TVRemote{
    default void openTV() {
        System.out.println("Opening Tv by Pushing ON Button...");
    }

    default void closeTV() {
        System.out.println("Closing Tv by Pushing OFF Button...");
    }
}
interface SmartTVRemote extends TVRemote{
    default void openTVByTap(){
        System.out.println("Opening Tv by Tapping ON from the digital Screen...");
    }
    default void closeTVByTap(){
        System.out.println("Closing Tv by Tapping OFF from the digital Screen...");
    }

}
public class PracticeSet_06 {
    public static void main(String[] args) {

    }
}
