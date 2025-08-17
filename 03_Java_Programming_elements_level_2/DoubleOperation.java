import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a, b, and c as double values
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Perform double operations considering operator precedence
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Print the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        scanner.close();
    }
}
