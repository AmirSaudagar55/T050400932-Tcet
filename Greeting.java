// Define a functional interface
@FunctionalInterface
interface Sayable {
    // Abstract method to return a greeting message
    String say(String name);
}

public class Greeting {
    public static void main(String[] args) {
        // Using a lambda expression to implement the interface
        Sayable sayable = (name) -> "Hello, " + name + "! Welcome to Java.";

        // Calling the method and print the greeting message
        System.out.println(sayable.say("Amir"));
    }
}
