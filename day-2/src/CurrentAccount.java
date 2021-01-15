
public class CurrentAccount extends Account{
	private String tradeLicenseNumber;
	
	CurrentAccount(String name, double bal)
	{
		super(name,bal);
	}
	
	@Override
	public double getBalance()
	{
		double bal=super.getBalance();
		return bal;
	}
	
	@Override
	public void display()
	{
		double bal=this.getBalance();
		System.out.println("Balance: "+bal);
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(amount>this.getBalance())
		{
			System.out.println("Withdrawal not possible");
		}
		else
		{
			this.setBalance(amount);
		}
	}

}
