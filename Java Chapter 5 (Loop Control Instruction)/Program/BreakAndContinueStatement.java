package Program;

public class BreakAndContinueStatement {
    public static void main(String[] args) {
        // Break Statement
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Loop Is End.");
                break;
            }
        }
            // Continue Statement
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
                if (j == 5) {
                    System.out.println("Loop Skip to 5.");
                    continue;
                }
            }
        }
    }

