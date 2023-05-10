import java.util.Scanner;
public class Superhero {
        public void printSuperhero() {

          Scanner scanner = new Scanner(System.in);
          System.out.println("Let's write a story about a superhero.");
          System.out.println("Who is the hero of our story?");

          String response = scanner.nextLine();
          System.out.println("The hero is: " + response + "\n");
          System.out.println("What is their superpower?");

          String response2 = scanner.nextLine();
          System.out.println("Here is the story: \n");
          System.out.println("There was once a superhero named " + response + ", who had the power of " + response2 + ".\nAs they grew older, " + response + " saw that the world needed them.\n" + response + " used their ability to " + response2 + " to save the world.\n");
        }

}
