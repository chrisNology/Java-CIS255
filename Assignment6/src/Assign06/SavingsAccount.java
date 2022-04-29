package Assign06;

public class SavingsAccount
{
	private double Balance;      // Account balance
	private double InterestRate;
	private double Interest;

	public SavingsAccount()
	{
		// add code to the constructors
		Balance = 0.0;
	}

	public SavingsAccount(double startBalance)
	{
		// add code to the constructors
		Balance = startBalance;
	}

	/**
    This constructor sets the starting balance
    to the value in the String argument.
    @param str The starting balance, as a String.
    */

	public SavingsAccount(String str)
	{
		Balance = Double.parseDouble(str);
	}

	public double calcInterestRate(double AnnualRate)
	{
		// add code to calculate interest rate
		InterestRate = AnnualRate / 12;
		return InterestRate;
	}

	public double calculateInterest(double IntRate)
	{
		// add code to calculate interest
		Interest = Balance * IntRate;
		return Interest;
	}


	/**
    The deposit method makes a deposit into
    the account.
    @param amount The amount to add to the
    balance field.
    */

	public void Deposit(double Amount)
	{
		Balance += Amount;
	}

	/**
    The deposit method makes a deposit into
    the account.
    @param str The amount to add to the
    balance field, as a String.
    */

	public void Deposit(String str)
	{
		Balance += Double.parseDouble(str);
	}

	/**
    The withdraw method withdraws an amount
    from the account.
    @param amount The amount to subtract from
    the balance field.
    */

	public void Withdraw(double Amount)
	{
		Balance -= Amount;
	}

	/**
    The withdraw method withdraws an amount
    from the account.
    @param str The amount to subtract from
    the balance field, as a String.
    */

	public void Withdraw(String str)
	{
		Balance -= Double.parseDouble(str);
	}

	/**
    The setBalance method sets the account balance.
    @param b The value to store in the balance field.
    */

	public void setBalance(double b)
	{
		Balance = b;
	}

	/**
    The setBalance method sets the account balance.
    @param str The value, as a String, to store in
    the balance field.
    */

	public void setBalance(String str)
	{
		Balance = Double.parseDouble(str);
	}

	/**
    The getBalance method returns the
    account balance.
    @return The value in the balance field.
    */

	public double getBalance()
	{
		return Balance;
	}

}
