import java.util.Scanner;

public class Bank {
	public static void main(String[] a)
	{
		String name, accType;
		double ibal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Enter type of account(Savings/Current) ");
		accType=sc.nextLine();
		System.out.println("Enter initial balance: ");
		ibal=sc.nextDouble();
		sc.nextLine();
		
		Account acc;
		
		if(accType=="Savings")
		{
			acc=new SavingsAccount(name,ibal);
		}
		else
		{
			acc=new CurrentAccount(name,ibal);
		}
		int choice;
		int b=0;
		do{
		System.out.println("-------- MENU --------- ");
		System.out.println("1. Deposit Money ");
		System.out.println("2. Withdraw Money ");
		System.out.println("3. Display Balance ");
		System.out.println("4. EXIT ");
		
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Enter amount: ");
		 		double amt=sc.nextDouble();
				acc.deposit(amt);
				acc.display();
				break;
				
		case 2: System.out.println("Enter amount: ");
 				double ant=sc.nextDouble();
 				acc.withdraw(ant);
 				acc.display();
 				break;
 				
		case 3: acc.display();
				break;
				
		case 4: System.exit(0);
				
		}
	
		System.out.println("Want to continue again ? (1/0)");
		b=sc.nextInt();
		}while(b==1);
		
		}
	}


