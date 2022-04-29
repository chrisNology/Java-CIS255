import javax.swing.JOptionPane;  // Needed for JOptionPane

/**
   This program asks the user to enter a quantity to
   determine a discount rate based on the quantity ordered.
   The program will output the discount amount and the
   savings after the discount.
*/

public class SoftwareSales
{
	public static void main(String[] args)
	{

		String input;               // To hold the user's input
		int quantity = 0;           // Packages purchased
		double discountPercent = 0; // Discount percent
		double discount = 0;        // totalCost * discountPercent
		double totalCost = 0;       // quantity * retailCost
		double retailCost = 99;     // Cost per package
		double netAmount = 0;       // totalCost - discount

		// Get the quantity from the purchaser.

		input = JOptionPane.showInputDialog("How many packages you " +
		"want so we can show you how much money you saved: ");

		quantity = Integer.parseInt(input);	// Store input as an Integer

		// Display the discount.

		if (quantity >= 100)
			discountPercent = .50;
		else if (quantity >= 50)
			discountPercent = .40;
		else if (quantity >= 20)
			discountPercent = .30;
		else if (quantity >= 10)
			discountPercent = .20;
		else	// Quantity 0 to 9 has no discount
			discountPercent = .00;

		totalCost = quantity * retailCost;
		discount = totalCost * discountPercent;
		netAmount = totalCost - discount;

		System.out.printf("Discount: $%,.0f\n", discount);
		System.out.printf("Total after Discount: $%,.0f", netAmount);

		System.exit(0);
	}
}
