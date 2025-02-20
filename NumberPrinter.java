//Creating a class that implements the Runnable interface
public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        //  Printing numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        // Create an instance of NumberPrinter
        NumberPrinter printer = new NumberPrinter();
        
        // Creating a thread and pass the runnable object to it
        Thread thread = new Thread(printer);
        
        // Start the thread
        thread.start();
    }
}
