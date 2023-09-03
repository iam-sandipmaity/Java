//Write a Java Program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade

package Practice_Set;

public class PracticeSet_02 {
    public static void main(String[] args) {
        char grade = 'B';
        //Encrypting The Grade By Adding 8
        grade +=8 ;
       //grade = (char)(grade + 8);
        System.out.println(grade);

        //Decrypting The Grade
        grade -=8 ;
        //grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
