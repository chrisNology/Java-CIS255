package Assign06;

import javax.swing.JOptionPane; // For the JOptionPane class
import java.text.DecimalFormat; // For the DecimalFormat class
import java.util.Scanner;

public class testAccount
{

	public static void main(String[] args)
	{
		String input;    // To hold user input
		double balance = 0 , interestRate = 0, annualInterestRate = 0;
		double interest, deposit, withdrawal;
		double totalInterest = 0, totalDeposits = 0, totalWithdrawals = 0;

		int month = 0;
		int repeat = 'Y';

		// Create a DecimalFormat object for displaying dollars
		DecimalFormat dollar = new DecimalFormat("#,###.00");

		// Create Scanner object
        Scanner keyboard = new Scanner(System.in);

		// Get the starting balance.
		do
		{
			input = JOptionPane.showInputDialog("What is your " +
				                    "account's starting balance?");
			balance = Double.parseDouble(input);
		} while (input.length() == 0 || input == "");

		// Create a Savings Account object
		SavingsAccount account = new SavingsAccount(balance);

		// Prompt for Annual Interest Rate
		do
		{
		input = JOptionPane.showInputDialog("What is the " +
                                   "Annual Interest Rate?");
		} while (input.length() == 0 || input == "");

		annualInterestRate = Double.parseDouble(input);
		interestRate = account.calcInterestRate(annualInterestRate);

		// Calculate Interest
		interest = account.calculateInterest(interestRate);

		// Loop while user wants to continue

		while ( repeat=='Y' || repeat == 'y')
		{
			month++;

			// Prompt for the amount of deposit
			do
			{
				input = JOptionPane.showInputDialog("Enter Deposits " +
                        "for Month " + month);
			} while (input.length() == 0 || input == "");
			deposit = Double.parseDouble(input);

			// Add deposit to total deposits
			totalDeposits += deposit;

			// Add Deposit to the account balance.
			account.Deposit(deposit);

			// Check for Withdrawal from the account.
			do
			{
			input = JOptionPane.showInputDialog("Enter Withdrawals " +
                                                "for Month " + month);
			} while (input.length() == 0 || input == "");

			withdrawal = Double.parseDouble(input);

			// Add withdrawal to total withdrawals
			totalWithdrawals += withdrawal;

			// Subtract Withdrawal from Account balance
			account.Withdraw(withdrawal);

			// Add interest to total interest
			totalInterest += interest;

			// Add interest to Account balance
			account.Deposit(interest);

			// Get Account Balance
			balance = account.getBalance();

			// Display the total deposits, total withdrawals, total interest and  balance
			// format as Dollars
			JOptionPane.showMessageDialog(null, "Month " + month +
			"\n\rDeposits " + dollar.format(totalDeposits) +
			"\n\rWithdrawals " + dollar.format(totalWithdrawals) +
			"\n\rInterest " + dollar.format(totalInterest) +
			"\n\rBalance $" + dollar.format(balance));

			// Prompt user to continue
			System.out.println("Calculate Month " + (month+1) + " (Y/N)? ");
			repeat =  keyboard.nextLine().charAt(0);

		}

		System.exit(0);

	}

}
