import java.util.Scanner;

public class mpgMethod {

	public static void main(String[] args) {
		// Declare variables
		double mpg, miles = 0, gallons = 0;

		// Create a Scanner object to read input.
	  Scanner keyboard = new Scanner(System.in);

	  // Get the user's miles driven.
	  System.out.print("How many miles did you drive? ");
	  miles = keyboard.nextDouble();

	  // Get the user's gallons of gas used.
	  System.out.print("How many gallons of gas did you use? ");
	  gallons = keyboard.nextDouble();

	  // Closed input to clear leak error
	  keyboard.close();

	  // Call the mpgCalc method, passing the contents of
		// miles and gallons as arguments. Assign the
		// return value to the mpg variable.
		mpg = mpgCalc(miles, gallons);

		// Display the resulting miles per gallon.
	  System.out.println("Your MPG is: " + mpg);

	}

	/**
    The mpgCalc method calculates resulting Miles per gallon.
    @param milesDriven The first number to be added.
    @param gallonsGasUsed The second number to be added.
    @return The result of milesDriven divided by gallonsGasUsed.
    */

	public static double mpgCalc(double milesDriven, double gallonsGasUsed)
	{
		double resultMPG;	// Miles per gallon result

		// Calculate the result Miles per gallon
		resultMPG = milesDriven / gallonsGasUsed;

		// Return the value in the result variable.
		return resultMPG;

	}

}
