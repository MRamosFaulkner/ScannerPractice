import java.util.Scanner;
public class VariableInputs {
    public void printVariableInputs(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string text: ");
        String text = scanner.nextLine();

        System.out.println("Enter an integer: ");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a double: ");
        double num2 = Double.valueOf(scanner.nextLine());

        System.out.println("Enter a boolean: ");
        boolean value = Boolean.valueOf(scanner.nextLine());

        // Printing all of the data entered
        System.out.println("\nYour string is " + text + ".\nYour integer is " + num + ". \nYour double is " + num2 + ".\nYour boolean is " + value + ".");
    }

}
