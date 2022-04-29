import java.text.DecimalFormat;

/**
This program converts temperatures from 0 - 20 and
outputs the conversions.
*/


public class CentigradeToFahrenheit {

	public static void main(String[] args)
	{

		// Variable declarations
		int count;
		int centigrade = 0;
		double fahrenheit;

		// Start output header

		System.out.println("Centigrade   Fahrenheit");
		System.out.println("----------   ----------");

		// Create a DecimalFormat object.
		DecimalFormat formatter = new DecimalFormat("#0.0");

		// Display the formatted variable contents.
		for (count = 0; count <= 20; count++)
		{
			fahrenheit = 9 * centigrade / 5.0 + 32;

			System.out.println("    " +
			                  centigrade +
			                  "           " +
			                  formatter.format(fahrenheit));

			centigrade++;
		}

	}

}
