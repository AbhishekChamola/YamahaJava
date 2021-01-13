
public class BookStore {
private Book[] books;
	
	public BookStore(Book[] books){
		this.books=books;
		
	}
	

	
	void sell(String bookTitle, int noOfCopies) {
		int flag=0;
		for(int i=0; i<5; i++) {
			if (books[i].getBookTitle().equals(bookTitle))
			{
				int c=books[i].getNoOfCopies();
				if(c>=noOfCopies)
				{	
					noOfCopies=c-noOfCopies;
					books[i].setNoOfCopies(noOfCopies);
					books[i].display();
					flag=1;
					break;
				}
				else 
				{
					System.out.println("This much copies not available");
					flag=1;
					break;
				}
		}		  
		}
		if(flag==0)
			System.out.println("NO MATCH FOUND");
	}
	
	void order(String ISBN, int noOfCopies) {
		int flag=0;
		for(int i=0; i<books.length; i++) {
			String isbn=books[i].getISBN();
			if (ISBN.equals(isbn))
			{
				books[i].setNoOfCopies(books[i].getNoOfCopies()+ noOfCopies);
				books[i].display();
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("NOT Found");
				System.out.println("Adding new Book"); 
			
		}
	}
	
	void display() {
		for(int i=0; i<books.length; i++) {
			books[i].display();
		}	
	}

}
