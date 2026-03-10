import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        double bonus = 0;

   
        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("The bonus amount is: " + bonus);

        scanner.close();
    }
}
