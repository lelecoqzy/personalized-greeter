import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Greeter greeter = new Greeter();

        System.out.println("--- Personal Greeter ---");
        System.out.print("Please type your name: ");
        String userName = scanner.nextLine();

        System.out.println("Nome lido: " + userName);
        System.out.println(greeter.greet("World")); // Generic greeting

        scanner.close();
    }
}
