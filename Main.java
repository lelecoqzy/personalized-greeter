public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet("Leandro"));
        System.out.println(greeter.greet("")); // Testing with an empty string
    }
}
