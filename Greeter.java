public class Greeter {

    public String greet(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello! Welcome!";
        }
        return "Hello, " + name + "! Welcome!";
    }
}
