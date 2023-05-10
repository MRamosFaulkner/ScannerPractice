import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Greeting greeting = new Greeting();
        HelloThere helloThere = new HelloThere();
        Superhero superHero = new Superhero();
        VariableInputs variableInputs = new VariableInputs();

        greeting.printGreeting();
        helloThere.printHelloThere();
        superHero.printSuperhero();
        variableInputs.printVariableInputs();
    }
}