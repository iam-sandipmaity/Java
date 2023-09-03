/*
    Create a class TV which implements TVRemote interface From Q.6
 */


package Practice_Set;
interface TVRemote1{
    default void openTV() {
        System.out.println("Opening Tv by Pushing ON Button...");
    }

    default void closeTV() {
        System.out.println("Closing Tv by Pushing OFF Button...");
    }
}
interface SmartTVRemote1 extends TVRemote1{
    default void openTVByTap(){
        System.out.println("Opening Tv by Tapping ON from the digital Screen...");
    }
    default void closeTVByTap(){
        System.out.println("Closing Tv by Tapping OFF from the digital Screen...");
    }

}
class TV implements SmartTVRemote{
    void playMovie(){
        System.out.println("playing Movie...");
    }
}
public class PracticeSet_07 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.openTV();
        tv.closeTV();
        tv.playMovie();
        tv.openTVByTap();
        tv.closeTVByTap();
    }
}
