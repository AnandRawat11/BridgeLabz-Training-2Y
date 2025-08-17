import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side
        double side = perimeter / 4;

        // Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
