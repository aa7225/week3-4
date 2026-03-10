import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input: Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check divisibility using the modulo operator (%)
        String result = (number % 5 == 0) ? "Yes" : "No";
        
        // Output: Print the result in the requested format
        System.out.println("Is the number " + number + " divisible by 5? " + result);
        
        scanner.close();
    }
}
