import java.util.Scanner;

public class FeetToYardsAndMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Print the results
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        scanner.close();
    }
}