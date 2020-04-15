
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double firstOperand;
        double secondOperand;
        int numOperation;

        System.out.print("Enter first operand: ");
        firstOperand = scnr.nextDouble();
        /* User inputs 1st operand*/

        System.out.print("Enter second operand: ");
        secondOperand = scnr.nextDouble();
        /* User inputs 2nd operand*/
        System.out.println("Calculator Menu ");

        System.out.println("--------------- ");

        System.out.println("1. Addition ");

        System.out.println("2. Subtraction ");

        System.out.println("3. Multiplication ");

        System.out.println("4. Division ");
        
        /* Display calculator menu*/

        System.out.print("Which operation do you want to perform? ");

        numOperation = scnr.nextInt();
        /* User inputs command*/

        if (numOperation == 1) {
            System.out.println("The result of the operation is " + (firstOperand + secondOperand) + "." + " Goodbye!");
        }
        else if (numOperation == 2) {
            System.out.println("The result of the operation is " + (firstOperand - secondOperand) + "." + " Goodbye!");
        }
        else if (numOperation == 3) {
            System.out.println("The result of the operation is " + (firstOperand * secondOperand) + "." + " Goodbye!");
        }
        else if (numOperation == 4) {
            System.out.println("The result of the operation is " + (firstOperand / secondOperand) + "." + " Goodbye!");
        }
        else {
            System.out.println("Error: Invalid selection! Terminating program.");
        }
        /* Program outputs the commmand user chose*/
    }
}