package finalExamProblems;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticalOne {

	public static void main(String[] args) {
		// Generate 500 random numbers
        int[] randomNumbers = generateRandomNumbers(500);

        // Sort the array of random numbers in ascending order
        Arrays.sort(randomNumbers);

        // prompt user to put a value
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the value of 'N' (1 to 500): ");
            //in case user put a value that is not an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number between 1 and 500.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n < 1 || n > 500) {
                System.out.println("Please enter a number between 1 and 500.");
            }
        } while (n < 1 || n > 500);

        // Find the Nth smallest number
        int nthSmallestNumber = randomNumbers[n - 1];

        System.out.println("The " + n + "th smallest number is: " + nthSmallestNumber);

        // Close scanner
        scanner.close();

	}

    // Method to generate an array of user specified random numbers
    private static int[] generateRandomNumbers(int howMany) {
        Random rand = new Random();
        //creating an array of integers
        int[] numbers = new int[howMany];
        for (int i = 0; i < howMany; i++) {
        	//insert random value in every position till howMany
            numbers[i] = rand.nextInt(2000); // Generating random numbers between 0 and 1999
        }
        return numbers;
    }

}
