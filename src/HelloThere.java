import java.util.Scanner;
public class HelloThere {
    public void printHelloThere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello There! How are you doing today?");

        String response = scanner.nextLine();
        System.out.println("Wow - Interesting! Tell me more about yourself!");

        String response2 = scanner.nextLine();
        System.out.println("Nice chatting with you! Goodbye!\n");
    }
}

