import java.util.Scanner;

public class BookStoreApp {
	public static void main(String args[])
	{
		int c=1;
		String isbn,title;
		int copies;
		System.out.println("------MENU-----");
		System.out.println("1. Display all the books");
		System.out.println("2. Order a book");
		System.out.println("3. Sell a book ");
		
		Book[] books=new Book[5]; 
		books[0]=new Book("Head First","ABC","12345",2);
		books[1]=new Book("Navathe","DBMS","54321",1);
		books[2]=new Book("Networks","Cormen","98706",2);
		books[3]=new Book("JAVA","GHJ","13579",4);
		books[4]=new Book("Programming","TUSK","67890",3);
		
		BookStore bookStore= new BookStore(books);
		Scanner sc= new Scanner(System.in);
		
		int choice= sc.nextInt();
		sc.nextLine();
			switch(choice) {
			case 1: bookStore.display();
			break;
			case 2: while(c==1) {
					System.out.println("Enter ISBN: ");
					isbn=sc.nextLine();
					System.out.println("Enter number of Copies: ");
					copies=sc.nextInt();
					bookStore.order(isbn,copies);
					System.out.println("Want to order again ? (1/0)");
					c=sc.nextInt();
					}
			break;
			case 3: while(c==1) {
					System.out.println("Enter Title: ");
					title=sc.nextLine();
					System.out.println("Enter number of Copies: ");
					copies=sc.nextInt();
					bookStore.sell(title,copies);
					System.out.println("Want to sell again ? (1/0)");
					c=sc.nextInt();
					sc.nextLine();
					}
					
			break;
			case 0: System.out.println("HAVE A GOOD DAY'");
				    System.exit(0);
			break;
			}
			sc.close();
		}
	}

