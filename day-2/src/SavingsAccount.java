
public class SavingsAccount extends Account{
		private int interest;
		private int limit;
		
		SavingsAccount(String name, double bal)
		{
			super(name,bal);
			this.interest=5;
			this.limit=5000;
		}
		@Override
		public double getBalance()
		{
			double bal=super.getBalance();
			bal=bal+bal*interest/100;
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
			if(amount>this.getBalance() && amount>limit)
			{
				System.out.println("Withdrawal not possible");
			}
			else
			{
				this.setBalance(amount);
			}
		}
	}

