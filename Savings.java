
public class Savings {
	private double interestRate;
	
	public Savings(int accountNumber, double interest)
	{
		super();
		setInterestRate(interest);
	}
	
	public void setInterestRate(double interest)
	{
		interestRate = interest;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public int getAccountNumber()
	{
		return getAccountNumber();
	}
	
	public double getBalance()
	{
		return getBalance();
	}
	public String getAccountInfo()
	{
		return("Savings Account Information\nAccount Number: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate() + "%");
	}
}