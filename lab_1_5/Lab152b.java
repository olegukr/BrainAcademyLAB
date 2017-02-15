import java.util.Scanner;

    /**
     *
     * 1. Write a program which prompts user for the number "x",
     *    reads it from the keyboard, and saves it in an int variable called "x".
     *
     * 2. Then prints "One", "Two",... , "Nine" if the variable "x" is
     *    1, 2,... , 9 and "Other" if x >9, respectively.
     *
     * 3. Use: (a) a "nested-if" statement; (b) a "switch-case" statement.
     *
     * 4. The output shall look like (user input – in green):
     *    -Enter number x: 1
     *    -One
     *
     *    -Enter number x: 12
     *    - Other
     *
     * Created by olegpoberezhets on 21.01.17.
     */
    public class Lab152b {
        public static void main(String[] args) {
            
            System.out.println("Please, enter the number \"x\" from 1 to 9");
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                System.out.println("-Enter number \"x\": " + x);
                System.out.print("-");
                switch (x) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Other");
                }
        }
    }
}