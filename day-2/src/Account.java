import java.util.Random;

public abstract class Account {
	private String memberName;
	private String accountNumber;
	private double accountBalance;
	
	Account(){
		
	}
	public Account(String memberName, double accountBalance)
	{
		this.memberName=memberName;
		this.accountBalance=accountBalance;
		Random rand = new Random(); 
		accountNumber = 10000 + rand.nextInt(89999) + ""; 
		System.out.println("Account Created ");
	}
	public double setBalance(double amount)
	{
		this.accountBalance-=amount;
		System.out.println("Updated balance: "+this.accountBalance);
		return amount;
	}
	public double getBalance()
	{
		double balance=this.accountBalance;
		return balance;
	}
	public void deposit(double amount)
	{
		this.accountBalance+=amount;
	}
	
	public abstract void withdraw(double amt);

	
	public abstract void display();

}




	


