import java.util.Scanner;
public class Greeting {
    public void printGreeting() {
        Scanner scanner = new Scanner(System.in); //Creates Scanner for user input
        System.out.println("What's your name?"); // Provides text for Scanner to read

        String nameEntered = scanner.nextLine(); // Allows Scanner to read input info
        System.out.println("Hi " + nameEntered + "\n");
    }
}