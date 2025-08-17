import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a, b, and c
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Perform integer operations considering operator precedence
        int result1 = a + b * c;      // Multiplication before addition
        int result2 = a * b + c;      // Multiplication before addition
        int result3 = c + a / b;      // Division before addition
        int result4 = a % b + c;      // Modulus before addition

        // Print the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        scanner.close();

    }
}
