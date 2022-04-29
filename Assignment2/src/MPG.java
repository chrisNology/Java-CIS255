import java.util.Scanner;

public class MPG {

	public static void main(String[] args)
	{
		// Set the variables
			double milesDriven;  		// Miles driven
	    double gallonsGasUsed;  // Gallons of gas used
	    double mpg;     				// Miles per gallon

	    // Create a Scanner object to read input.
	    Scanner keyboard = new Scanner(System.in);

	    // Get the user's miles driven.
	    System.out.print("How many miles did you drive? ");
	    milesDriven = keyboard.nextDouble();

	    // Get the user's gallons of gas used.
	    System.out.print("How many gallons of gas did you use? ");
	    gallonsGasUsed = keyboard.nextDouble();

	    // Calculate miles per gallon.
	    mpg = milesDriven / gallonsGasUsed;

	    // Display the resulting information.
	    System.out.println("Your MPG is: " + mpg);

	    // Push test! with two-factor auth on Git
	}

}
