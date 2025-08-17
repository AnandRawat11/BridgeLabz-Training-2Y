import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for base and height in centimeters
        System.out.print("Enter base of the triangle (cm): ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the triangle (cm): ");
        double height = scanner.nextDouble();

        // Calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert area to square inches (1 inch = 2.54 cm, so 1 sq in = 2.54 * 2.54 sq cm)
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Print the results
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
