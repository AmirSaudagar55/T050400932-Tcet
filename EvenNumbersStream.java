import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersStream {
    public static void main(String[] args) {
        // Create a list of integers using Arrays.asList for simplicity
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        //  Java 8 Streams to filter the list for even numbers.
        // The lambda expression (num -> num % 2 == 0) checks if a number is even.
        List<Integer> evenNumbers = numbers.stream()
                                             .filter(num -> num % 2 == 0)
                                             .collect(Collectors.toList());
        
        System.out.println("Even numbers: " + evenNumbers);
    }
}
